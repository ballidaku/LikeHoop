package com.likehoop.Activity.FovouriteTab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.likehoop.Adapters.FavouriteFollowing_Adapter;
import com.likehoop.Adapters.Search_Adapter;
import com.likehoop.R;

public class FavouriteFollowing extends Activity
{
    ListView lv_following;

    Context con;
    FavouriteFollowing_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_following);

        con = this;

        setUpIDS();

    }

    public void setUpIDS()
    {
        lv_following=(ListView)findViewById(R.id.lv_following);

        adapter=new FavouriteFollowing_Adapter(con);

        lv_following.setAdapter(adapter);
    }

}
