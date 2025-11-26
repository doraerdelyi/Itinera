package com.itinera.common.events.user;

public class UserRegisteredEvent {
    private UUID userId;
    private String email;
    private String fullName;
    private Instant registeredAt;


    public UserRegisteredEvent() {}


    public UserRegisteredEvent(UUID userId, String email, String fullName, Instant registeredAt) {
        this.userId = userId;
        this.email = email;
        this.fullName = fullName;
        this.registeredAt = registeredAt;
    }


    public UUID getUserId() { return userId; }
    public void setUserId(UUID userId) { this.userId = userId; }


    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }


    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }


    public Instant getRegisteredAt() { return registeredAt; }
    public void setRegisteredAt(Instant registeredAt) { this.registeredAt = registeredAt; }
}
