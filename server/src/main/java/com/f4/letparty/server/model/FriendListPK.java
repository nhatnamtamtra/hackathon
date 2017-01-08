package com.f4.letparty.server.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by Dang on 1/7/2017.
 */
@Embeddable
public class FriendListPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="Host_ID", insertable=false, updatable=false)
    private Integer host_id;

    @Column(name="Friend_ID", insertable=false, updatable=false)
    private Integer friend_id;

    public FriendListPK(Integer host_id, Integer friend_id) {
        this.host_id = host_id;
        this.friend_id = friend_id;
    }

    public FriendListPK() {
    }

    public Integer getHost_id() {
        return host_id;
    }

    public void setHost_id(int host_id) {
        this.host_id = host_id;
    }

    public Integer getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(int guest_id) {
        this.friend_id = guest_id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendListPK)) {
            return false;
        }
        FriendListPK castOther = (FriendListPK) other;
        return
                (this.host_id == castOther.host_id)
                        && (this.friend_id == castOther.friend_id);
    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + this.host_id;
        hash = hash * prime + this.friend_id;

        return hash;
    }
}