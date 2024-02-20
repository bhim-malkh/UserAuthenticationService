package com.ecom.userauthenticationservice.repositories;

import com.ecom.userauthenticationservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User save(User user);
}
