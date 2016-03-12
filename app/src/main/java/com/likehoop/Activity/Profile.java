package com.likehoop.Activity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.likehoop.Activity.ProfileTab.Followers;
import com.likehoop.Activity.ProfileTab.Following;
import com.likehoop.Activity.ProfileTab.Post;
import com.likehoop.R;

public class Profile extends TabActivity
{
    TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        tabHost = getTabHost();
        setTabs();
    }



    private void setTabs()
    {
        addTab("Post", "25", Post.class);
        addTab("Following","160", Following.class);
        addTab("Followers","90" , Followers.class);

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
}
