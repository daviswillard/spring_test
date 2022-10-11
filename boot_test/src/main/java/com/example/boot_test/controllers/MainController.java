package com.example.boot_test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*Передача данных от клиента серверу с помощью параметров запроса*/

@Controller
public class MainController {
	@RequestMapping("/home")
	public String home(
			@RequestParam(required = false) String color,
			@RequestParam(required = false) String name,
			Model page) {
		page.addAttribute("username", name);
		page.addAttribute("color", color);
		return "home.html";
	}
}
//	@RequestParam - сообщает Spring, что нужно извлечь значение из параметра
//		HTTP-запроса, причем имя этого параметра совпадает с именем параметра
//		метода.
//	(Пример: http://localhost:8080/home?color=blue&name=Ivan)

/*Передача данных от клиента серверу с помощью переменных пути*/

//@Controller
//public class MainController {
//	@RequestMapping("/home/{color}")
//	public String home(
//		@PathVariable String color,
//		Model page) {
//		page.addAttribute("username", "Katy");
//		page.addAttribute("color", color);
//		return "home.html";
//	}
//}
//	Значение из пути получает тот параметр метода действия, который
//	сопровождается аннотацией @PathVariable
//	(Пример: http://localhost:8080/home/blue)

