package personal.web.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import personal.web.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepo extends JpaRepository<Client, Long> {

    public List<Client> getClientsById(Long id);

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.managedTeacherIds WHERE u.username = ?1")
    Optional<Client> findByClientName(String username);



}
