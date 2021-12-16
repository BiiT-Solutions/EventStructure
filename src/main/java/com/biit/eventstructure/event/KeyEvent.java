package com.biit.eventstructure.event;

import java.time.LocalDateTime;

public class KeyEvent extends BasicEvent {
    private int programId;
    private int journeyId;
    private int projectId;
    private String variable;
    private Object value;

    public KeyEvent() {
        super();
    }

    public KeyEvent(String id, LocalDateTime creationTime, int programId, int journeyId, int projectId, String variable, Object value) {
        super(id, creationTime);
        this.programId = programId;
        this.journeyId = journeyId;
        this.projectId = projectId;
        this.variable = variable;
        this.value = value;
    }

    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    public int getJourneyId() {
        return journeyId;
    }

    public void setJourneyId(int journeyId) {
        this.journeyId = journeyId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return super.toString() + ", programId: '" + getProgramId() + "', journeyId: '" + getJourneyId() +
                "', projectId: '" + getProjectId() + "', variable: '" + getVariable() + "', value: '" + getValue() + "'";
    }
}
