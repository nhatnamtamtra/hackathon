package com.f4.letparty;

/**
 * Created by nhatn on 1/7/2017.
 */

public class Location {
    private String name;
    private String address;
    private float x,y;
    public Location(String name,String address,float x,float y) {
        this.name = name;
        this.address = address;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
