package com.example.nik.appforecommerce;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nik on 26-May-2017.
 */

public class BoxAdapter extends ArrayAdapter<Box> {
    public BoxAdapter(Context context, ArrayList<Box> resource) {
        super(context, 0, resource);
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
//            LayoutInflater layoutInflater  = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.container_main, parent, false);
        }

        Box item = getItem(position);
        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
        TextView text = (TextView) convertView.findViewById(R.id.textView);

        if (item != null) {
            image.setImageBitmap(item.getBitmapImage());
            text.setText(item.getImageName());
        }
        return convertView;
    }
}
