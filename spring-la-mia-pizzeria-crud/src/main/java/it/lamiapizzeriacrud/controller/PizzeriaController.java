package it.lamiapizzeriacrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.lamiapizzeriacrud.model.Pizza;
import it.lamiapizzeriacrud.repository.PizzaRepository;

@Controller
public class PizzeriaController {

	@Autowired
	private PizzaRepository repository;
	
	@GetMapping("/index")
	public String pizzaByName(Model model, @RequestParam(name = "name", required = false) String name) {
		
		List<Pizza> listaPizze = new ArrayList<>();
		if(name == null || name.isBlank()) {
			listaPizze = repository.findAll();
		} else {
			listaPizze = repository.findByName(name);
		}
		model.addAttribute("list", listaPizze);
		return "index";
	}

	
	@GetMapping("/index/{id}")
	public String descrizionePizza(@PathVariable("id") int pizzaId, Model model) {
		model.addAttribute("pizza", repository.getReferenceById(pizzaId));
		return "descrizionePizza";
	  }

}
	
	


