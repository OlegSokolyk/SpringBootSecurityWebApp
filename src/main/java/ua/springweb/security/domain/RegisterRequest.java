package ua.springweb.security.domain;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.springweb.security.entity.enumeration.Role;

@Getter @Setter @NoArgsConstructor
public class RegisterRequest {

	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String confirmPassword;
	
	private Role role;
	
}
