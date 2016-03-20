package com.likehoop.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.likehoop.R;

public class SignUp extends AppCompatActivity implements View.OnClickListener
{
    Context con;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        con=this;

        setUpIDS();
    }

    private void setUpIDS()
    {
        findViewById(R.id.btn_signup).setOnClickListener(this);
        findViewById(R.id.txtv_signin).setOnClickListener(this);
    }

    @Override public
    void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btn_signup:

                startActivity(new Intent(con,MainActivity.class));
                finish();
                break;

            case R.id.txtv_signin:

                startActivity(new Intent(con,Login.class));
                finish();
                break;

            default:
                break;

        }
    }

}
