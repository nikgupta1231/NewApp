package com.example.nik.appforecommerce;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by Nik on 25-May-2017.
 */

public class ThirdFragment extends Fragment {

    EditText pName, bName, pQuantity, pCategory, pPrice, pDiscount, pDescription;
    Spinner pGender, pSize;
    Button uploadImage, sellItem;
    String[] gender = {"Male", "Female", "Kids"}, size = {"S", "M", "L", "XL", "XXL", "XXXL"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        pName = (EditText) view.findViewById(R.id.pName);
        bName = (EditText) view.findViewById(R.id.bName);
        pCategory = (EditText) view.findViewById(R.id.product_category);
        pPrice = (EditText) view.findViewById(R.id.product_price);
        pDiscount = (EditText) view.findViewById(R.id.product_discount);
        pDescription = (EditText) view.findViewById(R.id.product_description);

        pGender = (Spinner) view.findViewById(R.id.gender);
        pSize = (Spinner) view.findViewById(R.id.size);
        pQuantity = (EditText) view.findViewById(R.id.quantity);

        uploadImage = (Button) view.findViewById(R.id.choose_image);
        sellItem = (Button) view.findViewById(R.id.sell);

        //Setting the spinners
        ArrayAdapter<String> aaGender = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, gender);
        pGender.setAdapter(aaGender);
        ArrayAdapter<String> aaSize = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, size);
        pSize.setAdapter(aaSize);
//        pSize.setDropDownVerticalOffset(50);
        pSize.setVerticalScrollBarEnabled(true);


        return view;
    }
}
