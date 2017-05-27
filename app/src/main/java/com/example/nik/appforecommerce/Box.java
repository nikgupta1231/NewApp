package com.example.nik.appforecommerce;

import android.graphics.Bitmap;

/**
 * Created by Nik on 26-May-2017.
 */

public class Box {
    private String imageName;
    private Bitmap bitmapImage;

    Box(String imageName, Bitmap bitmapImage) {
        this.imageName = imageName;
        this.bitmapImage = bitmapImage;
    }

    public Bitmap getBitmapImage() {
        return bitmapImage;
    }

    public String getImageName() {
        return imageName;
    }
}
