package xyz.krico16.bankapp.user.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class User {

    @Id
    private UUID id;
    private String document_number;
    private String names;
    private String lastnames;
    private String email;
    private String password;
    private boolean is_active;
    private LocalDateTime created_at;



}
