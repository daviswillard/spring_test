package com.example.boot_ch9.models;

import com.example.boot_ch9.service.LoggedUserManagementService;
import com.example.boot_ch9.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component // сообщаем Spring, что это Bean
@RequestScope // ограничиваем область видимость до текущего запроса
public class LoginProcessor {

	private final LoggedUserManagementService loggedUserManagementService;
	private final LoginCountService loginCountService;

	private String username;
	private String password;

//	автомонтируем (@Autowired) бин LoggedUserManagementService и др.
	public LoginProcessor(
			LoggedUserManagementService loggedUserManagementService,
			LoginCountService loginCountService) {
		this.loggedUserManagementService = loggedUserManagementService;
		this.loginCountService = loginCountService;
	}

	// логика для процесса аутентификации пользователя в приложение
	public boolean login() {
		loginCountService.increment();

		String username = this.getUsername();
		String password = this.getPassword();

		boolean loginResult = false;
		if ("natalie".equals(username) && "password".equals(password)) {
			loginResult = true;
			loggedUserManagementService.setUsername(username); //сохраняем имя
			// пользователя в бин
		}
		return loginResult;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
