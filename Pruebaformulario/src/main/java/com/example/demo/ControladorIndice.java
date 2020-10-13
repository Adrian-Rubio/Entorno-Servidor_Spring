package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorIndice {

	@RequestMapping(value="/Indice", method=RequestMethod.GET)
	public String indice_get() {

		return "Indice";
	}

	@RequestMapping(value="/Indice", method=RequestMethod.POST)
	public String indice_post(Model modelo,
			@RequestParam Integer peso,
			@RequestParam Integer estatura
			) {

		modelo.addAttribute("peso_form", peso);
		modelo.addAttribute("estatura_form", estatura);
		
		

		return "DatosIndice";
	}
	
}

