package com.riwi.LibrosYa.domain.repositories;

import com.riwi.LibrosYa.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
