package com.example.models;

import com.example.entities.AttractionType;
import com.example.entities.Status;
import com.example.models.user_specified.User;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class Attraction {
    private int id;
    private String name;
    private AttractionType type;
    @Nullable
    private String description;
    private Status status;
    private String operatingHours;
    private int minAge;
    private int minHeightCm;
    private int capacity;

    Random rand = new Random();

    public Attraction(String name, AttractionType type, @Nullable String description,
                      Status status, String operatingHours, int minAge, int minHeightCm, int capacity) {
        this.id = rand.nextInt();
        this.name = name;
        this.type = type;
        this.description = description;
        this.status = status;
        this.operatingHours = operatingHours;
        this.minAge = minAge;
        this.minHeightCm = minHeightCm;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public AttractionType getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(AttractionType type) {
        this.type = type;
    }

    public @Nullable String getDescription() {
        return description;
    }

    public void setDescription(@Nullable String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMinHeightCm() {
        return minHeightCm;
    }

    public void setMinHeightCm(int minHeightCm) {
        this.minHeightCm = minHeightCm;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
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

    public void assignStaff(User staff) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String getInfo() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", type=" + getType() +
                ", description='" + getDescription() + '\'' +
                ", status=" + getStatus() +
                ", operatingHours='" + getOperatingHours() + '\'' +
                ", minAge=" + getMinAge() +
                ", minHeightCm=" + getMinHeightCm() +
                ", capacity=" + getCapacity() +
                '}';
    }
}
