package com.frezzcoding.androidinterview.ui.quiz

import com.frezzcoding.androidinterview.R
import com.frezzcoding.androidinterview.ui.BaseFragment

class QuizFragment() : BaseFragment(R.layout.fragment_quiz) {

    override fun initView() {
        runInitialAnimation()
        setListeners()
        setupQuizList()
        showProgressTracker()
    }

    private fun showProgressTracker(){

    }

    private fun setupQuizList(){

    }

    private fun setListeners(){

    }

    private fun runInitialAnimation(){

    }


    /*
    TODO
        top of screen have a progress tracker which can be hidden by user
        show recycler view for the different quizes
        show a lottie loading animation
        show a motion layout animation on the quiz
     */

}