package com.likehoop.Activity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.likehoop.Activity.FovouriteTab.FavouriteFollowing;
import com.likehoop.Activity.FovouriteTab.FavouriteYou;
import com.likehoop.Activity.ProfileTab.Following;
import com.likehoop.R;

public class Favourite extends TabActivity
{
    TabHost tabHost;
    Context con;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        con = this;

        tabHost = getTabHost();
        setTabs();
        tabHost.getTabWidget().setDividerDrawable(getResources().getDrawable(R.mipmap.ic_blue_divider));
//        setTabColor();

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener()
        {
            @Override
            public void onTabChanged(String tabId)
            {
//                setTabColor();
            }
        });
    }



    private void setTabs()
    {
        Typeface tf = Typeface.createFromAsset(getAssets(),"Lobster.otf");
        TextView tv = (TextView) findViewById(R.id.txtv_header);
        tv.setTypeface(tf);

        addTab("FOLLOWING", FavouriteFollowing.class);
        addTab("YOU", FavouriteFollowing.class);

    }

    private void addTab(String labelId, Class<?> c)
    {
        Intent intent = new Intent(this, c);

        TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);

        View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator_favourite, getTabWidget(), false);

        LinearLayout llay_fav=(LinearLayout)tabIndicator.findViewById(R.id.llay_fav);
        TextView txtv_tabname = (TextView) tabIndicator.findViewById(R.id.txtv_tabname);
        txtv_tabname.setText(labelId);

        llay_fav.setBackgroundDrawable(getResources().getDrawable(R.drawable.selector_fav));
        spec.setIndicator(tabIndicator);

        spec.setContent(intent);
        tabHost.addTab(spec);
    }


    public  void setTabColor()
    {
        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++)
        {
            tabHost.getTabWidget().getChildAt(i).setBackgroundColor(con.getResources().getColor(R.color.GrayTabLight)); //unselected
        }
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(getResources().getColor(R.color.GrayTabDark)); // selected
    }
}
