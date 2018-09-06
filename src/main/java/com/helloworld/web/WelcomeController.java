package com.helloworld.web;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.helloworld.service.HelloWorldService;

@Controller
public class WelcomeController {


	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Map<String, Object> model) {

	
		return "index";
	}*/


}