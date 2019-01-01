package com.sample.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String home(ModelMap modal) {
		modal.addAttribute("title", "JegaPriya");
		modal.addAttribute("message", "Welcome to SpringBoot");
		return "hello";
	}

}
