package com.example.myapplication12.view.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.addCallback
import com.bumptech.glide.Glide
import com.example.myapplication12.R
import com.example.myapplication12.model.constant.COMPLEXITY_EASY
import com.example.myapplication12.model.constant.COMPLEXITY_HARD
import com.example.myapplication12.model.constant.COMPLEXITY_MIDDLE
import com.example.myapplication12.model.constant.CURRENT_RESULT
import com.example.myapplication12.model.constant.GAME
import com.example.myapplication12.model.constant.GAME_BASKETBALL
import com.example.myapplication12.model.constant.GAME_COMPLEXITY
import com.example.myapplication12.model.constant.GAME_FOOTBALL
import com.example.myapplication12.model.constant.GAME_HOCKEY
import com.example.myapplication12.model.constant.MAIN
import com.example.myapplication12.model.constant.TIME_SPENT
import com.example.myapplication12.model.constant.listQuestionBasketEasy
import com.example.myapplication12.model.constant.listQuestionBasketHard
import com.example.myapplication12.model.constant.listQuestionBasketMiddle
import com.example.myapplication12.model.constant.listQuestionFootballEasy
import com.example.myapplication12.model.constant.listQuestionFootballHard
import com.example.myapplication12.model.constant.listQuestionFootballMiddle
import com.example.myapplication12.model.constant.listQuestionHockeyEasy
import com.example.myapplication12.model.constant.listQuestionHockeyHard
import com.example.myapplication12.model.constant.listQuestionHockeyMiddle
import com.example.myapplication12.model.constant.mapCorrectAnswerBasketEasy
import com.example.myapplication12.model.constant.mapCorrectAnswerBasketHard
import com.example.myapplication12.model.constant.mapCorrectAnswerBasketMiddle
import com.example.myapplication12.model.constant.mapCorrectAnswerFootballEasy
import com.example.myapplication12.model.constant.mapCorrectAnswerFootballHard
import com.example.myapplication12.model.constant.mapCorrectAnswerFootballMiddle
import com.example.myapplication12.model.constant.mapCorrectAnswerHockeyEasy
import com.example.myapplication12.model.constant.mapCorrectAnswerHockeyHard
import com.example.myapplication12.model.constant.mapCorrectAnswerHockeyMiddle
import com.example.myapplication12.model.constant.mapWrongAnswerBasketEasy
import com.example.myapplication12.model.constant.mapWrongAnswerBasketHard
import com.example.myapplication12.model.constant.mapWrongAnswerBasketMiddle
import com.example.myapplication12.model.constant.mapWrongAnswerFootballEasy
import com.example.myapplication12.model.constant.mapWrongAnswerFootballHard
import com.example.myapplication12.model.constant.mapWrongAnswerFootballMiddle
import com.example.myapplication12.model.constant.mapWrongAnswerHockeyEasy
import com.example.myapplication12.model.constant.mapWrongAnswerHockeyHard
import com.example.myapplication12.model.constant.mapWrongAnswerHockeyMiddle
import com.example.myapplication12.model.constant.url_image_menu1
import com.example.myapplication12.model.constant.url_image_menu2
import com.example.myapplication12.model.constant.url_image_menu3
import com.example.myapplication12.model.constant.url_image_menu4
import com.example.myapplication12.databinding.FragmentGameBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class GameFragment : Fragment() {

    private var binding: FragmentGameBinding? = null
    private var jobTimer:Job = Job()
    private var countSec = 0
    private var level = 1
    private var listMyQuestion = listOf<String>()
    private var mapMyCorrectAnswers = mapOf<String,String>()
    private var mapMyWrongAnswers = mapOf<String,String>()
    private var listRandomNumber = listOf(1,2,3,4)

    private var countCorrectAnswers = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //запуск таймера
        startTimer()

        //загрузка фоновой картинки
        loadBackgroundImage()

        //загрузка вопросов и ответов
        loadQuestion()

        //показ вопроса
        showQuestion()

        //показ ответов
        showAnswers()

        //обработка ответов
        binding?.idGameTvAnswer1?.setOnClickListener {
            updateTextViewLevel()
            checkMyAnswer(binding?.idGameTvAnswer1?.text.toString())
        }

        //обработка ответов
        binding?.idGameTvAnswer2?.setOnClickListener {
            updateTextViewLevel()
            checkMyAnswer(binding?.idGameTvAnswer2?.text.toString())
        }

        //обработка ответов
        binding?.idGameTvAnswer3?.setOnClickListener {
            updateTextViewLevel()
            checkMyAnswer(binding?.idGameTvAnswer3?.text.toString())
        }

        //обработка ответов
        binding?.idGameTvAnswer4?.setOnClickListener {
            updateTextViewLevel()
            checkMyAnswer(binding?.idGameTvAnswer4?.text.toString())
        }

        //обработка выхода
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            stopTimer()
            MAIN.navController?.navigate(R.id.action_gameFragment_to_menuFragment)
        }

    }

    //очистка биндинга при удалении вью
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    //функция запуска таймера
    @SuppressLint("SetTextI18n")
    private fun startTimer() {
        jobTimer = CoroutineScope(Dispatchers.Main).launch {
            while(true){
                delay(1000)
                countSec+=1
                if(countSec%60<=9){
                    binding?.idGameTvTimer?.text = "${countSec/60}:0${countSec%60}"
                }else{
                    binding?.idGameTvTimer?.text = "${countSec/60}:${countSec%60}"
                }
            }
        }
    }

    //функция всплывающего сообщения
    private fun showToast(message:String) = Toast.makeText(requireContext(),message,Toast.LENGTH_SHORT).show()

    //функция остановки таймера
    private fun stopTimer(){
        jobTimer.cancel()
    }

    //функция установки фоновой картинки
    private fun loadBackgroundImage(){
        when(MAIN.getNumberBackgroundImage()){
            1 -> { loadImage(url_image_menu1 , binding?.idGameImg) }
            2 -> { loadImage(url_image_menu2 , binding?.idGameImg) }
            3 -> { loadImage(url_image_menu3 , binding?.idGameImg) }
            4 -> { loadImage(url_image_menu4 , binding?.idGameImg) }
        }
    }

    //функция загрузки изображения
    private fun loadImage(url : String , id : ImageView?) {
        id?.let {
            Glide.with(requireContext())
                .load(url)
                .into(it)
        }
    }

    private fun loadQuestion() {
        when(requireArguments().getString(GAME)) {
            GAME_FOOTBALL -> {
                when(requireArguments().getString(GAME_COMPLEXITY)){
                    COMPLEXITY_EASY -> {
                        listMyQuestion = listQuestionFootballEasy.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerFootballEasy
                        mapMyWrongAnswers = mapWrongAnswerFootballEasy
                    }
                    COMPLEXITY_MIDDLE -> {
                        listMyQuestion = listQuestionFootballMiddle.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerFootballMiddle
                        mapMyWrongAnswers = mapWrongAnswerFootballMiddle
                    }
                    COMPLEXITY_HARD -> {
                        listMyQuestion = listQuestionFootballHard.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerFootballHard
                        mapMyWrongAnswers = mapWrongAnswerFootballHard
                    }
                }
            }
            GAME_BASKETBALL -> {
                when(requireArguments().getString(GAME_COMPLEXITY)){
                    COMPLEXITY_EASY -> {
                        listMyQuestion = listQuestionBasketEasy.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerBasketEasy
                        mapMyWrongAnswers = mapWrongAnswerBasketEasy
                    }
                    COMPLEXITY_MIDDLE -> {
                        listMyQuestion = listQuestionBasketMiddle.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerBasketMiddle
                        mapMyWrongAnswers = mapWrongAnswerBasketMiddle
                    }
                    COMPLEXITY_HARD -> {
                        listMyQuestion = listQuestionBasketHard.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerBasketHard
                        mapMyWrongAnswers = mapWrongAnswerBasketHard
                    }
                }
            }
            GAME_HOCKEY -> {
                when(requireArguments().getString(GAME_COMPLEXITY)){
                    COMPLEXITY_EASY -> {
                        listMyQuestion = listQuestionHockeyEasy.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerHockeyEasy
                        mapMyWrongAnswers = mapWrongAnswerHockeyEasy
                    }
                    COMPLEXITY_MIDDLE -> {
                        listMyQuestion = listQuestionHockeyMiddle.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerHockeyMiddle
                        mapMyWrongAnswers = mapWrongAnswerHockeyMiddle
                    }
                    COMPLEXITY_HARD -> {
                        listMyQuestion = listQuestionHockeyHard.shuffled()
                        mapMyCorrectAnswers = mapCorrectAnswerHockeyHard
                        mapMyWrongAnswers = mapWrongAnswerHockeyHard
                    }
                }
            }
        }
    }

    //функция показа вопроса
    private fun showQuestion() {
        binding?.idGameTvQuestion?.text = listMyQuestion[level-1]
    }

    private fun showAnswers() {
        when(listRandomNumber.shuffled()[0]) {
            1 -> {
                binding?.idGameTvAnswer1?.text = mapMyCorrectAnswers[listMyQuestion[level-1]]
                binding?.idGameTvAnswer2?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong1"]
                binding?.idGameTvAnswer3?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong2"]
                binding?.idGameTvAnswer4?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong3"]
            }
            2 -> {
                binding?.idGameTvAnswer2?.text = mapMyCorrectAnswers[listMyQuestion[level-1]]
                binding?.idGameTvAnswer1?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong1"]
                binding?.idGameTvAnswer3?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong2"]
                binding?.idGameTvAnswer4?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong3"]
            }
            3 -> {
                binding?.idGameTvAnswer4?.text = mapMyCorrectAnswers[listMyQuestion[level-1]]
                binding?.idGameTvAnswer2?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong1"]
                binding?.idGameTvAnswer1?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong2"]
                binding?.idGameTvAnswer3?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong3"]
            }
            4 -> {
                binding?.idGameTvAnswer3?.text = mapMyCorrectAnswers[listMyQuestion[level-1]]
                binding?.idGameTvAnswer2?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong1"]
                binding?.idGameTvAnswer1?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong2"]
                binding?.idGameTvAnswer4?.text = mapMyWrongAnswers[listMyQuestion[level-1]+"wrong3"]
            }
        }
    }

    private fun checkMyAnswer(answer : String) {
        if(answer == mapMyCorrectAnswers[listMyQuestion[level-1]]) {
            //правильно
            showToast("CORRECT!")
            level+=1
            countCorrectAnswers+=1
            if(level<11){
                showQuestion()
                showAnswers()
            }else{
                goToGameOverFragment(requireArguments().getString(GAME).toString(),
                    requireArguments().getString(GAME_COMPLEXITY).toString(),
                    binding!!.idGameTvTimer.text.toString(),
                    countCorrectAnswers)
            }
        }else{
            //неправильно
            showToast("WRONG!")
            level+=1
            if(level<11){
                showQuestion()
                showAnswers()
            }else{
                goToGameOverFragment(requireArguments().getString(GAME).toString(),
                    requireArguments().getString(GAME_COMPLEXITY).toString(),
                    binding?.idGameTvTimer?.text.toString(),
                    countCorrectAnswers)
            }
        }
    }

    private fun goToGameOverFragment(game : String , complexity : String , time : String , result : Int) {
        stopTimer()
        val bundle = Bundle()
        bundle.putString(GAME,game)
        bundle.putString(GAME_COMPLEXITY,complexity)
        bundle.putString(TIME_SPENT,time)
        bundle.putInt(CURRENT_RESULT,result)
        MAIN.navController?.navigate(R.id.action_gameFragment_to_gameOverFragment,bundle)
    }

    @SuppressLint("SetTextI18n")
    private fun updateTextViewLevel(){
        binding?.idGameTvLvl?.text = "$level/10"
    }

}