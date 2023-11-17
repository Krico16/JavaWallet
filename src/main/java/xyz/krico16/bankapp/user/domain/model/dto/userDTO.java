package xyz.krico16.bankapp.user.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class userDTO {

    private UUID id;
    private String document_number;
    private String names;
    private String lastnames;
    private String email;
    private String password;

}
