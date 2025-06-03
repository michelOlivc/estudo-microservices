package com.estudo.organization.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PositionDTO {
    private Long id;
    private String name;
    private String description;
    private DepartmentDTO department;
}
