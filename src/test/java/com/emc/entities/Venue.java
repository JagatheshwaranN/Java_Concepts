package com.emc.entities;

public class Venue {

    public Long id;
    public String name;
    public String description;
    public String street;
    public String city;
    public String state;
    public String country;
    public String pincode;

    public Venue(Long id, String name, String description, String street, String city, String state, String country, String pincode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Venue{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", pincode='").append(pincode).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
