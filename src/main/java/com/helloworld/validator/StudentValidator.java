package com.helloworld.validator;

import org.springframework.validation.Errors;
import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;
import com.helloworld.util.StudentCO;

@Component
public class StudentValidator implements Validator {

	
	public boolean supports(Class clazz) {
        return StudentCO.class.isAssignableFrom(clazz);
    }
	 public void validate(Object target, Errors errors)
	    {
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.firstName", "First name is required.");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.lastName", "Last name is required.");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "error.email", "Email is required.");
	    }
}
