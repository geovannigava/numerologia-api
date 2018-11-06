package com.exemplo.numerologiaapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.numerologiaapi.model.TendOculta;
import com.exemplo.numerologiaapi.repository.TendOcultaRepository;

@RestController
@RequestMapping("/tendocultas")
public class TendOcultasResource {
	
	@Autowired
	private TendOcultaRepository tendocultaRepository;
	
	@GetMapping
	public List<TendOculta> listar(){
		return tendocultaRepository.findAll();
	}

}
