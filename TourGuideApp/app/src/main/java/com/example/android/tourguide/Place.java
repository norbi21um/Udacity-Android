package com.example.android.tourguide;

/**
 * Created by norbi21um on 2018. 08. 13..
 */

public class Place {
    private String name;
    private String address;
    private int imageResouceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Place(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Place(String name, String address, int imageResouceId) {
        this.name = name;
        this.address = address;
        this.imageResouceId = imageResouceId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getImageResouceId() {
        return imageResouceId;
    }

    public boolean hasImage() {
        return imageResouceId != NO_IMAGE_PROVIDED;
    }
}
