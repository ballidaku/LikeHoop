package com.likehoop.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.likehoop.R;

public class EditProfile extends Activity implements View.OnClickListener
{

    Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        con = this;

        setUpIDS();
    }

    public void setUpIDS()
    {


        Typeface tf = Typeface.createFromAsset(getAssets(), "Lobster.otf");
        TextView tv = (TextView) findViewById(R.id.txtv_header);
        tv.setTypeface(tf);
        tv.setText("Edit Profile");

        ImageView imgv_back=(ImageView)findViewById(R.id.imgv_back);
        imgv_back.setVisibility(View.VISIBLE);
        imgv_back.setOnClickListener(this);

//        findViewById(R.id.llay_account).setOnClickListener(this);

    }


    @Override public
    void onClick(View v)
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
