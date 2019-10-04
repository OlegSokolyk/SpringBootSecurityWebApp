package ua.springweb.security.service;

import ua.springweb.security.entity.UserEntity;

public interface UserService {

	UserEntity findUserByEmail(String email);
	
	UserEntity findUserById(int id);
	
	void save(UserEntity user);
}
