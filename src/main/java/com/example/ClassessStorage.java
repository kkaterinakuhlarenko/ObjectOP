package com.example;

import com.example.models.Review;
import com.example.models.Schedule;
import com.example.models.Ticket;
import com.example.models.park_specified.ParkEntity;
import com.example.models.user_specified.User;

import java.util.ArrayList;
import java.util.List;

public class ClassessStorage {
    public static List<ParkEntity> parkEntities = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List<String> bookings = new ArrayList<>();
    public static List<Review> reviews = new ArrayList<>();
    public static List<Schedule> schedules = new ArrayList<>();
    public static List<Ticket> tickets = new ArrayList<>();

    public static ParkEntity getParkEntityById(Long id) {
        for (ParkEntity pe : parkEntities) {
            if (pe.getId().equals(id)) {
                return pe;
            }
        }
        return null;
    }

    public static User getUserById(Long visitorId) {
        for (User user : users) {
            if (user.getId().equals(visitorId)) {
                return user;
            }
        }
        return null;
    }

    public static Ticket getTicketById(Long ticketId) {
        for (Ticket ticket : tickets) {
            if (ticket.getId().equals(ticketId)) {
                return ticket;
            }
        }
        return null;
    }

    public static Ticket getFirstTicket() {
        if (!tickets.isEmpty()) {
            return tickets.get(0);
        }
        return null;
    }

}
