package com.PDW.ProyectoDW.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.security.Principal;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model, Principal principal,
			RedirectAttributes flash) {
			boolean estado = false;
		if (principal != null) {
			flash.addFlashAttribute("info", "Ya ha inciado sesión anteriormente");
			estado = true;
			return "redirect:/";
		}

		if (error != null) {
			model.addAttribute("error",
					"Error en el login: Nombre de usuario o contraseña incorrecta, por favor vuelva a intentarlo!");
			estado = false;
		}

		if (logout != null) {
			model.addAttribute("success", "Ha cerrado sesión con éxito!");
			estado = false;
		}
		String est = estado + "";
		model.addAttribute("estado",est);
		return "login";
	
}}