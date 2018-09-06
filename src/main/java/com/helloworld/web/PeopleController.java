package com.helloworld.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONValue;
//import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.helloworld.model.People;
import com.helloworld.model.Student;
import com.helloworld.service.LoginService;
import com.helloworld.service.PeopleService;
import com.helloworld.service.StudentService;
import com.helloworld.util.PeopleCO;
import com.helloworld.util.StudentCO;

@Controller
@RequestMapping(value = "/people")
public class PeopleController {

	@Autowired
	PeopleService peopleservice;

	
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView viewPage() {
		ModelAndView modelview = new ModelAndView("redirect:/people/view");
		List<People> list = peopleservice.fetchStudentList();
		modelview.addObject("list", list);
		modelview.setViewName("view");
		return modelview;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody String createPost(@RequestBody PeopleCO peopleCO, BindingResult result) {
		Map<String, Object> response = new HashMap<>();
		peopleservice.createRecord(peopleCO);
		response.put("statusCode", "1");
		response.put("message", "success");
		System.out.println("..................................................check function");
		return JSONValue.toJSONString(response);
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createGet() {

		return "create";
	}

	@RequestMapping(value="/data", method = RequestMethod.GET,headers="Accept=application/json")
	public  @ResponseBody List<People> createGetPeople() {
		List<People> createList = peopleservice.fetchStudentList();
		
		return createList;
	}

	
	
	
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody String deletePost(@PathVariable("id") int id) {
		
		
		People pToDelete=peopleservice.getEntityByID(id);
		

		peopleservice.deleteRecord(pToDelete);
		Map<String, Object> response = new HashMap<>();
		
		response.put("statusCode", "1");
		response.put("message", "success");
		System.out.println("..................................................prashant");
		return JSONValue.toJSONString(response);

}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public @ResponseBody ModelAndView updateRecord(@RequestBody People peopleCO)
	{
		
		
		ModelAndView modelview = new ModelAndView();
		
		int id=peopleCO.getId();
		
		String name=peopleCO.getName();
		String age=peopleCO.getAge();
		String contact=peopleCO.getContact();
		
		People pToUpdate=peopleservice.getEntityByID(id);
		
		peopleservice.getEntityByIDtoUpdate(pToUpdate,name,age,contact);
		
		
		modelview.setViewName("view");
		
		return modelview;
	}
	
	
}