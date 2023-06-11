package com.alemeza.world.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alemeza.world.repositories.PaisRepo;

@Service
public class APIService {
	@Autowired
	private PaisRepo paisRepo;

	// query 1
	public List<Object[]> paisesHablaSloveno() {
		return paisRepo.paisesHablaSloveno();
	}

	// query 2
	public List<Object[]> numeroCiudadesPorPais() {
		return paisRepo.numeroCiudadesPorPais();
	}

	// query 3
	public List<Object[]> poblacionMexicoMayo500k() {
		return paisRepo.poblacionMexicoMayo500k();
	}

	// query 4
	public List<Object[]> lenguajesPorPaisMayor89() {
		return paisRepo.lenguajesPorPaisMayor89();
	}
	// query 5
	public List<Object[]> superficieMenor500MayorPoblacion100k() {
		return paisRepo.superficieMenor500MayorPoblacion100k();
	}
	// query 6
	public List<Object[]> soloMonarchy() {
		return paisRepo.soloMonarchy();
	}
	// query 7
	public List<Object[]> ciudadesBuenosAiresPoblacion() {
		return paisRepo.ciudadesBuenosAiresPoblacion();
	}
	// query 8
	public List<Object[]> numeroPaisesPorRegion() {
		return paisRepo.numeroPaisesPorRegion();
	}

}