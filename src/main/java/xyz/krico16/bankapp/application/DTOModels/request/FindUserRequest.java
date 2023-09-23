package xyz.krico16.bankapp.application.DTOModels.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class FindUserRequest {

    private String email;
    private String password;
}
