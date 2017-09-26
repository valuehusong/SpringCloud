package com.cs.cloud.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cs.cloud.service.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
