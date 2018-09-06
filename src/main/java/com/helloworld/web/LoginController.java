package com.helloworld.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.helloworld.service.LoginService;
import com.helloworld.util.PeopleCO;

@Controller
@RequestMapping(value = "/user")
public class LoginController {

	@Autowired
	LoginService login;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody ModelAndView login(@RequestBody PeopleCO peopleCO) {
		System.out.println("..................................................check function");
		String msg = "";
		boolean valid = login.loginUser(peopleCO);

		System.out.println("..................................................check function");
		if (valid) {
			msg = "Welcome User";
			System.out.println(".............................................check validity");
		} else {
			msg = "Invalid Credentials";
			System.out.println("................................................check invalidity");
		}
		return new ModelAndView("result", "output", msg);

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	String login() {

		return "login";
	}
	
}
