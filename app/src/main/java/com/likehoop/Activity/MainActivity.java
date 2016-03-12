package com.likehoop.Activity;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import com.likehoop.R;


public class MainActivity extends TabActivity /*implements OnTabChangeListener*/
{
    TabHost tabHost;

//    int[] images_selected = {R.mipmap.ic_home, R.mipmap.ic_search, R.mipmap.ic_camera, R.mipmap.ic_like_tab, R.mipmap.ic_profile};


    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = getTabHost();
        setTabs();


    }



    private void setTabs()
    {
        addTab("Home", getResources().getDrawable(R.drawable.selector_home), Share.class);
        addTab("Search",getResources().getDrawable(R.drawable.selector_search), Search.class);
        addTab("Camera",getResources().getDrawable(R.drawable.selector_search) , SignUp.class);
        addTab("Favourite",getResources().getDrawable(R.drawable.selector_favourite), SignUp.class);
        addTab("Profile",getResources().getDrawable(R.drawable.selector_profile), SignUp.class);
    }

    private void addTab(String labelId, Drawable drawableId, Class<?> c)
    {
        Intent intent = new Intent(this, c);

        TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);

        View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, getTabWidget(), false);

        ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
        icon.setImageDrawable(drawableId);
        spec.setIndicator(tabIndicator);

        spec.setContent(intent);
        tabHost.addTab(spec);
    }



}
