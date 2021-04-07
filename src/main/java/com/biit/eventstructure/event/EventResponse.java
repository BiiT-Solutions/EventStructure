package com.biit.eventstructure.event;

public abstract class EventResponse extends BasicEvent {

    private String group;
    private String parameter;
    private String category;

    public EventResponse() {
        super();
    }

    public EventResponse(String parameter) {
        super();
        this.parameter = parameter;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
