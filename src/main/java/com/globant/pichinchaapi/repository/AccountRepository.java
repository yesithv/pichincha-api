package com.globant.pichinchaapi.repository;

import com.globant.pichinchaapi.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {

}
