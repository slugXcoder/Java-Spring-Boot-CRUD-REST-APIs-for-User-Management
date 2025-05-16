package learn.java.SpringBoot.repository;

import learn.java.SpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
