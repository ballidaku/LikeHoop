package com.likehoop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.likehoop.HelperClasses.HelperS;
import com.likehoop.R;

import java.util.ArrayList;

/**
 * Created by sharan on 4/3/16.
 */
public class GalleryImagesVideos_Adapter extends BaseAdapter
{
    private LayoutInflater infalter;

    ArrayList<String> image_video_path_list;

    HelperS helperS = new HelperS();


    Context con;


    public GalleryImagesVideos_Adapter(Context con, ArrayList<String> image_video_path_list)
    {
        this.con = con;
        infalter = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        this.image_video_path_list = image_video_path_list;


    }

    @Override
    public int getCount()
    {
        return image_video_path_list.size();
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }


    @Override
    public long getItemId(int position)
    {
        return position;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;

        if (convertView == null)
        {
            convertView = infalter.inflate(R.layout.custom_gallery_images_video_adapter, null);

            holder = new ViewHolder();

            holder.imgv_thumbnail = (ImageView) convertView.findViewById(R.id.imgv_thumbnail);
            holder.frame = (TextView) convertView.findViewById(R.id.frame);

            convertView.setTag(holder);
        } else
        {
            holder = (ViewHolder) convertView.getTag();

        }


        helperS.setImageGlit(con, holder.imgv_thumbnail, image_video_path_list.get(position));

        holder.frame.setText("" + position);


        return convertView;
    }

    public class ViewHolder
    {
        ImageView imgv_thumbnail;
        TextView frame;
    }


}
