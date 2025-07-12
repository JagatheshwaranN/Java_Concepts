package com.app.match.model;

public class Interest {

    private int id;
    private String likes;
    private String dislikes;
    private String hobbies;
    private String profileUrl;
    private String about;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getDislikes() {
        return dislikes;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Interest{");
        sb.append("id=").append(id);
        sb.append(", likes='").append(likes).append('\'');
        sb.append(", dislikes='").append(dislikes).append('\'');
        sb.append(", hobbies='").append(hobbies).append('\'');
        sb.append(", profileUrl='").append(profileUrl).append('\'');
        sb.append(", about='").append(about).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
