package com.f4.letparty.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Dang on 1/7/2017.
 */
import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the guest_list database table.
 *
 */
@Entity
//@Table(name="friend_list")
//@NamedQuery(name="Friend_List.findAll", query="SELECT g FROM Friend_List g")
public class Friend_List implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private FriendListPK id;
    //private Integer host_id;

    //private Integer friend_id;

    /*public Integer getHost_id() {
        return host_id;
    }

    public void setHost_id(Integer host_id) {
        this.host_id = host_id;
    }

    public Integer getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(Integer friend_id) {
        this.friend_id = friend_id;
    }*/

    public Friend_List() {
    }

    public Friend_List(FriendListPK id ) {
        this.id = id;
        //this.host_id = id.getHost_id();
        //this.friend_id = id.getFriend_id();
    }

    public FriendListPK getId() {
        return id;
    }

    public void setId(FriendListPK id) {
        this.id = id;
    }
}