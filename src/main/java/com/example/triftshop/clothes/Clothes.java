package com.example.triftshop.clothes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;


@Getter
@Setter
@Entity
public class Clothes {

    @Id
    @UuidGenerator
    private UUID id;
    private String name;
    private Integer size;
    private Float price;
    private ClothesType type;
    private boolean onMagazine;

}
