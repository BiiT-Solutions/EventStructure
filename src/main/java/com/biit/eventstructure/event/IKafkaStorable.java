package com.biit.eventstructure.event;

import java.time.LocalDateTime;

public interface IKafkaStorable {

    String getEventId();

    LocalDateTime getCreationTime();

}
