package neighborHub.repository;

import neighborHub.model.Entity.FareInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<FareInfo, Long> {
}