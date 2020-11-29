package com.josemiguel.prosthesisapp.Actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.josemiguel.prosthesisapp.R;


/**
 * Created by Leiner Ceballos on 29/09/2020.
 */
public class SplashActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    startsplash();
                }
            }
        };
        timer.start();
    }

    public void startsplash(){
        Intent IntroIntent = new Intent(this, IntroActivity.class);

        startActivity(IntroIntent);

    }




}
