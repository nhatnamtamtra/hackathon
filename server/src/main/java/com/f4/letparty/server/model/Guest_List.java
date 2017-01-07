package com.f4.letparty.server.model;

/**
 * Created by Dang on 1/7/2017.
 */
public class Guest_List {
    private int invitation_id;
    private int guest_id;

    public int getInvitation_id() {
        return invitation_id;
    }

    public void setInvitation_id(int invitation_id) {
        this.invitation_id = invitation_id;
    }

    public int getGuest_id() {
        return guest_id;
    }

    public void setGuest_id(int guest_id) {
        this.guest_id = guest_id;
    }
}
