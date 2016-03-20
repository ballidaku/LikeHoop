package com.likehoop.Adapters;

import android.content.Intent;
import android.text.Html;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.likehoop.Activity.Share;
import com.likehoop.R;

/**
 * Created by sharan on 3/12/16.
 */
public class Search_Adapter extends BaseAdapter
{
    Context con;
//    ArrayList<HashMap<String, String>> list;

//    Constant_Class constant     = new Constant_Class();

    public Search_Adapter(Context con/*, ArrayList<HashMap<String, String>> list*/)
    {
        this.con = con;
//        this.list = list;
    }

    @Override
    public int getCount()
    {
        // TODO Auto-generated method stub
        return 7;
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

        row = inflater.inflate(R.layout.custom_search, parent, false);

        TextView txtv_details = (TextView) row.findViewById(R.id.txtv_details);

        String styledText = "<font color='Black' style='font-size:9px;'><b>John Dio </b></font><font color='Gray' style='font-size:4small'> Lorem lpsum is simply dummy text of the printing and typesetting industry</font>";
        txtv_details.setText(Html.fromHtml(styledText));

        ImageView imgv_three_dots  = (ImageView) row.findViewById(R.id.imgv_three_dots);
        imgv_three_dots.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               con.startActivity(new Intent(con, Share.class));
            }
        });

        /*ImageView imgv_marker = (ImageView) row.findViewById(R.id.imgv_marker);
        ImageView imgv_call   = (ImageView) row.findViewById(R.id.imgv_call);
        ImageView imgv_email  = (ImageView) row.findViewById(R.id.imgv_email);

        TextView txtv_city     = (TextView) row.findViewById(R.id.txtv_city);
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
