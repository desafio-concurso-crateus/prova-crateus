package com.ufc.crateus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ufc.crateus.model.Candidato;
import com.ufc.crateus.repository.CandidatoRepository;
import com.ufc.crateus.service.CandidatoService;

@Controller
@RequestMapping("/candidato")
public class CandidatoController {
	
	@Autowired
	private CandidatoService candidatoService;
	
	/*
	 * spring.datasource.url=jdbc:mysql://lec53:3306/candidato6
	 * spring.datasource.username=candidato6 spring.datasource.password=cand6
	 * spring.datasource.driver-class-name=com.mysql.jdbc.Driver
	 * spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
	 * spring.jpa.hibernate.ddl-auto=update
	 */
	
	
	@RequestMapping("/formulario")
	public ModelAndView form() {
		ModelAndView mv = new ModelAndView("formulario");
		return mv;
		
	}
	
	@RequestMapping("/salvar")
	public ModelAndView cadastrar(Candidato candidato) {
		ModelAndView mv = new ModelAndView("sucesso");
		candidatoService.cadastrarCandidato(candidato);
		return mv;
		
	}
	
	
	@RequestMapping("/inscritos")
	public ModelAndView listar() {
		ModelAndView mv = new ModelAndView("pagina-listagem");
		List<Candidato> candidatos = candidatoService.listarPorOrdemAlfabetica();
		mv.addObject("candidatos", candidatos);
		return mv;
	}
	

}
