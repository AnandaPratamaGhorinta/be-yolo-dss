package com.dss.fullstackdss.repository;

import com.dss.fullstackdss.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
