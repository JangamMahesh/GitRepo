package com.example.demo.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {

	private int id;
	@NotEmpty
	@Size(min = 4, message = "User name must be minimum of 4 characters")
	private String name;
	
	@Email(message = "your email address is not valid")
	private String email;
	
	@NotEmpty
	@Size(min = 3, max = 10, message = "password must be in between 3 to 10 chars lenght")
	// @Pattern(regexp = "")
	private String password;
	@NotEmpty
	private String about;

}
