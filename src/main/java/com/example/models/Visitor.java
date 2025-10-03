package com.example.models;

import com.example.entities.TicketType;

import java.util.List;

public class Visitor {
    public String id;
    public String name;
    public int age;
    public List<TicketType> tickets;
    public List<String> visitHistory;
    public List<String> bookings;

    public Visitor(String id, String name, int age, List<TicketType> tickets, List<String> visitHistory, List<String> bookings) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tickets = tickets;
        this.visitHistory = visitHistory;
        this.bookings = bookings;
    }

    public void register(String email, String password) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean buyTicket(TicketType type) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean bookAttraction(Attraction attraction, String timeSlot) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public List<String> getHistory() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void leaveReview(Attraction attraction, String reviewText, int rating) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tickets=" + tickets +
                ", visitHistory=" + visitHistory +
                ", bookings=" + bookings +
                '}';
    }
}
