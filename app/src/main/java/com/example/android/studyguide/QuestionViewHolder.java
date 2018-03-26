package com.example.android.studyguide;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by mclark on 3/19/18.
 */

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public ImageView countryImage;
    public boolean quesIsTrue;

    public QuestionViewHolder(View view, final Context context){
        super(view);
        cardView = (CardView) view.findViewById(R.id.card_view);
        questionCountry = (TextView) view.findViewById(R.id.country_ques);
        countryQuestion = (TextView) view.findViewById(R.id.country_fact);
        countryImage = (ImageView) view.findViewById(R.id.country_image);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(quesIsTrue) {
                    Toast.makeText(context, R.string.true_button, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(context, R.string.false_button, Toast.LENGTH_SHORT).show();
                }
                }
        });
    }
}
