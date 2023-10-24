package com.example.triftshop.clothes;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClothesService {

    private final ClothesRepository repository;

    public List<Clothes> getAllClothes(){
        return repository.findAll();
    }

    public Clothes getClothesById(UUID id){
        return repository.getReferenceById(id);
    }

    public Clothes createClothes(Clothes clothes){
        return repository.save(clothes);
    }

    public Clothes updateClothes(UUID id, Clothes newOne){
        Clothes actual = repository.getReferenceById(id);

        return null;
    }

    public void deleteClothes(UUID id){
        repository.deleteById(id);
    }
}
