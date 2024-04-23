package com.example.myapplication12.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.addCallback
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.example.myapplication12.R
import com.example.myapplication12.model.constant.GAME
import com.example.myapplication12.model.constant.GAME_BASKETBALL
import com.example.myapplication12.model.constant.GAME_FOOTBALL
import com.example.myapplication12.model.constant.GAME_HOCKEY
import com.example.myapplication12.model.constant.MAIN
import com.example.myapplication12.model.constant.url_image_basket_menu
import com.example.myapplication12.model.constant.url_image_football_menu
import com.example.myapplication12.model.constant.url_image_hockey_menu
import com.example.myapplication12.model.constant.url_image_menu1
import com.example.myapplication12.model.constant.url_image_menu2
import com.example.myapplication12.model.constant.url_image_menu3
import com.example.myapplication12.model.constant.url_image_menu4
import com.example.myapplication12.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var binding: FragmentMenuBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding?.root
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        @Suppress("DEPRECATION")
        super.onActivityCreated(savedInstanceState)
        //установка фоновой картинки
        loadBackgroundImage()

        //проверка первого запуска приложения с подачей подсказки
        checkFirstInputInApp()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //загрузка картинок с сервера
        loadImage(url_image_football_menu, binding?.idMenuIvFootball)
        loadImage(url_image_basket_menu, binding?.idMenuIvBasket)
        loadImage(url_image_hockey_menu, binding?.idMenuIvHockey)

        //обработка выхода из игры
        binding?.idMenuButtonExit?.setOnClickListener {
            showExitDialog()
        }

        //обработка выхода из игры
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            showExitDialog()
        }

        //смена заднего фона
        binding!!.idMenuImg.setOnClickListener {
            MAIN.updateNumberBackgroundImage()
            loadBackgroundImage()
            showToast("background changed!","SHORT")
        }

        //переход к игре
        binding?.idMenuIvFootball?.setOnClickListener {
            if(it.id != R.id.id_menu_img) goToComplexityFragment(GAME_FOOTBALL)
        }

        //переход к игре
        binding?.idMenuIvBasket?.setOnClickListener {
            if(it.id != R.id.id_menu_img) goToComplexityFragment(GAME_BASKETBALL)
        }

        //переход к игре
        binding?.idMenuIvHockey?.setOnClickListener {
            if(it.id != R.id.id_menu_img) goToComplexityFragment(GAME_HOCKEY)
        }

        binding?.idMenuTvNameGame?.setOnClickListener {
            if(it.id != R.id.id_menu_img) showToast("-SportsQuiz-","LONG")
        }

    }

    //очистка биндинга при удалении вью
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    //функция загрузки изображения
    private fun loadImage(url : String , id : ImageView?) {
        id?.let {
            Glide.with(requireContext())
                .load(url)
                .into(it)
        }
    }

    //функция показа всплывающего сообщения
    private fun showToast(message : String , time : String) {
        when(time){
            "SHORT" -> { Toast.makeText(requireContext(),message,Toast.LENGTH_SHORT).show() }
            "LONG"  -> { Toast.makeText(requireContext(),message,Toast.LENGTH_LONG).show()  }
        }
    }

    //функция показа диалогового сообщения
    private fun showExitDialog() {
        val options = arrayOf("exit", "cancel")
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("do you want to get out?")
        builder.setItems(options) { dialog, which ->
            when (which) {
                0 -> {
                    MAIN.finishAffinity()
                }
                1 -> {
                    dialog.cancel()
                }
            }
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    //функция установки фоновой картинки
    private fun loadBackgroundImage() {
        when(MAIN.getNumberBackgroundImage()){
            1 -> { loadImage(url_image_menu1,binding?.idMenuImg) }
            2 -> { loadImage(url_image_menu2,binding?.idMenuImg) }
            3 -> { loadImage(url_image_menu3,binding?.idMenuImg) }
            4 -> { loadImage(url_image_menu4,binding?.idMenuImg) }
        }
    }

    //функция перехода к какой-либо игре
    private fun goToComplexityFragment(game : String) {
        val bundle = Bundle()
        bundle.putString(GAME, game)
        MAIN.navController?.navigate(R.id.action_menuFragment_to_complexityFragment,bundle)
    }

    //функция проверки первого запуска игры
    private fun checkFirstInputInApp() {
        if(MAIN.getCountInputInApp() == 0){
            showToast("click on the background to change it","LONG")
            MAIN.updateCountInputInApp()
        }
    }

}