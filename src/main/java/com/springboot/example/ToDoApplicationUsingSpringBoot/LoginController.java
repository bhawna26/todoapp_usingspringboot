package com.springboot.example.ToDoApplicationUsingSpringBoot;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	//login
		@RequestMapping("login")
		public String gotoLoginPage() {
			return "login";
		}
		@RequestMapping(value="login",method=RequestMethod.POST)
		public String gotoWelcomePage(ModelMap model, @RequestParam("name") String name) {
	        model.addAttribute("name", name);
			return "welcome";
		}
		
}
