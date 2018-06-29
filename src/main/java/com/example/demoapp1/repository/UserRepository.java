package com.example.demoapp1.repository;

import com.example.demoapp1.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findOneById(Long id);
	
	User findByEmailAndPassword(String email, String password);

    void removeById(Long id);
}
