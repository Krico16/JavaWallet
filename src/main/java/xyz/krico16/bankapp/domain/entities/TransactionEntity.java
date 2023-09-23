package xyz.krico16.bankapp.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import xyz.krico16.bankapp.utils.TransactionStatus;

import java.util.Date;
import java.util.UUID;

@Entity(name = "transactions")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TransactionEntity {

    @Id
    private UUID transaction_id;

    private UUID sender_wallet;
    private UUID receiver_wallet;

    private float amount;
    private TransactionStatus status;

    @Column
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Column
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;
}
