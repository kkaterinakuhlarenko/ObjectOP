package com.example.models.user_specified;

import com.example.entities.TicketType;
import com.example.entities.UserRole;
import com.example.models.Attraction;
import org.jetbrains.annotations.Nullable;

import java.util.List;

class Visitor extends User {
    @Nullable
    private List<TicketType> tickets;
    @Nullable
    private List<String> visitHistory;
    @Nullable
    private List<String> bookings;

    public Visitor(String firstName, String lastName, int age,
                   String email, String password, UserRole role, String photoUrl,
                   List<TicketType> tickets, List<String> visitHistory, List<String> bookings) {
        super(firstName, lastName, age, email, password, role, photoUrl);
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

    public @Nullable List<TicketType> getTickets() {
        return tickets;
    }

    public void setTickets(@Nullable List<TicketType> tickets) {
        this.tickets = tickets;
    }

    public @Nullable List<String> getVisitHistory() {
        return visitHistory;
    }

    public void setVisitHistory(@Nullable List<String> visitHistory) {
        this.visitHistory = visitHistory;
    }

    public @Nullable List<String> getBookings() {
        return bookings;
    }

    public void setBookings(@Nullable List<String> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id='" + getId() + '\'' +
                ", name='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", tickets=" + getTickets() +
                ", visitHistory=" + getVisitHistory() +
                ", bookings=" + getBookings() +
                '}';
    }
}
