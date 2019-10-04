package ua.springweb.security.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ua.springweb.security.domain.RegisterRequest;
import ua.springweb.security.mapper.UserMapper;
import ua.springweb.security.service.UserService;

@Controller
public class BaseController {

	@Autowired private UserService userService;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		
		return "login";
	}
	
	@GetMapping("/register")
	public String showRegester(Model model) {
		
		model.addAttribute("registerModel", new RegisterRequest());
		
		return "register";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("registerModel") RegisterRequest request, BindingResult result) {
		
		if(result.hasErrors()) {
			return "register";
		}
		
		userService.save(UserMapper.registerToEntity(request));
		
		return "redirect:/login";
	}
}
