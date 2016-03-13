package com.likehoop.Activity.ProfileTab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import com.likehoop.Adapters.Following_Adapter;
import com.likehoop.Adapters.Search_Adapter;
import com.likehoop.R;

public class Following extends Activity
{
    Context con;
    GridView gridView_following;
    Following_Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_following);


        con=this;

        setUpIDS();
    }


    public void setUpIDS()
    {
        gridView_following=(GridView)findViewById(R.id.gridView_following);

        adapter=new Following_Adapter(con);

        gridView_following.setAdapter(adapter);
    }
}
