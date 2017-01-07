package com.f4.letparty.model;

/**
 * Created by OKATA on 1/7/2017.
 */
public class Friend {
    private String name;
    private String imgDirect;
    private String facebookID;
    public Friend(String name,String imgDirect,String facebookID) {
        this.name = name;
        this.imgDirect = imgDirect;
        this.facebookID = facebookID;
    }

    public String getName() {
        return name;
    }
    public String getImgDirect() {
        return imgDirect;
    }

    public String getFacebookID() {
        return facebookID;
    }
}
