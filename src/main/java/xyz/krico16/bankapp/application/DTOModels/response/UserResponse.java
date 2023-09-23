package xyz.krico16.bankapp.application.DTOModels.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class UserResponse {

    private UUID id;

    private String document_number;

    private String names;
    private String last_name;
    private String email;
    private String password;
    private boolean isActive;
}
