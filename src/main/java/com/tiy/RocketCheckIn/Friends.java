package com.tiy.RocketCheckIn;

import javax.persistence.*;
@Entity
@Table(name = "friends")
public class Friends {

    @ManyToOne
    User user;

    @ManyToOne
    User userfriend;



}
