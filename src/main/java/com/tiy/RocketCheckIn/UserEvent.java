package com.tiy.RocketCheckIn;

/**
 * Created by Yehia830 on 9/29/16.
 */

import javax.persistence.*;
@Entity
@Table(name = "userevent")
public class UserEvent {
    @OneToMany
    User userAtEvent;

    @OneToMany
    Events events;
}
