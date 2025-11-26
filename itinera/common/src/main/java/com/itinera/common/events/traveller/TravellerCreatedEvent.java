package com.itinera.common.events.traveller;

public class TravellerCreatedEvent {
    private UUID travellerId;
    private String nickname;
    private Instant createdAt;


    public TravellerCreatedEvent() {}


    public TravellerCreatedEvent(UUID travellerId, String nickname, Instant createdAt) {
        this.travellerId = travellerId;
        this.nickname = nickname;
        this.createdAt = createdAt;
    }


    public UUID getTravellerId() { return travellerId; }
    public void setTravellerId(UUID travellerId) { this.travellerId = travellerId; }


    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }


    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
