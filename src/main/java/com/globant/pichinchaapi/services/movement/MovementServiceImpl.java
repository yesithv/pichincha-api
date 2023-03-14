package com.globant.pichinchaapi.services.movement;

import com.globant.pichinchaapi.errors.MovementNoBalanceAvailableException;
import com.globant.pichinchaapi.model.AccountEntity;
import com.globant.pichinchaapi.model.EMovementType;
import com.globant.pichinchaapi.model.MovementEntity;
import com.globant.pichinchaapi.repository.AccountRepository;
import com.globant.pichinchaapi.repository.MovementRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class MovementServiceImpl implements MovementService {

    private final MovementRepository movementRepository;
    private final AccountRepository accountRepository;

    @Override
    public MovementEntity createMovement(MovementEntity movementEntity) {
        log.info("Intentado crear movimiento [{}]", movementEntity);
        AccountEntity accountEntity = accountRepository.getReferenceById(movementEntity.getAccountEntity().getIdAccount());
        if (movementEntity.getMovementType() == EMovementType.WITHDRAWAL && (accountEntity.getBalance() - movementEntity.getValue()) < 0) {
            log.error("Saldo no disponible");
            throw new MovementNoBalanceAvailableException("No se puede debitar [" + movementEntity.getValue() + "] porque no hay saldo disponible");
        }
        accountEntity.setBalance(movementEntity.getMovementType() == EMovementType.WITHDRAWAL ? accountEntity.getBalance() - movementEntity.getValue() : accountEntity.getBalance() + movementEntity.getValue());
        accountRepository.save(accountEntity);
        return movementRepository.save(movementEntity);
    }

}
