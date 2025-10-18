package com.example.models;

import org.jetbrains.annotations.Nullable;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Schedule {
    private int id;
    @Nullable
    private List<Attraction> attractions;
    private LocalTime startTime;
    private LocalTime endTime;
    @Nullable
    private List<String> specialEvents;

    Random rand = new Random();

    public Schedule(@Nullable List<Attraction> attractions, LocalTime startTime, LocalTime endTime, @Nullable List<String> specialEvents) {
        this.id = rand.nextInt();
        this.attractions = attractions;
        this.startTime = startTime;
        this.endTime = endTime;
        this.specialEvents = specialEvents;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @Nullable List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(@Nullable List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public @Nullable List<String> getSpecialEvents() {
        return specialEvents;
    }

    public void setSpecialEvents(@Nullable List<String> specialEvents) {
        this.specialEvents = specialEvents;
    }

    public void addAttraction(Attraction attraction) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void removeAttraction(Attraction attraction) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String getAttractionWorkingHours(Attraction attraction) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean isAttractionAvailable(Attraction attraction, LocalTime time) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id='" + getId() + '\'' +
                ", attractions=" + shortAttractionList(getAttractions()) +
                ", startTime=" + getStartTime() +
                ", endTime=" + getEndTime() +
                ", specialEvents=" + getSpecialEvents() +
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