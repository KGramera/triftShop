package com.example.triftshop.clothes;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ClothesMapper {

    Clothes toEntity(Clothes request);
    ClothesResponse toResponse(Clothes clothes);

}
