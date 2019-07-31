package com.qamanager.web.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/planos")
public class PlanosController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return"/planos/cadastro";
	}
	
	
	@GetMapping("/listar")
	public String listar() {
		return"/planos/lista";
	}
	

}
