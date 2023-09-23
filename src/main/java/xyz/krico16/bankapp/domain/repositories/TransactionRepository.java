package xyz.krico16.bankapp.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import xyz.krico16.bankapp.domain.entities.TransactionEntity;

import java.util.Set;
import java.util.UUID;

public interface TransactionRepository extends JpaRepository<TransactionRepository, UUID> {

    @Query("select t from transactions t where t.sender_wallet = :id or t.receiver_wallet = :id")
    Set<TransactionEntity> selectById(UUID id);

}
