package com.aq.s19_progressbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

/**
 * Created by lgrpc on 2017/8/29.
 */

public class RatingBarM extends AppCompatActivity {

    private RatingBar rb1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ratingbar);
        rb1 = (RatingBar) findViewById(R.id.rb1);
        rb1.setOnRatingBarChangeListener(new rb1RatingBarListener());

        Button bt1 = (Button) findViewById(R.id.btn_rating1);
        bt1.setOnClickListener(new btn_RatingListener());

    }

    class btn_RatingListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            rb1.setRating(rb1.getRating() + 1.0f);
        }
    }

    class rb1RatingBarListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            System.out.println("rating : " + rating + "\tfromuser " + fromUser);
        }
    }

}
