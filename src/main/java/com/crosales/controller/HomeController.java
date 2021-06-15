package com.crosales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	/* Muestra los datos del desarrollador y las URLs de los servicios */
	@GetMapping("/help")
	public String mostrarHome() {
		return "helpContacto";
	}
	
}
