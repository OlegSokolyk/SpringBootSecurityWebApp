package ua.springweb.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ua.springweb.security.entity.UserEntity;
import ua.springweb.security.repository.UserRepository;
import ua.springweb.security.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	private PasswordEncoder passwordEncoder;
	
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public UserEntity findUserByEmail(String email) {
		
		return userRepository.findUserEmail(email);
	}

	@Override
	public UserEntity findUserById(int id) {
		
		return userRepository.findOne(id);
	}

	@Override
	public void save(UserEntity user) {
		String password = user.getPassword();
		
		System.out.println("BEFORE: " + password);
		
		user.setPassword(passwordEncoder.encode(password));
		
		System.out.println("AFTER: " + user.getPassword());
		
		userRepository.save(user);
	}

}
