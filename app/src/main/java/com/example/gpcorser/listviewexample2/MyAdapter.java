package com.example.gpcorser.listviewexample2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gpcorser on 10/19/2015.
 */
public class MyAdapter extends ArrayAdapter<String> {
    String [] tvActors;
    public MyAdapter(Context context, String[] values, String [] values2) {
        super(context, R.layout.row_layout2, values);
        this.tvActors = values2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout2, parent, false);

        String tvShow = getItem(position);
        String tvActor = tvActors[position];

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);
        theTextView.setText(tvShow);

        TextView theTextView2 = (TextView) theView.findViewById(R.id.textView2);
        theTextView2.setText(tvActor);

        ImageView theImageView = (ImageView) theView.findViewById(R.id.imageView1);
        theImageView.setImageResource(R.drawable.dott);

        return theView;
    }
}
