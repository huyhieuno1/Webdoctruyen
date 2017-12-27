package group1.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	@RequestMapping(value="/hello" , method= RequestMethod.GET)
	public ModelAndView hello() {
		
		return new ModelAndView("hello");
	}
	

}
