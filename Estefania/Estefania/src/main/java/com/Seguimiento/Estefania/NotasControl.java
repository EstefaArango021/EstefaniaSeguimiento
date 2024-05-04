package com.Seguimiento.Estefania;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("nota")

public class NotasControl {
    @Autowired
	private Notasinterface NotasServicio;
	
	
	@GetMapping(value="/notaInsertar")
	public String notaInsertar(Model model) {
		
		Notas nota = new Notas();
		model.addAttribute("nota", nota);
		model.addAttribute("mensaje", "Nueva Nota");
		return "notaInsertar";
	}
	
	@PostMapping ("/insertar")
	public String insertar(@ModelAttribute (name="nota")
	Notas nota, Model model,SessionStatus status) {
		NotasServicio.guardar(nota);
		status.setComplete();
		return "redirect:/notasListar";
	}
	
	@GetMapping("/notasListar")
	public String notasListar(Model model) {
		List<Notas> notas=NotasServicio.listado();
		model.addAttribute("nota", nota);
		model.addAttribute("mensaje", "listado");
		return "/notasListar";
}
}
