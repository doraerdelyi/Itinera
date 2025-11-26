package com.itinera.common.events.trip;

public class TripCreatedEvent {
    private UUID tripId;
    private UUID travellerId;
    private String title;
    private Instant createdAt;


    public TripCreatedEvent() {}


    public TripCreatedEvent(UUID tripId, UUID travellerId, String title, Instant createdAt) {
        this.tripId = tripId;
        this.travellerId = travellerId;
        this.title = title;
        this.createdAt = createdAt;
    }


    public UUID getTripId() { return tripId; }
    public void setTripId(UUID tripId) { this.tripId = tripId; }


    public UUID getTravellerId() { return travellerId; }
    public void setTravellerId(UUID travellerId) { this.travellerId = travellerId; }


    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }


    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
