package xyz.krico16.bankapp.user.domain.repository;
import xyz.krico16.bankapp.user.domain.model.User;
import java.util.UUID;

public interface UserRepo {
    User create(User user);
    User findByEmail(String email);
    User findById(UUID id);
}
