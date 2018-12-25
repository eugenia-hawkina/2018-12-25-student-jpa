package telran.ashkelon2018.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import telran.ashkelon2018.student.domain.Student;
import telran.ashkelon2018.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public boolean addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	public Student removeStudent(@PathVariable int id) {
		return studentService.removeStudent(id);
	}
	
	@GetMapping("/student/{id}")
	public Student findStudent(@PathVariable int id) {
		return studentService.findStudent(id);
	}
	
	@GetMapping("/students/group/{id}")
	public Iterable<Student> getStudentsByGroupId(@PathVariable int id){
		return studentService.getStudentsByGroupId(id);
	}
	
	@DeleteMapping("/group/{id}")
	public boolean removeGroup(@PathVariable int id) {
		return studentService.removeGroup(id);
	}
}
