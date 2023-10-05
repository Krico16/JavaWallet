package xyz.krico16.bankapp.domain.repositories;

import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import xyz.krico16.bankapp.domain.entities.UsersEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsersRepository extends CrudRepository<UsersEntity, UUID> {

    Optional<List<UsersEntity>> findByIdIsIn(List<UUID> uuidList);
}
