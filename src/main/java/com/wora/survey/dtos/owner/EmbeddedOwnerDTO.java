package com.wora.survey.dtos.owner;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class EmbeddedOwnerDTO {
    private Long id;
    private String name;
    @Positive
    @NotNull
    private Integer selectionCount;

}
