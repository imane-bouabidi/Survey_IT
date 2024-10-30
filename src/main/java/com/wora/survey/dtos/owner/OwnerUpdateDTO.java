package com.wora.survey.dtos.owner;

import jakarta.validation.constraints.Size;

public class OwnerUpdateDTO {
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
    private String name;
}
