package com.aq.s19_progressbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

/**
 * Created by lgrpc on 2017/8/29.
 */

public class SeekBarM extends AppCompatActivity {
    private SeekBar sb1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar);
        sb1 = (SeekBar) findViewById(R.id.sb1);

        sb1.setMax(200);
        sb1.setProgress(30);
        sb1.setSecondaryProgress(50);

        sb1.setOnSeekBarChangeListener(new sb1Listerner());
    }

    class sb1Listerner implements SeekBar.OnSeekBarChangeListener {
        /*    *
        seekbar 该对象监控seekbar对象
            * progrecss 是进度
            * fromuser 进度变化是否用户
            * */
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            System.out.println("progress" + progress + "fromuser" + fromUser);

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            System.out.println("onStart");
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            System.out.println("onStop");
        }
    }
}
