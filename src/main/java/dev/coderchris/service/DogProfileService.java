package dev.coderchris.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import dev.coderchris.model.DogProfile;
import dev.coderchris.repository.DogProfileRepository;

@Service
public class DogProfileService implements CrudService<DogProfile> {

    private DogProfileRepository repository;

    public DogProfileService(DogProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public DogProfile create(DogProfile t) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Optional<DogProfile> get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<DogProfile> list() {
        return repository.findAll();
    }

    @Override
    public void update(DogProfile t, int id) {
        // TODO Auto-generated method stub
        
    }

    
    
    
}
