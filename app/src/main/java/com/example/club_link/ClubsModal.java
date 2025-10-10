package com.example.club_link;

public class ClubsModal {
    String name;
    String description;
    String imagePath;

    public ClubsModal(String description, String name, String imagePath) {
        this.description = description;
        this.name = name;
        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
