package com.itinera.common.events.trip;
public class TripActivityAddedEvent {
private UUID activityId;
private UUID tripId;
private String description;
private Instant addedAt;


public TripActivityAddedEvent() {}


public TripActivityAddedEvent(UUID activityId, UUID tripId, String description, Instant addedAt) {
    this.activityId = activityId;
    this.tripId = tripId;
    this.description = description;
    this.addedAt = addedAt;
}


public UUID getActivityId() { return activityId; }
public void setActivityId(UUID activityId) { this.activityId = activityId; }


public UUID getTripId() { return tripId; }
public void setTripId(UUID tripId) { this.tripId = tripId; }


public String getDescription() { return description; }
public void setDescription(String description) { this.description = description; }


public Instant getAddedAt() { return addedAt; }
public void setAddedAt(Instant addedAt) { this.addedAt = addedAt; }
}
