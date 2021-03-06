package uz.pdp.app_info_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.app_info_system.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);


    Optional<User> findByUsername(String username);
}
