package com.likehoop.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.Context;
import android.widget.TextView;

import com.likehoop.Adapters.Search_Adapter;
import com.likehoop.R;

public class Search extends Activity implements View.OnClickListener
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

        Typeface tf = Typeface.createFromAsset(getAssets(),"Lobster.otf");
        TextView tv = (TextView) findViewById(R.id.txtv_header);
        tv.setTypeface(tf);


        ImageView imgv_back = (ImageView) findViewById(R.id.imgv_back);
        imgv_back.setOnClickListener(this);

        int i=0;
        try
        {
            if(getIntent().getStringExtra("from_where").equals("Search_Initial"))
            {
                i=1;
                imgv_back.setVisibility(View.VISIBLE);
            }

        }
        catch(Exception e)
        {
        }

        lv_search=(ListView)findViewById(R.id.lv_search);

        adapter=new Search_Adapter(con,i);

        lv_search.setAdapter(adapter);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imgv_back:

                finish();
                break;

          /*  case R.id.llay_account:

                startActivity(new Intent(con, EditProfile.class));
                break;*/

            default:
                break;

        }
    }

}
