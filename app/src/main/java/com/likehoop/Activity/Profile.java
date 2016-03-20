package com.likehoop.Activity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.likehoop.Activity.ProfileTab.Followers;
import com.likehoop.Activity.ProfileTab.Following;
import com.likehoop.Activity.ProfileTab.Post;
import com.likehoop.R;

public class Profile extends TabActivity implements View.OnClickListener
{
    TabHost tabHost;
    Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        con = this;

        tabHost = getTabHost();
        setTabs();
        setTabColor();

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener()
        {
            @Override
            public void onTabChanged(String tabId)
            {
                setTabColor();
            }
        });

        findViewById(R.id.imgv_settings).setOnClickListener(this);


    }


    private void setTabs()
    {
        addTab("Post", "25", Following.class);
        addTab("Following", "160", Following.class);
        addTab("Followers", "90", Following.class);

    }

    private void addTab(String labelId, String count, Class<?> c)
    {
        Intent intent = new Intent(this, c);

        TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);

        View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, getTabWidget(), false);

        TextView txtv_count = (TextView) tabIndicator.findViewById(R.id.txtv_count);
        txtv_count.setText(count);
        spec.setIndicator(tabIndicator);

        spec.setContent(intent);
        tabHost.addTab(spec);
    }


    public void setTabColor()
    {
        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++)
        {
            tabHost.getTabWidget().getChildAt(i).setBackgroundColor(con.getResources().getColor(R.color.tab_background_black)); //unselected
        }
        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(getResources().getColor(R.color.tab_background_black_selected)); // selected
    }

    @Override public
    void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imgv_settings:

                startActivity(new Intent(con, Settings.class));

                break;



            default:
                break;

        }
    }


}
