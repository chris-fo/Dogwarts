package dev.coderchris.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dev.coderchris.model.DogProfile;

@Repository
public class DogProfileRepository implements CrudRepository{

    @Override
    public List<DogProfile> findAll() {
        // TODO: make instance variable?
        List<DogProfile> profiles = new ArrayList<>();
        profiles = new ArrayList<>();
        DogProfile kaya = new DogProfile(1,
            "Kaya", 
            "Shepherd-Mix", 
            "https://www.coder-chris.com");
        
        profiles.add(kaya);
        return profiles;
    }
    
}
