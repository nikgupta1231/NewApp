package com.example.nik.appforecommerce;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Nik on 25-May-2017.
 */

public class SecondFragment extends Fragment {

    TextView textMen, textWomen, textKids, textAll;
    ImageView searchBtn;
    EditText searchText;
    FragmentManager fragmentManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        final Context context = view.getContext();

        fragmentManager=getChildFragmentManager();
        textMen = (TextView) view.findViewById(R.id.searchMen);
        textWomen = (TextView) view.findViewById(R.id.searchWomen);
        textKids = (TextView) view.findViewById(R.id.searchKids);
        textAll = (TextView) view.findViewById(R.id.searchAll);

        searchBtn = (ImageView) view.findViewById(R.id.search_product_button);

        searchText = (EditText) view.findViewById(R.id.search_product);

        textMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(context, "Men Selected", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(context,Main2ActivityMan.class));
            }
        });
        textWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "WoMen Selected", Toast.LENGTH_SHORT).show();
            }
        });
        textKids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Kids Selected", Toast.LENGTH_SHORT).show();
            }
        });
        textAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "All Selected", Toast.LENGTH_SHORT).show();
            }
        });

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(searchText.getText().toString().isEmpty()){
                    Toast.makeText(context, "Error: Field is empty", Toast.LENGTH_SHORT).show();
                }
                if(!searchText.getText().toString().isEmpty()){
                    Toast.makeText(context, "Search "+searchText.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}
