package com.example;

import com.example.entities.AttractionType;
import com.example.entities.Status;
import com.example.entities.UserRole;
import com.example.models.Attraction;
import com.example.models.Schedule;
import com.example.models.user_specified.User;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User("John", "doe", 10, "email", "password", UserRole.STAFF, null);

        Attraction attraction = new Attraction(
                "atractionName",
                AttractionType.FAMILY,
                "description",
                Status.OPERATING,
                "10:00-21:00",
                0,
                0,
                40
        );

        Schedule schedule = new Schedule(
                List.of(attraction),
                LocalTime.of(10, 0),
                LocalTime.of(21, 0),
                List.of("se1", "se2")
        );

        User staffUser = user.CreateStaff(null, new ArrayList<>(), null);
        User visitorUser = user.CreateVisitor(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        System.out.println(user.toString());
        System.out.println(staffUser.toString());
        System.out.println(visitorUser.toString());
        System.out.println(attraction);
        System.out.println(schedule);
    }
}