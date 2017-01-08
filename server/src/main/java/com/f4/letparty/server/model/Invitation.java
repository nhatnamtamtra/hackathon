package com.f4.letparty.server.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Dang on 1/7/2017.
 */
@Entity
public class Invitation {
    @Id
    @Column(name="Invitation_ID")
    private int invitation_id;
    @Column(name="Host_ID")
    private int host_id;
    @Column(name="Location")
    private int location_id;
    @Column(name="Time")
    private String time;   //Format: "YYYY-MM-DD HH-MM-SS"

    public Invitation(int invitation_id, int host_id, int location_id, String time) {
        this.invitation_id = invitation_id;
        this.host_id = host_id;
        this.location_id = location_id;
        this.time = time;
    }

    public Invitation() {
    }

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
