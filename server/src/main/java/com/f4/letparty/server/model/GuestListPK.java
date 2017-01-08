package com.f4.letparty.server.model;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * Created by Dang on 1/7/2017.
 */
public class GuestListPK implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name="Invitation_ID", insertable=false, updatable=false)
    private Integer invitation_id;

    @Column(name="Guest_ID", insertable=false, updatable=false)
    private Integer guest_id;

    public GuestListPK(Integer invitation_id, Integer guest_id) {
        this.invitation_id = invitation_id;
        this.guest_id = guest_id;
    }

    public GuestListPK() {
    }

    public Integer getHost_id() {
        return invitation_id;
    }

    public void setHost_id(int host_id) {
        this.invitation_id = host_id;
    }

    public Integer getFriend_id() {
        return guest_id;
    }

    public void setFriend_id(int guest_id) {
        this.guest_id = guest_id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuestListPK)) {
            return false;
        }
        GuestListPK castOther = (GuestListPK) other;
        return
                (this.invitation_id == castOther.invitation_id)
                        && (this.guest_id == castOther.guest_id);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.invitation_id;
        hash = hash * prime + this.guest_id;

        return hash;
    }
}