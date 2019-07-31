package com.qamanager.web.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return"/usuarios/cadastro";
	}
	
	
	@GetMapping("/listar")
	public String listar() {
		return"/usuarios/lista";
	}
	

}
