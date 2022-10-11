package com.example.boot_ch9.controllers;

import com.example.boot_ch9.service.LoggedUserManagementService;
import com.example.boot_ch9.service.LoginCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class MainController {
	private final LoggedUserManagementService loggedUserManagementService;
	private final LoginCountService loginCountService;

	@Autowired // можно не писать...
	public MainController(
			LoggedUserManagementService loggedUserManagementService,
			LoginCountService loginCountService) {
		this.loggedUserManagementService = loggedUserManagementService;
		this.loginCountService = loginCountService;
	}

	@GetMapping("/main")
	public String home(
			@RequestParam(required = false) String Logout,
			Model model
	) {
		if (Logout != null) { //если в запросе есть логаут - удаляем имя
			// пользователя
			loggedUserManagementService.setUsername(null);
		}
		String username = loggedUserManagementService.getUsername();
		int count = loginCountService.getCount();

		if (Objects.isNull(username)) {
			return "redirect:/";
		}

		model.addAttribute("username", username);
		model.addAttribute("loginCount", count);
		return "main.html";
	}
}
