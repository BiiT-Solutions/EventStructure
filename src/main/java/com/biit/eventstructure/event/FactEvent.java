package com.biit.eventstructure.event;

import java.util.Date;
import java.util.UUID;

public class FactEvent implements IKafkaStorable {

    private String id;

    private String organizationId;

    //Patient Id
    private String tenantId;

    private String tag;

    //Examination Name
    private String group;

    private String value;

    // Id of the entity on the fact
    private String elementId;

    private Date creationTime;

    public FactEvent(String id, Date creationTime) {
        this.id = id;
        this.creationTime = creationTime;
    }

    public FactEvent() {
        this(UUID.randomUUID().toString(), new Date());
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public String getId() {
        return id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    @Override
    public String toString() {
        return "FactEvent{" +
                "id='" + id + '\'' +
                ", organizationId='" + organizationId + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", tag='" + tag + '\'' +
                ", group='" + group + '\'' +
                ", value='" + value + '\'' +
                ", elementId='" + elementId + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }
}
