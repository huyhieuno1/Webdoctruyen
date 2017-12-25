package group1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest arg0, HttpServletResponse arg1){
		
		return new ModelAndView("index");
	}
	
}
