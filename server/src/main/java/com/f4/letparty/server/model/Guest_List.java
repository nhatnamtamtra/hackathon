package com.f4.letparty.server.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the guest_list database table.
 *
 */
@Entity
//@Table(name="guest_list")
//@NamedQuery(name="GuestList.findAll", query="SELECT g FROM GuestList g")
public class Guest_List implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private GuestListPK id;

    @Column(name="is_accepted")
    private String isAccepted;

    public Guest_List(GuestListPK id, String isAccepted) {
        this.id = id;
        this.isAccepted = isAccepted;
    }

    public Guest_List() {
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