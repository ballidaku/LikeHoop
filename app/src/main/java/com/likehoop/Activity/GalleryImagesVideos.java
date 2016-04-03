package com.likehoop.Activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.likehoop.Adapters.GalleryImagesVideos_Adapter;
import com.likehoop.HelperClasses.HelperS;
import com.likehoop.R;

public class GalleryImagesVideos extends Activity
{
    Context con;
    GridView gridview_gallery;
    HelperS helperS=new HelperS();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_images_videos);

        con=this;

        setUpIDS();

        get_show_images_videos();

    }



    private void setUpIDS()
    {
        gridview_gallery=(GridView)findViewById(R.id.gridview_gallery);
    }


    private void get_show_images_videos()
    {

//        Log.e("Images", "" + );

        gridview_gallery.setAdapter(new GalleryImagesVideos_Adapter(con,helperS.getAllShownImagesPath(this)));


    }
}
