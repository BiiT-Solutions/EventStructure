package com.biit.eventstructure.event;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.LocalDateTime;
import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "class")
public abstract class BasicEvent implements IKafkaStorable {
    private String eventId;
    private LocalDateTime creationTime;

    public BasicEvent(String eventId, LocalDateTime creationTime) {
        this.eventId = eventId;
        this.creationTime = creationTime;
    }

    public BasicEvent() {
        this.eventId = UUID.randomUUID().toString();
        this.creationTime = LocalDateTime.now();
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "id ='" + getEventId() + "', creationTime = '" + getCreationTime() + "'";
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String id) {
        this.eventId = id;
    }
}
