package com.resmy.demos.onlineexam.repository;

import com.resmy.demos.onlineexam.entity.UserEntity;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepository { // extends JpaRepository<UserEntity,?> {

    private EntityManager entityManager;

    @Autowired
    public UserRepository(EntityManager theEntityManager){

        entityManager = theEntityManager;
    }

}
