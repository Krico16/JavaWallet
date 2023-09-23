package xyz.krico16.bankapp.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import xyz.krico16.bankapp.utils.WalletType;

import java.util.UUID;

@Entity(name = "wallet")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class WalletEntity {

    @Id
    private UUID wallet_id;
    private UUID user_id;

    private WalletType wallet_type;

    private float available_amount;
    private float restricted_amount;
}
