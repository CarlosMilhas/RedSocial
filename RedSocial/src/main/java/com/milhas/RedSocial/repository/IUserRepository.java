package com.milhas.RedSocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.milhas.RedSocial.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
