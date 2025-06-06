package com.estudo.inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Auditable;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category extends AuditableEntity<Long> {
    @Column(unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Category parent;

    private boolean active;
}
