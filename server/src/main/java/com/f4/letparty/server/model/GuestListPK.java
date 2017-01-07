package com.f4.letparty.server.model;

/**
 * Created by Dang on 1/7/2017.
 */
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the guest_list database table.
 *
 */
@Embeddable
public class GuestListPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="Invitation_ID", insertable=false, updatable=false)
    private int invitation_ID;

    @Column(name="Guest_ID", insertable=false, updatable=false)
    private int guest_ID;

    public GuestListPK(int invitation_ID, int guest_ID) {
        this.invitation_ID = invitation_ID;
        this.guest_ID = guest_ID;
    }

    public GuestListPK() {
    }

    public int getInvitation_ID() {
        return this.invitation_ID;
    }
    public void setInvitation_ID(int invitation_ID) {
        this.invitation_ID = invitation_ID;
    }
    public int getGuest_ID() {
        return this.guest_ID;
    }
    public void setGuest_ID(int guest_ID) {
        this.guest_ID = guest_ID;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestListPK)) {
            return false;
        }
        GuestListPK castOther = (GuestListPK)other;
        return
                (this.invitation_ID == castOther.invitation_ID)
                        && (this.guest_ID == castOther.guest_ID);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.invitation_ID;
        hash = hash * prime + this.guest_ID;

        return hash;
    }
}