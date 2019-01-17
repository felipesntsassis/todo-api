package com.escolpi.todoapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	@RequestMapping("/home")
	public String home() {
		return "TODO App API foi iniciada com sucesso!";
	}
}
