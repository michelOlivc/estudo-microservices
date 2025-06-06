package com.estudo.organization.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeDTO extends AuditableDTO<Long> {
    private String name;
    private PositionDTO position;
}
