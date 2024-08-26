package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/hello")
	public String hello(ModelMap model, @RequestParam String name) {
		model.put("name", name);

		return "hello";
	}

	@RequestMapping("/login")
	public String loginPage() {

		return "login";

	}

	@RequestMapping("/home")
	public String homePage() {

		return "home";

	}

	@RequestMapping("/signUp")
	public String signUp(@RequestParam String userName, @RequestParam String password, ModelMap map) {

		if (userName.equalsIgnoreCase("Ansar")&&password.equalsIgnoreCase("Ansar123")) {
			map.put("name", userName);
			return "home";
		} else {
			map.put("errorMessage", "Invalid Crediantional");
			return "login";
		}

	}

}
