package com.bookstore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "alien_data")
public class Alien {

    @Id
    @Column(name="a_Id")
    private int alienId;
    private String alienName;
    @Column(name="Tech")
    private String alienTech;

    public Alien(){}

    public Alien(int alienId, String alienName, String alienTech) {
        this.alienId = alienId;
        this.alienName = alienName;
        this.alienTech = alienTech;
    }

    public int getAlienId() {
        return alienId;
    }

    public void setAlienId(int alienId) {
        this.alienId = alienId;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    public String getAlienTech() {
        return alienTech;
    }

    public void setAlienTech(String alienTech) {
        this.alienTech = alienTech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "alienId=" + alienId +
                ", alienName='" + alienName + '\'' +
                ", alienTech='" + alienTech + '\'' +
                '}';
    }
}
