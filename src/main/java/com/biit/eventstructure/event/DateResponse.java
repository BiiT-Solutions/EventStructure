package com.biit.eventstructure.event;

import java.util.Date;

public class DateResponse extends BasicEvent {
    private String uuid;
    private Date value;
    private String parameter;

    public DateResponse() {
        super();
    }

    public DateResponse(String parameter, Date value) {
        super();
        this.parameter = parameter;
        this.value = value;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getValue() {
        return value;
    }

    public void setValue(Double date) {
        this.value = new Date(date.longValue());
    }

    public void setValue(Date date) {
        this.value = date;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}
