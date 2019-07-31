package com.qamanager.web.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bugs")
public class BugsController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return"/bugs/cadastro";
	}
	
	
	@GetMapping("/listar")
	public String listar() {
		return"/bugs/lista";
	}
	

}
