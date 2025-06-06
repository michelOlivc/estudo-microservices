package com.estudo.organization.repositories;

import com.estudo.organization.entities.Position;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends BaseRepository<Position, Long> {
}
