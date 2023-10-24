package com.example.triftshop.clothes;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-24T12:21:54+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class ClothesMapperImpl implements ClothesMapper {

    @Override
    public Clothes toEntity(Clothes request) {
        if ( request == null ) {
            return null;
        }

        Clothes clothes = new Clothes();

        clothes.setId( request.getId() );
        clothes.setName( request.getName() );
        clothes.setSize( request.getSize() );
        clothes.setPrice( request.getPrice() );
        clothes.setType( request.getType() );
        clothes.setOnMagazine( request.isOnMagazine() );

        return clothes;
    }

    @Override
    public ClothesResponse toResponse(Clothes clothes) {
        if ( clothes == null ) {
            return null;
        }

        ClothesResponse clothesResponse = new ClothesResponse();

        clothesResponse.setId( clothes.getId() );
        clothesResponse.setName( clothes.getName() );
        clothesResponse.setSize( clothes.getSize() );
        clothesResponse.setPrice( clothes.getPrice() );
        clothesResponse.setType( clothes.getType() );
        clothesResponse.setOnMagazine( clothes.isOnMagazine() );

        return clothesResponse;
    }
}
