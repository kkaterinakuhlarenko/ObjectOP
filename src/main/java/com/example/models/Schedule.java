package com.example.models;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Schedule {
    public String id;
    public List<Attraction> attractions;
    public LocalTime startTime;
    public LocalTime endTime;
    public List<String> specialEvents;

    public Schedule(String id, List<Attraction> attractions, LocalTime startTime, LocalTime endTime, List<String> specialEvents) {
        this.id = id;
        this.attractions = attractions;
        this.startTime = startTime;
        this.endTime = endTime;
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
                "id='" + id + '\'' +
                ", attractions=" + shortAttractionList(attractions) +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", specialEvents=" + specialEvents +
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