package bt.gov.ditt.dairy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import bt.gov.ditt.dairy.model.User;

public interface UserRepository extends JpaRepository <User, Integer>{
	Optional<User> findByUserName(String userName);
}
