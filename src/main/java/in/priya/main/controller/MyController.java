package in.priya.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import in.priya.main.entities.User;
import in.priya.main.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller

public class MyController {
	@Autowired 
	private UserService userService;
	
	
	@GetMapping("/regpage")
	public String openRegPage(Model model)
	{
		model.addAttribute("user",new User());
		return "register";
	}
	
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user,Model model )
	{
		boolean status=userService.registerUser(user);
		if(status)
		{
			model.addAttribute("successmsg","User registered successfully");
		}
		else
		{
			model.addAttribute("errormsg","User not registered due to some error");
		}
		return "register";
		
	}
	@GetMapping("/loginpage")
	public String openLoginpage(Model model)
	{
		model.addAttribute("user",new User());
		return "login";
		
	}
	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user,Model model)
	{
		User validuser=userService.loginUser(user.getEmail(), user.getPassword());
		if(validuser!=null)
		{
			model.addAttribute("modelName",validuser.getName());
			return "profile";
		}
		else
		{
			model.addAttribute("errormsg","Emsil id or password did not match");
			return "login";
		}
		
	}
	@GetMapping("/logout")
	public String logoutUser(HttpServletRequest request )
	{
		HttpSession session=request.getSession(false);
		if(session!=null)
		{
			session.invalidate();
		}
		return "login";
		
	}
}
