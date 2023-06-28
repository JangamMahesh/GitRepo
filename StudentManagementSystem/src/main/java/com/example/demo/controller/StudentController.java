package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller

public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());

		return "students";
	}

	@GetMapping("/students/new")
	public String creatStudent(Model model) {
		// to store the empty student object
		Student student = new Student();

		model.addAttribute("student", student);

		return "create_student";

	}

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {

		studentService.saveStudent(student);
		return "redirect:/students";
	}

	@GetMapping("students/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {

		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_Student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent1(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setId(student.getId());
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}

	@GetMapping("/students/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}

	
	//https
	
	@GetMapping("/getName")
	public String getName()
	{
		return "hello this is mahesh";
	}
	
}
