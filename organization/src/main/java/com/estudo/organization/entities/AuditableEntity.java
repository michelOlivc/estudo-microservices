package com.estudo.organization.entities;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
public abstract class AuditableEntity<ID> extends BaseEntity<ID> {
    private Instant lastModifiedAt;

    @PrePersist
    public void onPrePersist() {
        this.setLastModifiedAt(Instant.now());
    }

    @PreUpdate
    public void onPreUpdate() {
        this.setLastModifiedAt(Instant.now());
    }
}
