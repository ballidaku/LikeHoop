package com.likehoop.Adapters;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.likehoop.R;

/**
 * Created by sharan on 3/15/16.
 */
public class FavouriteFollowing_Adapter  extends BaseAdapter
{
    Context con;
//    ArrayList<HashMap<String, String>> list;

//    Constant_Class constant     = new Constant_Class();

    int[] images_left = {R.mipmap.six,
            R.mipmap.eight,
            R.mipmap.six,
            R.mipmap.eight,
            R.mipmap.six,
            R.mipmap.eight,
            R.mipmap.six,
            R.mipmap.eight,
            R.mipmap.six,
            R.mipmap.eight};


    int[] images_right = {R.mipmap.seven,
            R.mipmap.nine,
            R.mipmap.seven,
            R.mipmap.nine,
            R.mipmap.seven,
            R.mipmap.nine,
            R.mipmap.seven,
            R.mipmap.nine,
            R.mipmap.seven,
            R.mipmap.nine};

    public FavouriteFollowing_Adapter(Context con/*, ArrayList<HashMap<String, String>> list*/)
    {
        this.con = con;
//        this.list = list;
    }

    @Override
    public int getCount()
    {
        // TODO Auto-generated method stub
        return 10;
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
    }

    @Override
    public View getView(final int position, View row, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) con.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        row = inflater.inflate(R.layout.custom_favouritefollowing, parent, false);

        ImageView imgv_left = (ImageView) row.findViewById(R.id.imgv_left);
        ImageView imgv_right = (ImageView) row.findViewById(R.id.imgv_right);
        TextView txtv_text     = (TextView) row.findViewById(R.id.txtv_text);
        TextView txtv_time     = (TextView) row.findViewById(R.id.txtv_time);


        imgv_left.setImageResource(images_left[position]);
        imgv_right.setImageResource(images_right[position]);

        String styledText = "<font color='#00ADC9' size='1'><b>STACY MARTIN </b></font><font color='Gray' size='1'> liked </font><font color='#00ADC9' size='1'><b>ROMAN GRAVRAS </b></font><font color='Gray' size='1'> Blazer </font>";
        txtv_text.setText(Html.fromHtml(styledText));



        return row;
    }

}
