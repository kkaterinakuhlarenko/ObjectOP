package com.example.models;

import com.example.entities.AttractionType;
import com.example.entities.Status;

public class Attraction {
    public String id;
    public String name;
    public AttractionType type;
    public String description;
    public Status status;
    public String operatingHours;
    public int minAge;
    public int minHeightCm;
    public int capacity;

    public Attraction(String id, String name, AttractionType type, String description,
                      Status status, String operatingHours, int minAge, int minHeightCm, int capacity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.status = status;
        this.operatingHours = operatingHours;
        this.minAge = minAge;
        this.minHeightCm = minHeightCm;
        this.capacity = capacity;
    }

    public void startOperation() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void stopOperation() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean checkAge(int visitorAge) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean checkHeight(int visitorHeightCm) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void assignStaff(Staff staff) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String getInfo() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", operatingHours='" + operatingHours + '\'' +
                ", minAge=" + minAge +
                ", minHeightCm=" + minHeightCm +
                ", capacity=" + capacity +
                '}';
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public AttractionType getType() { return type; }
    public Status getStatus() { return status; }
    public String getOperatingHours() { return operatingHours; }
}
