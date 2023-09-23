package xyz.krico16.bankapp.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UsersEntity {

    @Id
    private UUID id;

    private String document_number;

    private String names;
    private String last_name;
    private String email;
    private String password;

    @Builder.Default
    private boolean isActive = true;


    @PrePersist
    public void createUser() {
        this.id = UUID.randomUUID();
    }
}
