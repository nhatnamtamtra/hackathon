package com.f4.letparty.server.model;

import org.springframework.boot.orm.jpa.EntityScan;

/**
 * Created by Dang on 1/7/2017.
 */
@EntityScan
public class Invitation {
    private int invitation_id;
    private int host_id;
    private int location_id;
    private String time;   //Format: "YYYY-MM-DD HH-MM-SS"

    public int getInvitation_id() {
        return invitation_id;
    }

    public void setInvitation_id(int invitation_id) {
        this.invitation_id = invitation_id;
    }

    public int getHost_id() {
        return host_id;
    }

    public void setHost_id(int host_id) {
        this.host_id = host_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "invitation_id=" + invitation_id +
                ", host_id=" + host_id +
                ", location_id=" + location_id +
                ", time='" + time + '\'' +
                '}';
    }
}
