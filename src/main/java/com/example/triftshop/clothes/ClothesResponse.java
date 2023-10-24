package com.example.triftshop.clothes;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ClothesResponse {
    private UUID id;
    private String name;
    private Integer size;
    private Float price;
    private ClothesType type;
    private boolean onMagazine;
}
