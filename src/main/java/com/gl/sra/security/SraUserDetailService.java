package com.gl.sra.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.sra.controller.UserRepository;

@Service
public class SraUserDetailService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			throws UsernameNotFoundException {
		
		User entityObj =  userRepository.getUserByUsername(username);
		
		SraUserDetails userDetails = new SraUserDetails(entityObj);
		// TODO Auto-generated method stub
		return userDetails;
	}
}
