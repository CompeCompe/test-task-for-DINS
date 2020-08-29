package ru.eremenko.test.repository;

import ru.eremenko.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}