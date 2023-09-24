package xyz.krico16.bankapp.application.Mappers;

import org.springframework.beans.BeanUtils;
import xyz.krico16.bankapp.application.DTOModels.response.UserResponse;
import xyz.krico16.bankapp.domain.entities.UsersEntity;

public class UserMapper {

    public UserResponse entityToResponse(UsersEntity usersEntity) {
        var response = new UserResponse();

        BeanUtils.copyProperties(usersEntity, response);
        return response;
    }
}
