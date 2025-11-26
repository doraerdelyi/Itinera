package com.itinera.common.events.place;

import java.time.Instant;
import java.util.UUID;

public class PlaceCreatedEvent {

        private UUID placeId;
        private String name;
        private Instant createdAt;


        public PlaceCreatedEvent() {}


        public PlaceCreatedEvent(UUID placeId, String name, Instant createdAt) {
            this.placeId = placeId;
            this.name = name;
            this.createdAt = createdAt;
        }


        public UUID getPlaceId() { return placeId; }
        public void setPlaceId(UUID placeId) { this.placeId = placeId; }


        public String getName() { return name; }
        public void setName(String name) { this.name = name; }


        public Instant getCreatedAt() { return createdAt; }
        public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
    }
