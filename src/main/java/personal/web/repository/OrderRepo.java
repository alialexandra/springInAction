package personal.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.web.domain.Client;

public interface OrderRepo extends JpaRepository<Client, Long> {
}
