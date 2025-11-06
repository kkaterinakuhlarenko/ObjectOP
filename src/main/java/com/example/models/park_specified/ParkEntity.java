package com.example.models.park_specified;

import com.example.entities.AttractionType;
import com.example.entities.Status;
import com.example.models.user_specified.Staff;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParkEntity {
    public static List<Attraction> attractionList = new ArrayList<>();
    public static List<FoodStall> foodStallList = new ArrayList<>();
    public static List<EventArea> eventAreaList = new ArrayList<>();


    protected Long id;
    protected String name;
    protected List<Staff> assignedStaff;
    @Nullable
    protected String description;
    protected Status status;
    protected String operatingHours;

    public ParkEntity(String name, @Nullable String description, String operatingHours) {
        this.id = Math.abs(new Random().nextLong());
        this.name = name;
        this.assignedStaff = new ArrayList<>();
        this.description = description;
        this.status = Status.TEMP_CLOSED;
        this.operatingHours = operatingHours;
    }

    public static ParkEntity createAttraction(String attraction, AttractionType attractionType, String description, String operatingHours, int minAge, int capacity) {
        Attraction newAttraction = new Attraction(attraction, attractionType, description, operatingHours, minAge, capacity);
        attractionList.add(newAttraction);
        return newAttraction;
    }

    public static ParkEntity createFoodStall(String foodStall, String description, String operatingHours) {
        FoodStall newFoodStall = new FoodStall(foodStall, description, operatingHours);
        foodStallList.add(newFoodStall);
        return newFoodStall;
    }

    public static ParkEntity createEventArea(String eventAreaName, String description, String operatingHours,  String positionInPark, LocalDateTime startTime, LocalDateTime endTime) {
        EventArea newEventArea = new EventArea(eventAreaName, description, operatingHours, positionInPark, startTime, endTime);
        eventAreaList.add(newEventArea);
        return newEventArea;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public void startOperation() {
        System.out.println(name + " starting work.");
    }

    public void stopOperation() {
        System.out.println(name + " stopping work.");
    }

    public void assignStaff(Staff staff) {
        System.out.println("Personal " + staff + " assigned to attraction " + name);
        this.assignedStaff.add(staff);
    }

    public List<Staff> getAssignedStaff() {
        return assignedStaff;
    }
    public static Attraction getAttractionById(Long attractionId) {
        for (Attraction attraction : ParkEntity.attractionList) {
            if (attraction.getId().equals(attractionId)) {
                return attraction;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "ParkEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", operatingHours='" + operatingHours + '\'' +
                '}';
    }


}
