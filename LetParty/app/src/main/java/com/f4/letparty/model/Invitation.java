package com.f4.letparty.model;

/**
 * Created by nhatn on 1/8/2017.
 */

public class Invitation {
    int id;
    int host;
    int location;
    int a;

    public Invitation(int id, int host, int location, int a) {
        this.id = id;
        this.host = host;
        this.location = location;
        this.a = a;
    }

    public int getId() {
        return id;
    }

    public int getHost() {
        return host;
    }

    public int getLocation() {
        return location;
    }

    public int getA() {
        return a;
    }
}
