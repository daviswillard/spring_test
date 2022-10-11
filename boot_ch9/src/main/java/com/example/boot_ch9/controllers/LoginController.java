package com.example.boot_ch9.controllers;

import com.example.boot_ch9.models.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private final LoginProcessor loginProcessor;

	public LoginController(LoginProcessor loginProcessor) {
		this.loginProcessor = loginProcessor;
	}

	@GetMapping("/")
	public String loginGet() {
		return "login.html";
	}

	@PostMapping("/") //связываем действие с запросом POST со страницы "/"
	public String loginPost(
			@RequestParam String username, // учетные данные из параметров
			@RequestParam String password, // HTTP-запроса
			Model model // передаем в представление текст сообщения
	) {
		loginProcessor.setUsername(username);
		loginProcessor.setPassword(password);
		boolean loggedIn = loginProcessor.login();

		if (loggedIn) {
			return "redirect:/main";
		} else {
			model.addAttribute("message",
					"Login failed!");
		}

		return "login.html"; // остаемся на той же странице
	}
}
