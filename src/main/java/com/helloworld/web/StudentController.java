package com.helloworld.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.helloworld.model.Student;
import com.helloworld.service.StudentService;
import com.helloworld.util.StudentCO;
import com.helloworld.validator.StudentValidator;
import org.json.simple.JSONValue;  

@Controller
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	StudentService studentService;

	@Autowired
	StudentValidator studentvalidator;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listPage() {
		ModelAndView modelAndView = new ModelAndView();
		List<Student> listStudentRecord = studentService.fetchStudentList();
	
		modelAndView.addObject("listStudentRecord", listStudentRecord);
		modelAndView.setViewName("studentList");
		return modelAndView;
	}
	
	

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody String createPost(@RequestBody StudentCO studentCO,BindingResult result) {
		Map<String, Object>  response = new HashMap<>();
		studentvalidator.validate(studentCO, result);
		if (result.hasErrors()) {
			response.put("statusCode", "0");
			response.put("message", "Please Fill all the Fields");
			return JSONValue.toJSONString(response);
		}
		studentService.createStudent(studentCO);
		response.put("statusCode", "1");
		response.put("message", "Data Saved Successfully");
		return JSONValue.toJSONString(response);
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createGet() {
		return "studentCreate";
	}

}