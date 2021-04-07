package com.biit.eventstructure.event;

public class EventNumericResponse extends EventResponse {
    private Double value;

    public EventNumericResponse() {
        super();
    }

    public EventNumericResponse(String parameter, Double value) {
        super(parameter);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
