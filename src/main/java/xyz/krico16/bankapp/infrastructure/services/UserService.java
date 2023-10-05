package xyz.krico16.bankapp.infrastructure.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.krico16.bankapp.application.DTOModels.request.UserRequest;
import xyz.krico16.bankapp.application.DTOModels.response.UserResponse;
import xyz.krico16.bankapp.domain.entities.UsersEntity;
import xyz.krico16.bankapp.domain.repositories.UsersRepository;
import xyz.krico16.bankapp.infrastructure.abstract_service.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Transactional
@Service
@Slf4j
// Can be used instead of the constructor
@AllArgsConstructor
public class UserService implements IUserService {

    private final UsersRepository usersRepository;

    /*
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    */

    @Override
    public UserResponse create(UserRequest request) {
        var userToPersistence = UsersEntity.builder()
                //.id(UUID.randomUUID())
                .document_number(request.getDocument_number())
                .names(request.getNames())
                .last_name(request.getLast_name())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
        var savedUser = this.usersRepository.save(userToPersistence);
        log.info("Created user id: {}", savedUser.getId());
        return this.entityToResponse(savedUser);
    }

    @Override
    public UserResponse FindById(UUID uuid) {
        var userFromPersistence = this.usersRepository.findById(uuid).orElseThrow();

        //log.info("Founded user: {}", userFromPersistence.);

        return this.entityToResponse(userFromPersistence);
    }

    @Override
    public List<UserResponse> findByIdIsIn(List<UUID> idList) {
        var userListFromPersistence = this.usersRepository.findByIdIsIn(idList).orElseThrow();
        return this.entityListToResponse(userListFromPersistence);
    }


    private UserResponse entityToResponse(UsersEntity usersEntity) {
        var response = new UserResponse();

        BeanUtils.copyProperties(usersEntity, response);
        return response;
    }

    private List<UserResponse> entityListToResponse(List<UsersEntity> usersEntityList) {
        List<UserResponse> responseList = new ArrayList<>();

        for (UsersEntity e: usersEntityList) {
            var response = new UserResponse();
            BeanUtils.copyProperties(e,response);

            responseList.add(response);
        }

        return responseList;
    }
}
