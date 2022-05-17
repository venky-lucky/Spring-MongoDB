package ai.jobiak.bootforms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ai.jobiak.bootforms.model.Student;
import ai.jobiak.bootforms.repo.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	StudentRepository stdrepo;
	
	public StudentController() {
		
	}
	public StudentController(StudentRepository stdrepo) {
		this.stdrepo = stdrepo;
	}
	
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String redirect() {
		return "signup";
	}
	@RequestMapping(path="/signup", method=RequestMethod.POST)
	public String doSignup(@ModelAttribute("acc")Student std) {
		stdrepo.save(std);
		return "sucess";
	}
}
