package com.alemeza.world.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alemeza.world.services.APIService;

@Controller
public class MainController {
	@Autowired
	private APIService apiService;
//	@Autowired
//	private PaisRepo paisRepo;
	
	
	@GetMapping("/")
	public String raiz(Model viewModel) {
		List<Object[]> paisesHablaSloveno = apiService.paisesHablaSloveno();
		List<Object[]> numeroCiudadesPorPais = apiService.numeroCiudadesPorPais();	
		List<Object[]> poblacionMexicoMayo500k = apiService.poblacionMexicoMayo500k();
		List<Object[]> lenguajesPorPaisMayor89 = apiService.lenguajesPorPaisMayor89();
		List<Object[]> superficieMenor500MayorPoblacion100k = apiService.superficieMenor500MayorPoblacion100k();
		List<Object[]> soloMonarchy = apiService.soloMonarchy();
		List<Object[]> ciudadesBuenosAiresPoblacion = apiService.ciudadesBuenosAiresPoblacion();
		List<Object[]> numeroPaisesPorRegion = apiService.numeroPaisesPorRegion();
		
		
		viewModel.addAttribute("paisesHablaSloveno", paisesHablaSloveno);
		viewModel.addAttribute("numeroCiudadesPorPais", numeroCiudadesPorPais);
		viewModel.addAttribute("poblacionMexicoMayo500k", poblacionMexicoMayo500k);
		viewModel.addAttribute("lenguajesPorPaisMayor89", lenguajesPorPaisMayor89);
		viewModel.addAttribute("superficieMenor500MayorPoblacion100k", superficieMenor500MayorPoblacion100k);
		viewModel.addAttribute("soloMonarchy", soloMonarchy);
		viewModel.addAttribute("ciudadesBuenosAiresPoblacion", ciudadesBuenosAiresPoblacion);
		viewModel.addAttribute("numeroPaisesPorRegion", numeroPaisesPorRegion);
		
		return "index.jsp";
	}
	

}