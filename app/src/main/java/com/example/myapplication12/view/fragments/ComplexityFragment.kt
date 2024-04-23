package com.example.myapplication12.view.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.addCallback
import com.bumptech.glide.Glide
import com.example.myapplication12.R
import com.example.myapplication12.model.constant.COMPLEXITY_EASY
import com.example.myapplication12.model.constant.COMPLEXITY_HARD
import com.example.myapplication12.model.constant.COMPLEXITY_MIDDLE
import com.example.myapplication12.model.constant.GAME
import com.example.myapplication12.model.constant.GAME_BASKETBALL
import com.example.myapplication12.model.constant.GAME_COMPLEXITY
import com.example.myapplication12.model.constant.GAME_FOOTBALL
import com.example.myapplication12.model.constant.GAME_HOCKEY
import com.example.myapplication12.model.constant.MAIN
import com.example.myapplication12.model.constant.url_image_basket_ball1
import com.example.myapplication12.model.constant.url_image_basket_ball2
import com.example.myapplication12.model.constant.url_image_basket_ball3
import com.example.myapplication12.model.constant.url_image_football_boll1
import com.example.myapplication12.model.constant.url_image_football_boll2
import com.example.myapplication12.model.constant.url_image_football_boll3
import com.example.myapplication12.model.constant.url_image_hockey_ball1
import com.example.myapplication12.model.constant.url_image_hockey_ball2
import com.example.myapplication12.model.constant.url_image_hockey_ball3
import com.example.myapplication12.model.constant.url_image_menu1
import com.example.myapplication12.model.constant.url_image_menu2
import com.example.myapplication12.model.constant.url_image_menu3
import com.example.myapplication12.model.constant.url_image_menu4
import com.example.myapplication12.databinding.FragmentComplexityBinding

class ComplexityFragment : Fragment() {

    private var binding: FragmentComplexityBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentComplexityBinding.inflate(inflater, container, false)
        return binding?.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //загрузка фоновой картинки
        loadBackgroundImage()

        //загрузка остальных картинок
        checkGameAndLoadImagesAndShowRecords()

        //обработка выхода в меню
        binding!!.idCompButtonBack.setOnClickListener {
            MAIN.navController?.navigate(R.id.action_complexityFragment_to_menuFragment)
        }

        //обработка выхода в меню
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner){
            MAIN.navController?.navigate(R.id.action_complexityFragment_to_menuFragment)
        }

        //выбор сложности+переход к игре
        binding?.idCompIvEasy?.setOnClickListener {
            goToGame(COMPLEXITY_EASY, requireArguments().getString(GAME).toString())
        }
        binding?.idCompIvMiddle?.setOnClickListener {
            goToGame(COMPLEXITY_MIDDLE, requireArguments().getString(GAME).toString())
        }
        binding?.idCompIvHard?.setOnClickListener {
            goToGame(COMPLEXITY_HARD, requireArguments().getString(GAME).toString())
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

    //функция установки фоновой картинки
    private fun loadBackgroundImage() {
        when(MAIN.getNumberBackgroundImage()) {
            1 -> { loadImage(url_image_menu1 , binding?.idCompImg) }
            2 -> { loadImage(url_image_menu2 , binding?.idCompImg) }
            3 -> { loadImage(url_image_menu3 , binding?.idCompImg) }
            4 -> { loadImage(url_image_menu4 , binding?.idCompImg) }
        }
    }

    //функция загрузки картинок
    @SuppressLint("SetTextI18n")
    private fun checkGameAndLoadImagesAndShowRecords() {
        when(requireArguments().getString(GAME)) {
            GAME_FOOTBALL -> {
                loadImage(url_image_football_boll1,binding?.idCompIvEasy)
                loadImage(url_image_football_boll2,binding?.idCompIvMiddle)
                loadImage(url_image_football_boll3,binding?.idCompIvHard)
                binding?.idCompTvEasy?.text   = "Record: ${MAIN.getRecordFootballEasy()}"
                binding?.idCompTvMiddle?.text = "Record: ${MAIN.getRecordFootballMiddle()}"
                binding?.idCompTvHard?.text   = "Record: ${MAIN.getRecordFootballHard()}"
            }
            GAME_BASKETBALL -> {
                loadImage(url_image_basket_ball1,binding?.idCompIvEasy)
                loadImage(url_image_basket_ball2,binding?.idCompIvMiddle)
                loadImage(url_image_basket_ball3,binding?.idCompIvHard)
                binding?.idCompTvEasy?.text   = "Record: ${MAIN.getRecordBasketEasy()}"
                binding?.idCompTvMiddle?.text = "Record: ${MAIN.getRecordBasketMiddle()}"
                binding?.idCompTvHard?.text   = "Record: ${MAIN.getRecordBasketHard()}"
            }
            GAME_HOCKEY -> {
                loadImage(url_image_hockey_ball1,binding?.idCompIvEasy)
                loadImage(url_image_hockey_ball2,binding?.idCompIvMiddle)
                loadImage(url_image_hockey_ball3,binding?.idCompIvHard)
                binding?.idCompTvEasy?.text   = "Record: ${MAIN.getRecordHockeyEasy()}"
                binding?.idCompTvMiddle?.text = "Record: ${MAIN.getRecordHockeyMiddle()}"
                binding?.idCompTvHard?.text   = "Record: ${MAIN.getRecordHockeyHard()}"
            }
        }
    }

    //функция перехода к игре
    private fun goToGame(complexity : String , game : String) {
        val bundle = Bundle()
        bundle.putString(GAME_COMPLEXITY, complexity)
        bundle.putString(GAME, game)
        MAIN.navController?.navigate(R.id.action_complexityFragment_to_gameFragment,bundle)
    }

}