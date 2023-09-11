package com.example.myapplication12.view.activity

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.myapplication12.constant.APP_PREFERENCES
import com.example.myapplication12.constant.ID
import com.example.myapplication12.constant.url_image_splash
import com.example.myapplication12.databinding.ActivitySplashBinding
import com.example.myapplication12.viewmodel.SplashViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Locale
import java.util.UUID

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySplashBinding
    private lateinit var rotateAnimation:RotateAnimation
    private var job:Job = Job()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //устновка полноэкранного режима
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val splashViewModel = ViewModelProvider(this)[SplashViewModel::class.java]
        var namePhone = Build.MODEL.toString()
        var locale = Locale.getDefault().getDisplayLanguage().toString()
        var id = ""

        if (getMyId()!=""){
            id = getMyId()
        }else{
            id = UUID.randomUUID().toString()
            setMyId(id)
        }

        //загрузка изображения
        loadImage()

        //создание и запуск анимации загрузки
        startProgressBar()
        splashViewModel.setPostParametersPhone(namePhone,locale,id)

        splashViewModel.webViewUrl.observe(this){ responce ->
            when(responce.body()!!.url){
                "no" -> { goToMainPush() }
                "nopush" -> { goToMainNoPush() }
                else -> { goToWeb(responce.body()!!.url) }
            }
        }


    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        //выход из игры
        job.cancel()
        finishAffinity()
    }

    //функция создания и запуска анимации загрузки
    private fun startProgressBar(){
        val fromDegrees = 0f
        val toDegrees = 360f

        rotateAnimation = RotateAnimation(
            fromDegrees,
            toDegrees,
            Animation.RELATIVE_TO_SELF, 0.5f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )

        binding.idSplashProgress.startAnimation(rotateAnimation)
    }

    //функция остановки анимации загрузки
    private fun clearProgressBar(){
        binding.idSplashProgress.clearAnimation()
    }

    //функция загрузки изображения
    private fun loadImage(){
        Glide.with(this)
            .load(url_image_splash)
            .into(binding.idSplashImg)
    }

    fun getMyId():String{
        var preferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).getString(ID,"")
        return preferences ?: ""
    }

    fun setMyId(id:String){
        var preferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE)
        preferences.edit()
            .putString(ID,id)
            .apply()
    }

    fun goToMainPush() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)
            clearProgressBar()
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
        }
    }

    fun goToMainNoPush() {
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)
            clearProgressBar()
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
        }
    }

    fun goToWeb(url:String) {
        CoroutineScope(Dispatchers.Main).launch {
            delay(3000)
            clearProgressBar()
            var intent = Intent(this@SplashActivity,WebViewActivity::class.java)
            intent.putExtra("url",url)
            startActivity(intent)
        }
    }

}