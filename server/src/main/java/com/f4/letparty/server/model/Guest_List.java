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
//@NamedQuery(name="Guest_List.findAll", query="SELECT g FROM guest_list g")
public class Guest_List implements Serializable {
    private static final long serialVersionUID = 1L;

    public Guest_List() {
    }

    @EmbeddedId
    private GuestListPK id;

    @Column(name="is_accepted")
    private String isAccepted;

    //bi-directional many-to-one association to User
    //@ManyToOne
    //@JoinColumn(name="Guest_ID")
    //private User user;

    //bi-directional many-to-one association to Invitation
    //@ManyToOne
    //@JoinColumn(name="Invitation_ID")
   // private Invitation invitation;

    public Guest_List(GuestListPK id, String isAccepted) {
        this.id = id;
        this.isAccepted = isAccepted;
        //this.user = user;
       // this.invitation = invitation;
    }

    public GuestListPK getId() {
        return this.id;
    }

    public void setId(GuestListPK id) {
        this.id = id;
    }

    public String getIsAccepted() {
        return this.isAccepted;
    }

    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }


}