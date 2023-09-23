package xyz.krico16.bankapp.infrastructure.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.krico16.bankapp.application.DTOModels.request.UserRequest;
import xyz.krico16.bankapp.application.DTOModels.response.UserResponse;
import xyz.krico16.bankapp.infrastructure.abstract_service.IUserService;
import java.util.UUID;

@Transactional
@Service
@Slf4j
public class UserService implements IUserService {
    @Override
    public UserRequest create(UserRequest request) {
        return null;
    }

    @Override
    public UserResponse FindById(UUID uuid) {
        return null;
    }
}
