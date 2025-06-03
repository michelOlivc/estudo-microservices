package com.estudo.organization.controllers;

import com.estudo.organization.dto.PositionDTO;
import com.estudo.organization.entities.Position;
import com.estudo.organization.services.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/positions")
public class PositionController extends AbstractController<PositionDTO, Long> {

    public PositionController(PositionService service) {
        super(service);
    }
}
