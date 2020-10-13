package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorForm {

	@RequestMapping(value="/formulario", method=RequestMethod.GET)
	public String formulario_get() {

		return "formulario";
	}

	@RequestMapping(value="/formulario", method=RequestMethod.POST)
	public String formulario_post(Model modelo,
			@RequestParam String nombre,
			@RequestParam String Apellido1,
			@RequestParam String Apellido2,
			@RequestParam String correo,
			@RequestParam Integer dia,
			@RequestParam Integer mes,
			@RequestParam Integer anio,
			@RequestParam String contrasenia,
			@RequestParam String hm,
			@RequestParam String direccion,
			@RequestParam String estudios,
			@RequestParam String temas
			) {

		modelo.addAttribute("nombre_form", nombre);
		modelo.addAttribute("Apellido1_form", Apellido1);
		modelo.addAttribute("Apellido2_form", Apellido2);
		modelo.addAttribute("correo_form", correo);
		modelo.addAttribute("dia_form", dia);
		modelo.addAttribute("mes_form", mes);
		modelo.addAttribute("anio_form", anio);
		modelo.addAttribute("contrasenia_form", contrasenia);
		modelo.addAttribute("hm_form", hm);
		modelo.addAttribute("direccion_form", direccion);
		modelo.addAttribute("estudios_form",estudios);
		modelo.addAttribute("temas_form",temas);
		

		return "DatosForm";
	}
	
}
