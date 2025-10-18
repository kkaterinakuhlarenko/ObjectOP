package com.example.models.user_specified;

import com.example.entities.Position;
import com.example.entities.TicketType;
import com.example.entities.UserRole;
import com.example.models.Attraction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Random;

public class User {
    protected int Id;
    protected String FirstName;
    protected String LastName;
    protected int Age;
    private String Email;
    private String Password;
    private UserRole Role;
    @Nullable
    private String PhotoUrl;

    Random rand = new Random();

    public User(String firstName, String lastName, int age, String email, String password, UserRole role, String photoUrl) {
        Id = rand.nextInt();
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Email = email;
        Password = password;
        Role = role;
        PhotoUrl = photoUrl;
    }

    public Staff CreateStaff(Position position, ArrayList<Attraction> assignedAttractions, String workSchedule) {
        return new Staff(FirstName, LastName, Age, Email, Password, Role, PhotoUrl, position, assignedAttractions, workSchedule);
    }

    public Visitor CreateVisitor(ArrayList<TicketType> tickets, ArrayList<String> visitHistory, ArrayList<String> bookings) {
        return new Visitor(FirstName, LastName, Age, Email, Password, Role, PhotoUrl, tickets, visitHistory, bookings);
    }

    public boolean isStaff() {
        return Role == UserRole.STAFF || Role == UserRole.ADMIN;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void changeRole(UserRole newRole) {
        Role = newRole;
    }

    public String getFullName() {
        return String.join(" ", FirstName, LastName);
    }

    public @Nullable String getPhotoUrl() {
        return PhotoUrl;
    }

    public void setPhotoUrl(@NotNull String photoUrl) {
        PhotoUrl = photoUrl;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public UserRole getRole() {
        return Role;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + getId() +
                ", FullName='" + getFullName() + '\'' +
                ", Email='" + getEmail() + '\'' +
                ", Role=" + getRole() +
                '}';
    }
}
