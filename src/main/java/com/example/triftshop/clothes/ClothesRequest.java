package com.example.triftshop.clothes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClothesRequest {
    private String name;
    private Integer size;
    private Float price;
    private ClothesType type;
}
