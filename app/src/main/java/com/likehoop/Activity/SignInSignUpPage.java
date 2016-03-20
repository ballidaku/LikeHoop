

package com.likehoop.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.likehoop.Adapters.ImagePagerAdapter;
import com.likehoop.HelperClasses.AutoScrollViewPager;
import com.likehoop.R;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;

public class SignInSignUpPage extends Activity implements View.OnClickListener
{

    AutoScrollViewPager pager;
    CirclePageIndicator page_indicator;
    private ArrayList<Integer> imageIdList = new ArrayList<>();


    Context con;
    @Override protected
    void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_sign_up_page);

        con=this;

        imageIdList.add(R.mipmap.ic_phone_screen);
        imageIdList.add(R.mipmap.ic_phone_screen);
        imageIdList.add(R.mipmap.ic_phone_screen);

        pager = (AutoScrollViewPager) findViewById(R.id.pager_splash);
        ImagePagerAdapter adapter= new ImagePagerAdapter(con,imageIdList);
        pager.setAdapter(adapter);


        page_indicator = (CirclePageIndicator) findViewById(R.id.indicator);
        page_indicator.setViewPager(pager);


        pager.startAutoScroll(2000);
        pager.setStopScrollWhenTouch(true);
        pager.setAutoScrollDurationFactor(17);



        findViewById(R.id.btn_login).setOnClickListener(this);
        findViewById(R.id.btn_signup).setOnClickListener(this);

    }

    @Override public
    void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_login:

                startActivity(new Intent(con,Login.class));
                finish();
                break;

            case R.id.btn_signup:

                startActivity(new Intent(con,SignUp.class));
                finish();
                break;

            default:
                break;

        }
    }
}
