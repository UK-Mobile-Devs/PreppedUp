package com.frezzcoding.androidinterview.ui.quiz

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.frezzcoding.androidinterview.R
import com.frezzcoding.androidinterview.data.models.Quiz
import com.frezzcoding.androidinterview.databinding.CardQuizBinding

class QuizAdapter(private val data: List<Quiz>) : RecyclerView.Adapter<QuizAdapter.ViewHolder>() {

    private lateinit var binding: CardQuizBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        binding = DataBindingUtil.inflate(inflater, R.layout.card_quiz, parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }


    class ViewHolder(binding : CardQuizBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(quiz: Quiz) {

        }

    }


}