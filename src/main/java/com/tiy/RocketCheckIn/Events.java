package com.tiy.RocketCheckIn;

import javax.persistence.*;
@Entity
@Table(name = "events")
public class Events {
    @Id
    @GeneratedValue
    int eventid;

    @Column(nullable = false)
    String eventname;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    String time;

    @Column(nullable = false)
    String description;

}
