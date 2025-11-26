package com.itinera.common.events.trip;

public class TripDeletedEvent {
    private UUID tripId;
    private UUID travellerId;
    private Instant deletedAt;


    public TripDeletedEvent() {}


    public TripDeletedEvent(UUID tripId, UUID travellerId, Instant deletedAt) {
        this.tripId = tripId;
        this.travellerId = travellerId;
        this.deletedAt = deletedAt;
    }


    public UUID getTripId() { return tripId; }
    public void setTripId(UUID tripId) { this.tripId = tripId; }


    public UUID getTravellerId() { return travellerId; }
    public void setTravellerId(UUID travellerId) { this.travellerId = travellerId; }


    public Instant getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Instant deletedAt) { this.deletedAt = deletedAt; }
}
