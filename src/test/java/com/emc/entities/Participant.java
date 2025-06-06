package com.emc.entities;

public class Participant {

    private Long id;
    private String name;
    private String email;
    private Boolean checkedIn;

    public Participant(Long id, String name, String email, Boolean checkedIn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.checkedIn = checkedIn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Participant{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", checkedIn=").append(checkedIn);
        sb.append('}');
        return sb.toString();
    }
}
