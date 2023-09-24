package xyz.krico16.bankapp.domain.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import xyz.krico16.bankapp.domain.entities.WalletEntity;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface WalletRepository extends CrudRepository<WalletEntity, UUID> {

    @Query(value = "select w from wallet w where w.user_id in :ids")
    Set<WalletEntity> selectFromUsers(@Param("ids") List<UUID> walletIds);
}
