package dev.coderchris.model;

public class DogProfile {
    
    private int dogId;
    private String dogName;
    private String dogBreed;
    private String link;
    
    public DogProfile(int id, String dogName, String dogBreed, String link) {
        this.dogId = id;
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.link = link;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return dogId + " " + dogName + " " + dogBreed;
        
    }

    
}
