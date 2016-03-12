package com.likehoop.Activity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import android.content.Context;
import com.likehoop.Adapters.Search_Adapter;
import com.likehoop.R;

public class Search extends Activity
{
    Context con;
    ListView lv_search;
    Search_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        con=this;

        setUpIDS();
    }


    public void setUpIDS()
    {
        lv_search=(ListView)findViewById(R.id.lv_search);

        adapter=new Search_Adapter(con);

        lv_search.setAdapter(adapter);
    }

}
