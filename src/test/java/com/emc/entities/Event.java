package com.emc.entities;

public class Event {

    public Long id;
    public String name;
    public String description;
    public String startDate;
    public String endDate;
    public Boolean started;

    public Event(Long id, String name, String description, String startDate, String endDate, Boolean started) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.started = started;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Event{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", startDate='").append(startDate).append('\'');
        sb.append(", endDate='").append(endDate).append('\'');
        sb.append(", started=").append(started);
        sb.append('}');
        return sb.toString();
    }

}
