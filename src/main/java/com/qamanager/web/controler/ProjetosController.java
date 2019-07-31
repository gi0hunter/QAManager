package com.qamanager.web.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.qamanager.domain.Projeto;
import com.qamanager.domain.Status;
import com.qamanager.service.ProjetoService;

@Controller
@RequestMapping("/projetos")
public class ProjetosController {
	
	@Autowired
	private ProjetoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Projeto projeto) {
		return"/projetos/cadastro";
	}
	
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("projetos", service.findAll());
		
		return"/projetos/lista";
	}
	 @PostMapping("/salvar")
	public String salvar(Projeto projeto, RedirectAttributes attr) {
		service.save(projeto);
		attr.addFlashAttribute("success", "Projeto inserido com sucesso.");
		return "redirect:/projetos/cadastrar";
		
	}
	 @ModelAttribute("statuss")
	 public Status[] getStatus() {
		 return Status.values();
	 }
	 
	 @GetMapping("/editar/{id}")
	 public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		 model.addAttribute("projeto",service.findById(id));
		 return"/projetos/cadastro";
		 
	 }
	 
	 
	 
	 @PostMapping("/editar")
		public String editar(Projeto projeto, RedirectAttributes attr) {
			service.update(projeto);
			attr.addFlashAttribute("success", "Projeto editado com sucesso.");
			return "redirect:/projetos/cadastrar";
		}
		
		@GetMapping("/excluir/{id}")
		public String excluir(@PathVariable("id") Long id, ModelMap model) {
			
			if (service.projetoTemPlanos(id)) {
				model.addAttribute("fail", "Projeto não removido. Possui planos(s) vinculado(s).");
			} else {
				service.delete(id);
				model.addAttribute("success", "Projeto excluído com sucesso.");
			}
			
			return listar(model);
		}
	

}
