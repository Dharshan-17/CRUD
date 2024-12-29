package com.crudcode.fullstack_backend.repo;

import com.crudcode.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
