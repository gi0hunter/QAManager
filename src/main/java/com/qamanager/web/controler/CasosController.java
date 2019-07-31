package com.qamanager.web.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/casos")
public class CasosController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return"/casos/cadastro";
	}
	
	
	@GetMapping("/listar")
	public String listar() {
		return"/casos/lista";
	}
	

}
