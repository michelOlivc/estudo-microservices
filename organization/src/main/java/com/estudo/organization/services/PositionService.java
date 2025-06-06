package com.estudo.organization.services;

import com.estudo.organization.dto.PositionDTO;
import com.estudo.organization.entities.Position;
import com.estudo.organization.repositories.PositionRepository;
import org.springframework.stereotype.Service;

@Service
public class PositionService extends BaseService<Position, PositionDTO, Long> {

    public PositionService(PositionRepository repository) {
        super(repository);
    }
}
