package com.example.TicketBooking.repository;

import com.example.TicketBooking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UUID,User> {

    Optional<User> getUserByEmail(String userEmail);
}
