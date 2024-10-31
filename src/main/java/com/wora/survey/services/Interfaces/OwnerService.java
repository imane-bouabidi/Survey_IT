package com.wora.survey.services.Interfaces;

import com.wora.survey.dtos.owner.OwnerCreateDTO;
import com.wora.survey.dtos.owner.OwnerDTO;
import com.wora.survey.dtos.owner.OwnerUpdateDTO;
import com.wora.survey.services.GenericService;

public interface OwnerService extends GenericService<OwnerCreateDTO, OwnerUpdateDTO, OwnerDTO, Integer> {
}
