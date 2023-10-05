package xyz.krico16.bankapp.infrastructure.abstract_service;

import xyz.krico16.bankapp.application.DTOModels.request.UserRequest;
import xyz.krico16.bankapp.application.DTOModels.response.UserResponse;

import java.util.List;
import java.util.UUID;

// Request - Response - UUID
public interface IUserService extends CrudService<UserRequest, UserResponse, UUID>{

    List<UserResponse> findByIdIsIn(List<UUID> idList);
}
