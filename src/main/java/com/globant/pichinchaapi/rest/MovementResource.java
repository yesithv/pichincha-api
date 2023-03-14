package com.globant.pichinchaapi.rest;

import com.globant.pichinchaapi.model.MovementEntity;
import com.globant.pichinchaapi.services.movement.MovementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pichincha-api/v1/movements")
@AllArgsConstructor
public class MovementResource {

    private final MovementService movementService;

    @PostMapping()
    public MovementEntity create(@RequestBody MovementEntity movementEntity) {
        return movementService.createMovement(movementEntity);
    }

}
