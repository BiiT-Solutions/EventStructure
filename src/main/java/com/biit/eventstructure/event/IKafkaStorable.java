package com.biit.eventstructure.event;

import java.util.Date;

public interface IKafkaStorable {
	String getId();

	Date getCreationTime();
}
