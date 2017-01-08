package com.f4.letparty.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Dang on 1/7/2017.
 */
@Entity
public class Location {
    @Id
    @Column (name="Location_ID")
    private Integer location_id;
    @Column (name="Name")
    private String name;
    @Column (name="X")
    private float X;
    @Column (name="Y")
    private float Y;
    @Column (name="Address")
    private String address;

    public Location(Integer location_id, String name, float x, float y, String address) {
        this.location_id = location_id;
        this.name = name;
        X = x;
        Y = y;
        this.address = address;
    }

    public Location() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return X;
    }

    public void setX(float x) {
        X = x;
    }

    public float getY() {
        return Y;
    }

    public void setY(float y) {
        Y = y;
    }
}
