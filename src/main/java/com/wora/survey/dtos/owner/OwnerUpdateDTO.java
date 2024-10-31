package com.wora.survey.dtos.owner;

import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OwnerUpdateDTO {
    private Integer id;
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
}
