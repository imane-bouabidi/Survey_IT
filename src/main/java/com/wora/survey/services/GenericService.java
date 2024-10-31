package com.wora.survey.services;

import java.util.List;

public interface GenericService<CREATE_DTO, UPDATE_DTO, DTO, ID>{
    DTO save(CREATE_DTO dto);
    DTO findById(ID id);
    DTO update(UPDATE_DTO dto);
    List<DTO> findAll();
    void delete(ID id);
}
