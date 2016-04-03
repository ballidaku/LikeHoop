package com.likehoop.Activity;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;

import com.likehoop.Activity.FovouriteTab.FavouriteFollowing;
import com.likehoop.Activity.FovouriteTab.FavouriteYou;
import com.likehoop.R;

import java.io.File;


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
        addTab("Home", getResources().getDrawable(R.drawable.selector_home), Search.class);
        addTab("Search", getResources().getDrawable(R.drawable.selector_search), Search_Initial.class);
        addTab("Camera", getResources().getDrawable(R.drawable.selector_search), SignUp.class);
        addTab("Favourite", getResources().getDrawable(R.drawable.selector_favourite), Favourite.class);
        addTab("Profile", getResources().getDrawable(R.drawable.selector_profile), Profile.class);
    }

    private void addTab(String labelId, Drawable drawableId, Class<?> c)
    {
        Intent intent = new Intent(this, c);

        TabHost.TabSpec spec = tabHost.newTabSpec("tab" + labelId);

        View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator_profile, getTabWidget(), false);

        ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
        icon.setImageDrawable(drawableId);
        spec.setIndicator(tabIndicator);

        spec.setContent(intent);
        tabHost.addTab(spec);
    }


    public void open_camera(View view)
    {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);

       /* Bitmap bp = (Bitmap) data.getExtras().get("data");
        iv.setImageBitmap(bp);*/
    }


}
