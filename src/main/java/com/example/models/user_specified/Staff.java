package com.example.models.user_specified;

import com.example.entities.Position;
import com.example.models.Schedule;
import com.example.models.park_specified.ParkEntity;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Staff extends User {

    @Nullable
    private Position position;
    @Nullable
    private List<ParkEntity> assignedParkEntitys;
    @Nullable
    private Schedule workSchedule;

    public Staff(String firstName, String lastName, int age,
                 String email, String password, String photoUrl,
                 @Nullable Position position,
                 @Nullable Schedule workSchedule) {
        super(firstName, lastName, age, email, password, UserRole.STAFF, photoUrl);
        this.position = position;
        this.assignedParkEntitys = new ArrayList<>();
        this.workSchedule = workSchedule;
    }

    public void operateParkEntity(ParkEntity ParkEntity) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void performMaintenance(ParkEntity ParkEntity) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void organizeSchedule(Schedule schedule) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public @Nullable List<ParkEntity> getAssignedParkEntitys() {
        return assignedParkEntitys;
    }

    public @Nullable Position getPosition() {
        return position;
    }

    public void setPosition(@Nullable Position position) {
        this.position = position;
    }

    public void setAssignedParkEntitys(@Nullable List<ParkEntity> assignedParkEntitys) {
        this.assignedParkEntitys = assignedParkEntitys;
    }

    public @Nullable Schedule getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(@Nullable Schedule workSchedule) {
        this.workSchedule = workSchedule;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + getId() + '\'' +
                ", FullName='" + getFullName() + '\'' +
                ", photoUrl='" + getPhotoUrl() + '\'' +
                ", position=" + getPosition() +
                ", assignedParkEntitys=" + shortParkEntityList(getAssignedParkEntitys()) +
                ", workSchedule='" + getWorkSchedule() + '\'' +
                '}';
    }

    public String shortParkEntityList(List<ParkEntity> list) {
        if (list == null) return "[]";
        List<String> ids = new ArrayList<>();
        for (ParkEntity a : list) {
            ids.add(Objects.toString(a.getId(), "null"));
        }
        return ids.toString();
    }
}