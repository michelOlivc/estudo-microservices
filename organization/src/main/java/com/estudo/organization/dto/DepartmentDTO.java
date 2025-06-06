package com.estudo.organization.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DepartmentDTO extends AuditableDTO<Long> {
    private String name;
    private String description;
}
