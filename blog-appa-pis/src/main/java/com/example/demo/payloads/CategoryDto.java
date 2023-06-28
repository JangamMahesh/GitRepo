package com.example.demo.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CategoryDto {

	private Integer categoryId;
	@NotBlank
	@Size(min = 4, message="title should be minimum size of 4")
	private String categoryTitle;
	@NotBlank
	@Size(min = 10,message="descirption should be minimum size of 10")
	private String categoryDescription;

}
