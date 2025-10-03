package com.example;

import com.example.entities.AttractionType;
import com.example.entities.Position;
import com.example.entities.Status;
import com.example.entities.TicketType;
import com.example.models.Attraction;
import com.example.models.Schedule;
import com.example.models.Staff;
import com.example.models.Visitor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Attraction attraction = new Attraction(
                "001",
                "atractionName",
                AttractionType.FAMILY,
                "description",
                Status.OPERATING,
                "10:00-21:00",
                0,
                0,
                40
        );

        Visitor visitor = new Visitor(
                "100",
                "name",
                10,
                List.of(TicketType.SINGLE),
                List.of("schedule1"),
                new ArrayList<>()
        );

        Staff staff = new Staff(
                "1",
                "name",
                "lastName",
                "https://example.com/photo.jpg",
                Position.OPERATOR,
                List.of(attraction),
                "workSchedule"
        );

        Schedule schedule = new Schedule(
                "01",
                List.of(attraction),
                LocalTime.of(10, 0),
                LocalTime.of(21, 0),
                List.of("atraction1", "attraction2")
        );

        System.out.println(attraction);
        System.out.println(visitor);
        System.out.println(staff);
        System.out.println(schedule);
    }
}