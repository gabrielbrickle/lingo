package com.theironyard.entities;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User{
    @GeneratedValue
    @Id
    int id;

    @Column(nullable = false)
    String username;

    @Column(nullable = false)
    String password;


//    @Column(nullable = false)
//    int daysVisited;

    @Column
    String language;

    @Column
    Boolean technology;

    @Column
    Boolean sports;

    @Column
    Boolean business;

    @Column
    Boolean politics;

    @Column
    Boolean arts;

    @Column
    LocalDateTime timestamp;


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getTechnology() {
        return technology;
    }

    public void setTechnology(Boolean technology) {
        this.technology = technology;
    }

    public Boolean getSports() {
        return sports;
    }

    public void setSports(Boolean sports) {
        this.sports = sports;
    }

    public Boolean getBusiness() {
        return business;
    }

    public void setBusiness(Boolean business) {
        this.business = business;
    }

    public Boolean getPolitics() {
        return politics;
    }

    public void setPolitics(Boolean politics) {
        this.politics = politics;
    }

    public Boolean getArts() {
        return arts;
    }

    public void setArts(Boolean arts) {
        this.arts = arts;
    }

    //    public int getDaysVisited() {
//        return daysVisited;
//    }
//
//    public void setDaysVisited(int daysVisited) {
//        this.daysVisited = daysVisited;
//    }
//
//    public int getLastVisited() {
//        return lastVisited;
//    }
//
//    public void setLastVisited(int lastVisited) {
//        this.lastVisited = lastVisited;
//    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
