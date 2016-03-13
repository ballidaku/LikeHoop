package com.likehoop.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.likehoop.R;

/**
 * Created by sharan on 3/13/16.
 */
public class Following_Adapter extends BaseAdapter
{
    Context con;
//    ArrayList<HashMap<String, String>> list;

//    Constant_Class constant     = new Constant_Class();

    int[] images_selected = {R.mipmap.one,
            R.mipmap.two,
            R.mipmap.three,
            R.mipmap.four,
            R.mipmap.five, R.mipmap.one,
            R.mipmap.two,
            R.mipmap.three,
            R.mipmap.four,
            R.mipmap.five, R.mipmap.one,
            R.mipmap.two,
            R.mipmap.three,
            R.mipmap.four,
            R.mipmap.five, R.mipmap.one,
            R.mipmap.two,
            R.mipmap.three,
            R.mipmap.four,
            R.mipmap.ic_more};

    public Following_Adapter(Context con/*, ArrayList<HashMap<String, String>> list*/)
    {
        this.con = con;
//        this.list = list;
    }

    @Override
    public int getCount()
    {
        // TODO Auto-generated method stub
        return 20;
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

        row = inflater.inflate(R.layout.custom_following, parent, false);

        ImageView imgv_following = (ImageView) row.findViewById(R.id.imgv_following);
        TextView txtv_more     = (TextView) row.findViewById(R.id.txtv_more);

        imgv_following.setImageResource(images_selected[position]);


        if(position==19)
        {
            txtv_more.setText("324\nMore");
        }



        /*ImageView imgv_marker = (ImageView) row.findViewById(R.id.imgv_marker);
        ImageView imgv_call   = (ImageView) row.findViewById(R.id.imgv_call);
        ImageView imgv_email  = (ImageView) row.findViewById(R.id.imgv_email);


        TextView txtv_location = (TextView) row.findViewById(R.id.txtv_location);
        TextView txtv_tel      = (TextView) row.findViewById(R.id.txtv_tel);
        TextView txtv_email      = (TextView) row.findViewById(R.id.txtv_email);
        TextView txtv_fax      = (TextView) row.findViewById(R.id.txtv_fax);

        txtv_city.setText(list.get(position).get(Constant_Class.OfficeLocation.City.toString()));
        txtv_location.setText(list.get(position).get(Constant_Class.OfficeLocation.OfficeAddress.toString()));
        txtv_tel.setText("Telephone : " + list.get(position).get(Constant_Class.OfficeLocation.TelephoneNo.toString()));
        txtv_email.setText("Email : "+ list.get(position).get(Constant_Class.OfficeLocation.Email.toString()));
        txtv_fax.setText("Fax : " + list.get(position).get(Constant_Class.OfficeLocation.Fax.toString()));
*/

        return row;
    }

}
