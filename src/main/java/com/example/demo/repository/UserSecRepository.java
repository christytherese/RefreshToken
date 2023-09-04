package com.example.demo.repository;

import com.example.demo.entity.UserSecurity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSecRepository extends JpaRepository<UserSecurity, Long> {

}
