package com.likehoop.Adapters;

import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.likehoop.Activity.Search;
import com.likehoop.HelperClasses.ImageViewSmoothScroll;
import com.likehoop.HelperClasses.StaggeredGridViewItem;
import com.likehoop.R;

import java.util.ArrayList;

/**
 * Created by sharan on 3/19/16.
 */
public class Search_Initial_Adapter extends /*BaseAdapter*/StaggeredGridViewItem
{
    Context con;


    View mView;

    int mHeight;

    int image;

//    ArrayList<HashMap<String, String>> list;

//    Constant_Class constant     = new Constant_Class();

    public Search_Initial_Adapter(Context con, int image/*, ArrayList<HashMap<String, String>> list*/)
    {
        this.con = con;
        this.image = image;


//        this.list = list;
    }

   /* @Override
    public int getCount()
    {
        // TODO Auto-generated method stub
        return product_image_list.size();
    }

    @Override
    public Object getItem(int arg0)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int arg0)
    {
        // TODO Auto-generated method stub
        return 0;
    }*/
/*

    @Override
    public View getView(final int position, View row, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        row = inflater.inflate(R.layout.custom_search_initial, parent, false);

        ImageViewSmoothScroll imgv_search_profile =(ImageViewSmoothScroll)row.findViewById(R.id.imgv_search_profile);

        imgv_search_profile.setImageResource(product_image_list.get(position));


        TextView txtv_details = (TextView) row.findViewById(R.id.txtv_details);



        return row;
    }
*/


    @Override
    public View getView(LayoutInflater inflater, ViewGroup parent)
    {
//        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        mView = inflater.inflate(R.layout.custom_search_initial, parent, false);


        ImageViewSmoothScroll imgv_search_profile = (ImageViewSmoothScroll) mView.findViewById(R.id.imgv_search_profile);

        imgv_search_profile.setImageResource(image);



        mView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(con, Search.class);
                i.putExtra("from_where","Search_Initial");
                con.startActivity(i);
            }
        });


        return mView;
    }


    @Override
    public int getViewHeight(LayoutInflater inflater, ViewGroup parent)
    {
        LinearLayout item_containerFrameLayout = (LinearLayout) mView.findViewById(R.id.container);
        item_containerFrameLayout.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        mHeight = item_containerFrameLayout.getMeasuredHeight();
        return mHeight;
    }

}
