package com.example.healthanddietapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
    SurfaceView surfaceView;
    MediaPlayer mediaPlayer;
    Button button;
    SeekBar seekBar;
    private boolean isPaused = false;
    int number = 1;
    int a = 0;
    int b = 0;
    TextView textView;
    TextView textView2;
    TextView textView4;
    TextView textView5;
    MediaPlayer mediaPlayer1;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Intent intent9 = getIntent();
        surfaceView = findViewById(R.id.surfaceView);
        button = findViewById(R.id.button);
        mediaPlayer = MediaPlayer.create(this,R.raw.squat);
        seekBar = findViewById(R.id.seekBar);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button1 = findViewById(R.id.button1);
        surfaceView.setKeepScreenOn(true);
        SurfaceHolder surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                mediaPlayer.setDisplay(surfaceHolder);
            }

            @Override
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

            }

            @Override
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

            }
        });
        seekBar.setMax(mediaPlayer.getDuration());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b)
                {
                    mediaPlayer.seekTo(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                    button.setText("Play");
                }
                else
                {
                    mediaPlayer.start();
                    button.setText("Pause");
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mediaPlayer1 = MediaPlayer.create(MainActivity10.this, R.raw.tictok);
                mediaPlayer1.start();
                isPaused = false;
                CountDownTimer countDownTimer = new CountDownTimer(60000,1000){
                    @Override
                    public void onTick(long l) {
                        Toast.makeText(MainActivity10.this, "Time for squats" , Toast.LENGTH_SHORT).show();
                        String s1 = Integer.toString(a);
                        String s2 = Integer.toString(b);
                        if ((a <= 9) && (b <= 9))
                        {
                            a ++;
                            s1 = Integer.toString(a);
                            textView.setText("0" + s1);
                            textView2.setText("0" + s2);
                        }
                        else if((a > 9) && (a < 59) && (b <= 9))
                        {
                            a ++;
                            s1 = Integer.toString(a);
                            textView.setText(s1);
                            textView2.setText("0" + s2);
                        }
                        else if ((a == 59) && (b <= 9))
                        {
                            b = b + 1;
                            a = 0;
                            s1 = Integer.toString(a);
                            textView.setText("0" + s1);
                            s2 = Integer.toString(b);
                            textView2.setText("0" + s2);
                        }
                        else if ((a <= 9) && (b > 9))
                        {
                            a ++;
                            s1 = Integer.toString(a);
                            textView.setText("0" + s1);
                            textView2.setText(s2);
                        }
                        else if((a > 9) && (a < 59) && (b > 9))
                        {
                            a ++;
                            s1 = Integer.toString(a);
                            textView.setText(s1);
                            textView2.setText(s2);
                        }
                        else if ((a == 59) && (b > 9))
                        {
                            b = b + 1;
                            a = 0;
                            s1 = Integer.toString(a);
                            textView.setText("0" + s1);
                            s2 = Integer.toString(b);
                            textView2.setText(s2);
                        }
                    }

                    @Override
                    public void onFinish() {
                        Toast.makeText(MainActivity10.this, "This is the last toast", Toast.LENGTH_SHORT).show();
                    }
                }.start();
            }
        });
    }
}