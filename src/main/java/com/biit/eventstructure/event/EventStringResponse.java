package com.biit.eventstructure.event;

public class EventStringResponse extends EventResponse {

    private String value;

    public EventStringResponse() {
        super();
    }

    public EventStringResponse(String parameter, String value) {
        super(parameter);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
