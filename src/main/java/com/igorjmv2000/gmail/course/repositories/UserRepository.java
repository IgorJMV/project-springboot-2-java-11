package com.igorjmv2000.gmail.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.igorjmv2000.gmail.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
