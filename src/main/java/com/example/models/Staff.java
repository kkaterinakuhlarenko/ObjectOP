package com.example.models;

import com.example.entities.Position;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Staff {
    public String id;
    public String firstName;
    public String lastName;
    public String photoUrl;
    public Position position;
    public List<Attraction> assignedAttractions;
    public String workSchedule;

    public Staff(String id, String firstName, String lastName, String photoUrl,
                 Position position, List<Attraction> assignedAttractions, String workSchedule) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.photoUrl = photoUrl;
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

    public List<Attraction> getAssignedAttractions() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", position=" + position +
                ", assignedAttractions=" + shortAttractionList(assignedAttractions) +
                ", workSchedule='" + workSchedule + '\'' +
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