package com.itinera.common.events.trip;

public class TripActivityUpdatedEvent {
    private UUID activityId;
    private UUID tripId;
    private String description;
    private Instant updatedAt;


    public TripActivityUpdatedEvent() {}


    public TripActivityUpdatedEvent(UUID activityId, UUID tripId, String description, Instant updatedAt) {
        this.activityId = activityId;
        this.tripId = tripId;
        this.description = description;
        this.updatedAt = updatedAt;
    }


    public UUID getActivityId() { return activityId; }
    public void setActivityId(UUID activityId) { this.activityId = activityId; }


    public UUID getTripId() { return tripId; }
    public void setTripId(UUID tripId) { this.tripId = tripId; }


    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }


    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
