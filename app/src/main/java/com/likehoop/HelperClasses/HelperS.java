package com.likehoop.HelperClasses;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.likehoop.R;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by sharan on 4/3/16.
 */
public class HelperS
{


    //    Getting All Images Path
    public static ArrayList<String> getAllShownImagesPath(Activity activity)
    {
        Uri uri;
        Cursor cursor;
        int column_index_data, column_index_folder_name;
        ArrayList<String> listOfAllImages = new ArrayList<String>();
        String absolutePathOfImage = null;
        uri = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

        String[] projection = {MediaStore.MediaColumns.DATA,
                MediaStore.Images.Media.BUCKET_DISPLAY_NAME};

        cursor = activity.getContentResolver().query(uri, projection, null,
                null, null);

        column_index_data = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATA);
        column_index_folder_name = cursor
                .getColumnIndexOrThrow(MediaStore.Images.Media.BUCKET_DISPLAY_NAME);
        while (cursor.moveToNext())
        {
            absolutePathOfImage = cursor.getString(column_index_data);

            listOfAllImages.add(absolutePathOfImage);
        }
        return listOfAllImages;
    }

    // Showing image using Glide
    public void setImageGlit(Context con, ImageView imageView, String url)
    {


        Glide.with(con)
                .load(new File(url))
                .placeholder(R.drawable.ic_downloading)
                .error(R.mipmap.no_image)
                .centerCrop()
                .override(180, 180)
                .into(imageView);

    }




}
