package com.likehoop.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.likehoop.R;


public class Splash extends AppCompatActivity {



    protected int _splashTime = 2000;
    private Thread splashTread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        splashTread = new Thread()
        {
            @Override
            public
            void run()
            {
                try
                {
                    synchronized (this)
                    {
                        wait(_splashTime);
                    }

                }
                catch (InterruptedException e)
                {
                }
                finally
                {

                  /*  SharedPreferences sp=getSharedPreferences("ETT", Context.MODE_PRIVATE);

                    if(sp.contains("user_id"))
                    {
                        startActivity(new Intent(Splash.this, Main_Tabs.class));
                    }
                    else
                    {*/
                    startActivity(new Intent(Splash.this, MainActivity.class));
//                    }
                    finish();

                }
            }
        };

        splashTread.start();
    }


}
