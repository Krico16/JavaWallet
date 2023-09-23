package xyz.krico16.bankapp.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.krico16.bankapp.domain.entities.UsersEntity;
import java.util.UUID;

public interface UsersRepository extends CrudRepository<UsersEntity, UUID> {
}
