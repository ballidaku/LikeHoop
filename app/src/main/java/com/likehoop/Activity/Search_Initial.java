package com.likehoop.Activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import com.likehoop.Adapters.Following_Adapter;
import com.likehoop.Adapters.Search_Initial_Adapter;
import com.likehoop.HelperClasses.StaggeredGridView;
import com.likehoop.R;

import java.util.ArrayList;

public class Search_Initial extends Activity
{

    Context con;
    StaggeredGridView gridView_search;
//    Search_Initial_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__initial);


        con = this;

        setUpIDS();
        setUpViews();
    }


    public void setUpIDS()
    {


        Typeface tf = Typeface.createFromAsset(getAssets(),"Lobster.otf");
        TextView tv = (TextView) findViewById(R.id.txtv_header);
        tv.setTypeface(tf);


        gridView_search = (StaggeredGridView) findViewById(R.id.gridView_search);

        gridView_search.setOnScrollListener(scrollListener);

       /* adapter=new Search_Initial_Adapter(con);

        gridView_search.setAdapter(adapter);*/
    }

    public void setUpViews()
    {

        ArrayList<Integer> product_image_list = new ArrayList<>();

        product_image_list.add(R.mipmap.bike);
        product_image_list.add(R.mipmap.girl);
        product_image_list.add(R.mipmap.girl);
        product_image_list.add(R.mipmap.bike);
        product_image_list.add(R.mipmap.bike);
        product_image_list.add(R.mipmap.girl);
        product_image_list.add(R.mipmap.girl);
        product_image_list.add(R.mipmap.bike);
        product_image_list.add(R.mipmap.girl);
        product_image_list.add(R.mipmap.bike);

        Search_Initial_Adapter item;
        for (int i = 0; i < product_image_list.size(); i++)
        {
            item = new Search_Initial_Adapter(con, product_image_list.get(i));
            gridView_search.addItem(item);
        }
    }


    private StaggeredGridView.OnScrollListener scrollListener = new StaggeredGridView.OnScrollListener()
    {
        public void onTop()
        {
        }

        public void onScroll()
        {

        }

        public void onBottom()
        {
//            loadMoreData();
        }
    };
}
