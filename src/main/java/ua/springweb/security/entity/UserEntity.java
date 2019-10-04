package ua.springweb.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.springweb.security.entity.enumeration.Role;

@Entity
@Table(name = "user")
@Getter @Setter @NoArgsConstructor
public class UserEntity extends BaseEntity {

	private String email;
	private String password;

	@Column(name = "full_name")
	private String fullName;

	private Integer age;
	
	@Enumerated(EnumType.STRING)
	private Role role;

}
