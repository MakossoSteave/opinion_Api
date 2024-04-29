package koyo.dev.sabackend.repository;

import koyo.dev.sabackend.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User , Integer> {

    User findByEmail(String email);
}
