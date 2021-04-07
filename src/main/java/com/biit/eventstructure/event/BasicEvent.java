package com.biit.eventstructure.event;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Date;
import java.util.UUID;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "class")
public abstract class BasicEvent implements IKafkaStorable {
	private String id;
	private Date creationTime;

	public BasicEvent(String id, Date creationTime) {
		this.id = id;
		this.creationTime = creationTime;
	}

	public BasicEvent() {
		this.id = UUID.randomUUID().toString();
		this.creationTime = new Date();
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	@Override
	public String toString() {
		return "id ='" + getId() + "', creationTime = '" + getCreationTime() + "'";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
