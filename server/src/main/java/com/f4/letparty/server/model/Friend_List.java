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
@Table(name="guest_list")
//@NamedQuery(name="Friend_List.findAll", query="SELECT g FROM friend_list g")
public class Friend_List implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private FriendListPK id;

    //bi-directional many-to-one association to User
    //@ManyToOne
   // @JoinColumn(name="Host_ID")
   // private User host;

    //bi-directional many-to-one association to Invitation
   // @ManyToOne
  //  @JoinColumn(name="Friend_ID")
   // private User friend;

    public Friend_List() {
    }

    public Friend_List(FriendListPK id ) {
        this.id = id;
       // this.host = host;
     //   this.friend = friend;
    }

    public FriendListPK getId() {
        return id;
    }

    public void setId(FriendListPK id) {
        this.id = id;
    }
}