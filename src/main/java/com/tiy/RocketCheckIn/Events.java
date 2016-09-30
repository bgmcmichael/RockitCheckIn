package com.tiy.RocketCheckIn;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "events")
public class Events {
    @Id
    @GeneratedValue
    int eventid;

    @OneToMany
    List<User> userAtEvents;


    @Column(nullable = false)
    String eventname;

    @Column(nullable = false)
    String location;

    @Column(nullable = false)
    String time;

    @Column(nullable = false)
    String description;

}
