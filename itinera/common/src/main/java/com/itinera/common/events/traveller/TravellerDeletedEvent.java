package com.itinera.common.events.traveller;

public class TravellerDeletedEvent {
    private UUID travellerId;
    private Instant deletedAt;


    public TravellerDeletedEvent() {}


    public TravellerDeletedEvent(UUID travellerId, Instant deletedAt) {
        this.travellerId = travellerId;
        this.deletedAt = deletedAt;
    }


    public UUID getTravellerId() { return travellerId; }
    public void setTravellerId(UUID travellerId) { this.travellerId = travellerId; }


    public Instant getDeletedAt() { return deletedAt; }
    public void setDeletedAt(Instant deletedAt) { this.deletedAt = deletedAt; }
}
