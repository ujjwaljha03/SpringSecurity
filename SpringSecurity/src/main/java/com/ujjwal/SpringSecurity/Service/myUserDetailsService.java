package com.ujjwal.SpringSecurity.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ujjwal.SpringSecurity.Model.UserPrincipal;
import com.ujjwal.SpringSecurity.Model.Users;
import com.ujjwal.SpringSecurity.Repository.UserRepo;

@Service
public class myUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repo.findByUsername(username);
		if(user==null) {
			System.out.println(" User Not Found");
			throw new UsernameNotFoundException("User Not Found");
		}
		return new UserPrincipal(user);
	}

}
