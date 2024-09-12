package neighborHub.model.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Fare_Info")
public class FareInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fareInfoId;

    @Column(nullable = false)
    private int commissionRate;

    @Column(nullable = false)
    private int vatRate;
}
