package com.itinera.common.events.traveller;

public class TravellerUpdatedEvent {
    private UUID travellerId;
    private String nickname;
    private Instant updatedAt;


    public TravellerUpdatedEvent() {}


    public TravellerUpdatedEvent(UUID travellerId, String nickname, Instant updatedAt) {
        this.travellerId = travellerId;
        this.nickname = nickname;
        this.updatedAt = updatedAt;
    }


    public UUID getTravellerId() { return travellerId; }
    public void setTravellerId(UUID travellerId) { this.travellerId = travellerId; }


    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }


    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
