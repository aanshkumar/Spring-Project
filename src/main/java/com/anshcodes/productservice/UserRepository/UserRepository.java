package com.anshcodes.productservice.UserRepository;

import com.anshcodes.productservice.PeoductModels.User;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByName(String name);

    @Override
    Optional<User> findById(Long aLong);

    User save(User entity);
}
