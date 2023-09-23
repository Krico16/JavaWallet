package xyz.krico16.bankapp.application.DTOModels.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserRequest {

    private UUID id;
    private String document_number;
    private String names;
    private String last_name;
    private String email;
    private String password;
}
