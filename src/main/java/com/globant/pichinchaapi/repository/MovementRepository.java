package com.globant.pichinchaapi.repository;

import com.globant.pichinchaapi.model.MovementEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovementRepository extends JpaRepository<MovementEntity, String> {

}
