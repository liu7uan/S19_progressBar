package com.aq.s19_progressbar;

import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Created by lgrpc on 2017/8/29.
 */

public class progressBarM extends AppCompatActivity{

    private ProgressBar pb1;
    private Button bt1;
    private Button bt2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbarm);
        pb1=(ProgressBar)findViewById(R.id.pb1);
        pb1.setMax(100);
        pb1.setProgress(20);
        pb1.setSecondaryProgress(30);

        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);

        bt1.setOnClickListener(new bt1Listener());
        bt2.setOnClickListener(new bt2Listener());
        //判断为肯定进度条与圆形进度条
        boolean flag=pb1.isIndeterminate();
        System.out.println(flag);
    }
    class bt1Listener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            pb1.incrementProgressBy(10);
        }
    }
    class bt2Listener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            pb1.incrementSecondaryProgressBy(20);
        }
    }
}

