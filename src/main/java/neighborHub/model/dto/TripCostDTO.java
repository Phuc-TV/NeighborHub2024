package neighborHub.model.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TripCostDTO {
    private int distance;
    private String vehicleType;
    private LocalDateTime travelTime;
    private List<Integer> listVoucher;
}