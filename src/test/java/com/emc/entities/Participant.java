package com.emc.entities;

public class Participant {

    public Long id;
    public String name;
    public String email;
    public Boolean checkedIn;

    public Participant(Long id, String name, String email, Boolean checkedIn) {
        this.id = id;
        this.name = name;
        this.email = email;
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
