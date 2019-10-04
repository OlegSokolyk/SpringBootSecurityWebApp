package ua.springweb.security.mapper;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import ua.springweb.security.domain.RegisterRequest;
import ua.springweb.security.entity.UserEntity;
import ua.springweb.security.entity.enumeration.Role;

public interface UserMapper {

	public static User toSecurityUser(UserEntity user) {
		return new User(
				user.getEmail(), 
				user.getPassword(), 
				AuthorityUtils.createAuthorityList(String.valueOf(user.getRole())));
	}
	
	public static UserEntity registerToEntity(RegisterRequest request) {
		UserEntity entity = new UserEntity();
		entity.setEmail(request.getEmail());
		entity.setPassword(request.getPassword());
		entity.setRole(Role.ROLE_USER);
		return entity;
	}
}
