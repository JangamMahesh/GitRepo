package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.StudentRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Student s1 = new Student("jangam", "mahesh", "mahesh@gmail.com");
		 * 
		 * studentRepository.save(s1);
		 * 
		 * Student s2 = new Student("raj", "mahesh", "mahesh@gmail.com");
		 * studentRepository.save(s2);
		 * 
		 * Student s3 = new Student("sri", "mahesh", "mahesh@gmail.com");
		 * studentRepository.save(s3);
		 */
	}

	/*
	 * @Bean public Docket api() { return new
	 * Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().build();
	 * 
	 * 
	 * apis(RequestHandlerSelectors.any()) .paths(PathSelectors.any()).build();
	 * 
	 * }
	 * 
	 * private ApiInfo apiInfo() {
	 * 
	 * return new
	 * ApiInfoBuilder().title("Student Management System").description("njoy her ")
	 * .termsOfServiceUrl("https://www.google.com").version("2.0").build();
	 * 
	 * return new ApiInfo( "My REST API", "Some custom description of API.",
	 * "API TOS", "Terms of service", "License of API", "API license URL",
	 * Collections.emptyList());
	 * 
	 * }
	 */
	/*
	 * 

	/*
	 * public class SwaggerFoxConfig {
	 * 
	 * private String title; private String description; private String version;
	 * private String termsOfServiceUrl; private String license; private String
	 * licenseUrl; private String contactName; private String contactUrl; private
	 * String contactEmail;
	 * 
	 * @Bean public Docket apiDocket() { return new
	 * Docket(DocumentationType.SWAGGER_2) .useDefaultResponseMessages(false)
	 * .select() .apis(RequestHandlerSelectors.basePackage("path.to.base.package"))
	 * .paths(PathSelectors.any()) .build() .apiInfo(apiInfo()); }
	 * 
	 * private ApiInfo apiInfo() { System.out.println(this.title); return new
	 * ApiInfo( this.title, this.description, this.version, this.termsOfServiceUrl,
	 * new Contact(this.contactName, this.contactUrl, this.contactEmail),
	 * this.license, this.licenseUrl, Collections.emptyList()); }
	 *
	 * 
	 *
	 */
}
