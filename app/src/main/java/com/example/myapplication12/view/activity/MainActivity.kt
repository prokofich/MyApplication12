package com.example.myapplication12.view.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.myapplication12.R
import com.example.myapplication12.model.constant.APP_PREFERENCES
import com.example.myapplication12.model.constant.COUNT_INPUT_IN_APP
import com.example.myapplication12.model.constant.MAIN
import com.example.myapplication12.model.constant.NUMBER_BACKGROUND_IMAGE
import com.example.myapplication12.model.constant.RECORD_BASKET_EASY
import com.example.myapplication12.model.constant.RECORD_BASKET_HARD
import com.example.myapplication12.model.constant.RECORD_BASKET_MIDDLE
import com.example.myapplication12.model.constant.RECORD_FOOTBALL_EASY
import com.example.myapplication12.model.constant.RECORD_FOOTBALL_HARD
import com.example.myapplication12.model.constant.RECORD_FOOTBALL_MIDDLE
import com.example.myapplication12.model.constant.RECORD_HOCKEY_EASY
import com.example.myapplication12.model.constant.RECORD_HOCKEY_HARD
import com.example.myapplication12.model.constant.RECORD_HOCKEY_MIDDLE

class MainActivity : AppCompatActivity() {

    var navController : NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MAIN = this
        navController = Navigation.findNavController(this,R.id.id_nav_host)

    }

    //функция получения номера картинки для фона
    fun getNumberBackgroundImage() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(NUMBER_BACKGROUND_IMAGE,1)
    }

    //функция получения количества запусков приложения
    fun getCountInputInApp() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(COUNT_INPUT_IN_APP,0)
    }

    //обновление количества запусков приложения
    fun updateCountInputInApp() {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(COUNT_INPUT_IN_APP,getCountInputInApp()+1).apply()
    }

    //функция установки номера новой картинки для фона
    fun updateNumberBackgroundImage(){
        val lastNumber = getNumberBackgroundImage()
        if(lastNumber == 4){
            getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(NUMBER_BACKGROUND_IMAGE,1).apply()
        }else{
            getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(NUMBER_BACKGROUND_IMAGE,lastNumber+1).apply()
        }

    }

    fun getRecordFootballEasy() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_FOOTBALL_EASY,0)
    }

    fun getRecordFootballMiddle() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_FOOTBALL_MIDDLE,0)
    }

    fun getRecordFootballHard() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_FOOTBALL_HARD,0)
    }

    fun getRecordBasketEasy() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_BASKET_EASY,0)
    }

    fun getRecordBasketMiddle() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_BASKET_MIDDLE,0)
    }

    fun getRecordBasketHard() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_BASKET_HARD,0)
    }

    fun getRecordHockeyEasy() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_HOCKEY_EASY,0)
    }

    fun getRecordHockeyMiddle() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_HOCKEY_MIDDLE,0)
    }

    fun getRecordHockeyHard() : Int {
        return getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE).getInt(RECORD_HOCKEY_HARD,0)
    }

    fun updateRecordFootballEasy(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_FOOTBALL_EASY,record).apply()
    }

    fun updateRecordFootballMiddle(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_FOOTBALL_MIDDLE,record).apply()
    }

    fun updateRecordFootballHard(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_FOOTBALL_HARD,record).apply()
    }

    fun updateRecordBasketEasy(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_BASKET_EASY,record).apply()
    }

    fun updateRecordBasketMiddle(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_BASKET_MIDDLE,record).apply()
    }

    fun updateRecordBasketHard(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_BASKET_HARD,record).apply()
    }

    fun updateRecordHockeyEasy(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_HOCKEY_EASY,record).apply()
    }

    fun updateRecordHockeyMiddle(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_HOCKEY_MIDDLE,record).apply()
    }

    fun updateRecordHockeyHard(record : Int) {
        getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE).edit().putInt(RECORD_HOCKEY_HARD,record).apply()
    }

}