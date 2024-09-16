package com.ujjwal.SpringSecurity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ujjwal.SpringSecurity.Model.Users;



@Repository
public interface UserRepo extends JpaRepository<Users, Integer>  {

	Users findByUsername(String username);

}
