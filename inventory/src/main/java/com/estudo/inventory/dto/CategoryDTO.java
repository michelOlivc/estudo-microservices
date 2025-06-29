package com.estudo.inventory.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDTO extends AuditableDTO<Long> {
    private String name;
    private CategoryDTO parent;
    private boolean active;
}
