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
import com.example.myapplication12.model.constant.url_image_bronza_medal
import com.example.myapplication12.model.constant.url_image_gold_medal
import com.example.myapplication12.model.constant.url_image_pedestal
import com.example.myapplication12.model.constant.url_image_serebro_medal
import com.example.myapplication12.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {

    private var binding: FragmentGameOverBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameOverBinding.inflate(inflater, container, false)
        return binding?.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //загрузка картинок и показ текста
        checkResultAndLoadImage()

        //загрузка картинки с сервера
        loadImage(url_image_pedestal,binding?.idGameoverIvPedestal)

        //показ потраченного времени
        binding?.idGameoverTvTime?.text = "you did it in ${requireArguments().getString(TIME_SPENT)} min"

        //возврат в меню
        binding?.idGameoverButtonMenu?.setOnClickListener {
            MAIN.navController?.navigate(R.id.action_gameOverFragment_to_menuFragment)
        }

        //рестарт игры
        binding?.idGameoverButtonRestart?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(GAME,requireArguments().getString(GAME))
            bundle.putString(GAME_COMPLEXITY,requireArguments().getString(GAME_COMPLEXITY))
            MAIN.navController?.navigate(R.id.action_gameOverFragment_to_gameFragment,bundle)
        }

        //обработка выхода
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            MAIN.navController?.navigate(R.id.action_gameOverFragment_to_menuFragment)
        }

        checkUpdateRecords()

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
    private fun showToast(message:String) = Toast.makeText(requireContext(),message, Toast.LENGTH_LONG).show()

    //функция проверки и отображения результата
    @SuppressLint("SetTextI18n")
    private fun checkResultAndLoadImage(){
        when(requireArguments().getInt(CURRENT_RESULT)){
            0,1,2,3 -> {
                loadImage(url_image_bronza_medal,binding?.idGameoverIvMedal)
                showToast("Results: ${requireArguments().getInt(CURRENT_RESULT)}, badly")
                binding?.idGameoverTvResults?.text = "Results: ${requireArguments().getInt(CURRENT_RESULT)}/10 , badly"
            }
            4,5,6,7 -> {
                loadImage(url_image_serebro_medal,binding?.idGameoverIvMedal)
                showToast("Results: ${requireArguments().getInt(CURRENT_RESULT)}, not bad")
                binding?.idGameoverTvResults?.text = "Results: ${requireArguments().getInt(CURRENT_RESULT)}/10 , not bad"
            }
            8,9,10  -> {
                loadImage(url_image_gold_medal,binding?.idGameoverIvMedal)
                showToast("Results: ${requireArguments().getInt(CURRENT_RESULT)}, super")
                binding?.idGameoverTvResults?.text = "Results: ${requireArguments().getInt(CURRENT_RESULT)}/10 , super"
            }
        }
    }

    private fun checkUpdateRecords(){
        when(requireArguments().getString(GAME)){
            GAME_FOOTBALL -> {
                when(requireArguments().getString(GAME_COMPLEXITY)){
                    COMPLEXITY_EASY -> {
                        if(requireArguments().getInt(CURRENT_RESULT)> MAIN.getRecordFootballEasy()){
                            MAIN.updateRecordFootballEasy(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                    COMPLEXITY_MIDDLE -> {
                        if(requireArguments().getInt(CURRENT_RESULT)> MAIN.getRecordFootballMiddle()){
                            MAIN.updateRecordFootballMiddle(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                    COMPLEXITY_HARD -> {
                        if(requireArguments().getInt(CURRENT_RESULT)> MAIN.getRecordFootballHard()){
                            MAIN.updateRecordFootballHard(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                }
            }
            GAME_BASKETBALL -> {
                when(requireArguments().getString(GAME_COMPLEXITY)){
                    COMPLEXITY_EASY -> {
                        if(requireArguments().getInt(CURRENT_RESULT) > MAIN.getRecordBasketEasy()){
                            MAIN.updateRecordBasketEasy(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                    COMPLEXITY_MIDDLE -> {
                        if(requireArguments().getInt(CURRENT_RESULT) > MAIN.getRecordBasketMiddle()){
                            MAIN.updateRecordBasketMiddle(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                    COMPLEXITY_HARD -> {
                        if(requireArguments().getInt(CURRENT_RESULT) > MAIN.getRecordBasketHard()){
                            MAIN.updateRecordBasketHard(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                }
            }
            GAME_HOCKEY -> {
                when(requireArguments().getString(GAME_COMPLEXITY)){
                    COMPLEXITY_EASY -> {
                        if(requireArguments().getInt(CURRENT_RESULT) > MAIN.getRecordHockeyEasy()){
                            MAIN.updateRecordHockeyEasy(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                    COMPLEXITY_MIDDLE -> {
                        if(requireArguments().getInt(CURRENT_RESULT) > MAIN.getRecordHockeyMiddle()){
                            MAIN.updateRecordHockeyMiddle(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                    COMPLEXITY_HARD -> {
                        if(requireArguments().getInt(CURRENT_RESULT) > MAIN.getRecordHockeyHard()){
                            MAIN.updateRecordHockeyHard(requireArguments().getInt(CURRENT_RESULT))
                            showToast("--NEW RECORD--")
                        }
                    }
                }
            }
        }
    }

}