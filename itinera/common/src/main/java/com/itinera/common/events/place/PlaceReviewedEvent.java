package com.itinera.common.events.place;

public class PlaceReviewedEvent {
    private UUID placeId;
    private UUID travellerId;
    private int rating;
    private String review;
    private Instant reviewedAt;


    public PlaceReviewedEvent() {}


    public PlaceReviewedEvent(UUID placeId, UUID travellerId, int rating, String review, Instant reviewedAt) {
        this.placeId = placeId;
        this.travellerId = travellerId;
        this.rating = rating;
        this.review = review;
        this.reviewedAt = reviewedAt;
    }


    public UUID getPlaceId() { return placeId; }
    public void setPlaceId(UUID placeId) { this.placeId = placeId; }


    public UUID getTravellerId() { return travellerId; }
    public void setTravellerId(UUID travellerId) { this.travellerId = travellerId; }


    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating; }


    public String getReview() { return review; }
    public void setReview(String review) { this.review = review; }


    public Instant getReviewedAt() { return reviewedAt; }
    public void setReviewedAt(Instant reviewedAt) { this.reviewedAt = reviewedAt; }
}
