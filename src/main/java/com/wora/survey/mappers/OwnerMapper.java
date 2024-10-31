package com.wora.survey.mappers;

import com.wora.survey.dtos.owner.OwnerCreateDTO;
import com.wora.survey.dtos.owner.OwnerDTO;
import com.wora.survey.dtos.owner.OwnerUpdateDTO;
import com.wora.survey.entities.Owner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OwnerMapper {
    OwnerDTO toDTO(Owner owner);
    Owner toEntity(OwnerCreateDTO ownerCreateDTO );
    Owner toEntity(OwnerUpdateDTO ownerUpdateDTO );
}
