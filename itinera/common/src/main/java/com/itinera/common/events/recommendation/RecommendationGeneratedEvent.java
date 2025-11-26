package com.itinera.common.events.recommendation;

public class RecommendationGeneratedEvent {
    private UUID recommendationId;
    private UUID travellerId;
    private String content;
    private Instant generatedAt;


    public RecommendationGeneratedEvent() {}


    public RecommendationGeneratedEvent(UUID recommendationId, UUID travellerId, String content, Instant generatedAt) {
        this.recommendationId = recommendationId;
        this.travellerId = travellerId;
        this.content = content;
        this.generatedAt = generatedAt;
    }


    public UUID getRecommendationId() { return recommendationId; }
    public void setRecommendationId(UUID recommendationId) { this.recommendationId = recommendationId; }


    public UUID getTravellerId() { return travellerId; }
    public void setTravellerId(UUID travellerId) { this.travellerId = travellerId; }


    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }


    public Instant getGeneratedAt() { return generatedAt; }
    public void setGeneratedAt(Instant generatedAt) { this.generatedAt = generatedAt; }
}
