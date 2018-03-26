package com.example.android.studyguide;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by mclark on 3/19/18.
 */

public class QuestionAdapter extends RecyclerView.Adapter<QuestionViewHolder> {
    private List<Question> questions;
    private Context context;

    public QuestionAdapter(List<Question> ques, Context context){
        this.questions = ques;
        this.context = context;
    }
    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_country, parent, false);
        return new QuestionViewHolder(view, context);
    }
    @Override
    public void onBindViewHolder(QuestionViewHolder holder, int position){
        Question question = questions.get(position);
        holder.questionCountry.setText(question.location);
        holder.countryQuestion.setText(question.ques);
        holder.countryImage.setImageResource(question.photoId);
        holder.quesIsTrue = question.isTrue();
    }
    @Override
    public int getItemCount(){
        return questions.size();
    }
}
