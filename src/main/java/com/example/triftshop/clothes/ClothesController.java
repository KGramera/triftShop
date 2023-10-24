package com.example.triftshop.clothes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ClothesController {

    private final ClothesService service;

    @GetMapping("/clothes")
    public List<Clothes> getAllClothes() {
        return service.getAllClothes();
    }

    @GetMapping("/clothes/{id}")
    public Clothes getClothesById(@PathVariable UUID id) {
        return service.getClothesById(id);
    }

    @PostMapping("/clothes")
    public Clothes createClothes(@RequestBody Clothes clothes) {
        return service.createClothes(clothes);
    }

    @PutMapping("/clothes/{id}")
    public Clothes updateClothes(@RequestBody Clothes clothes, @PathVariable UUID id) {
        return service.updateClothes(id, clothes);
    }

    @DeleteMapping("/clothes/{id}")
    public void deleteClothes(@PathVariable UUID id) {
        service.deleteClothes(id);
    }

}
