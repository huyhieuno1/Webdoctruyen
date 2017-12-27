package com.fpt.fresher.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hungxoan
 *
 */
@Controller
// @RequestMapping("/")
public class IndexController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndexPage() {
		return "UserManagement";
	}

	@RequestMapping(value = "/StudentManagement", method = RequestMethod.GET)
	public String studentManagerMent() {
		return "StudentManagement";

	}
}