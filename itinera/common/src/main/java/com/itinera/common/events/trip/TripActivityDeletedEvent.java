package com.itinera.common.events.trip;

public class TripActivityDeletedEvent {
    private UUID activityId;
    private UUID tripId;
    private Instant deletedAt;


    public TripActivityDeletedEvent() {}


    public TripActivityDeletedEvent(UUID activityId, UUID tripId, Instant deletedAt) {
        this.activityId = activityId;
        this.tripId = tripId;
        this.deletedAt = deletedAt;
    }


    public UUID getActivityId() { return activityId; }
    public void setActivityId(UUID activityId) { this.activityId = activityId; }


    public UUID getTripId() { return tripId; }
    public void setTripId(UUID tripId) { this.tripId = tripId; }


    public Instant getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Instant deletedAt) { this.deletedAt = deletedAt; }
}
