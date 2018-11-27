package com.example.faysal.profilecountry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    int[] flags;
    String[] countryname;
    Context context;

   private  LayoutInflater inflator;
    CustomAdapter(Context context,String []countryname,int[] flags)
    {
        this.context=context;
        this.countryname=countryname;
        this.flags=flags;


    }

    @Override
    public int getCount() {

        return countryname.length;
    }

    @Override
    public Object getItem(int position)
    {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            inflator= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflator.inflate(R.layout.samplelayout,parent,false);

        }

        ImageView imageView=convertView.findViewById(R.id.imageviewid);
        TextView textView=convertView.findViewById(R.id.countrynameid);

        imageView.setImageResource(flags[position]);
        textView.setText(countryname[position]);


        return convertView;
    }


}

