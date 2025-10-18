package com.example.models.user_specified;

import com.example.entities.Position;
import com.example.entities.UserRole;
import com.example.models.Attraction;
import com.example.models.Schedule;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Staff extends User {
    @Nullable
    private Position position;
    @Nullable
    private List<Attraction> assignedAttractions;
    @Nullable
    private String workSchedule;

    public Staff(String firstName, String lastName, int age,
                 String email, String password, UserRole role, String photoUrl,
                 @Nullable Position position,
                 @Nullable List<Attraction> assignedAttractions,
                 @Nullable String workSchedule) {
        super(firstName, lastName, age, email, password, role, photoUrl);
        this.position = position;
        this.assignedAttractions = assignedAttractions;
        this.workSchedule = workSchedule;
    }

    public void operateAttraction(Attraction attraction) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void performMaintenance(Attraction attraction) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void organizeSchedule(Schedule schedule) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public @Nullable List<Attraction> getAssignedAttractions() {
        return assignedAttractions;
    }

    public @Nullable Position getPosition() {
        return position;
    }

    public void setPosition(@Nullable Position position) {
        this.position = position;
    }

    public void setAssignedAttractions(@Nullable List<Attraction> assignedAttractions) {
        this.assignedAttractions = assignedAttractions;
    }

    public @Nullable String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(@Nullable String workSchedule) {
        this.workSchedule = workSchedule;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + getId() + '\'' +
                ", FullName='" + getFullName() + '\'' +
                ", photoUrl='" + getPhotoUrl() + '\'' +
                ", position=" + getPosition() +
                ", assignedAttractions=" + shortAttractionList(getAssignedAttractions()) +
                ", workSchedule='" + getWorkSchedule() + '\'' +
                '}';
    }

    public String shortAttractionList(List<Attraction> list) {
        if (list == null) return "[]";
        List<String> ids = new ArrayList<>();
        for (Attraction a : list) {
            ids.add(Objects.toString(a.getId(), "null"));
        }
        return ids.toString();
    }
}