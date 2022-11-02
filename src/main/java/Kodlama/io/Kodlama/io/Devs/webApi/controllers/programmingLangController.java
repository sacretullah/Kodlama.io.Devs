package Kodlama.io.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLangService;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.programmingLanguage;

@RestController
@RequestMapping
public class programmingLangController {
private ProgrammingLangService ProgrammingLangService;

@Autowired
public programmingLangController(ProgrammingLangService programmingLangService) {
	this.ProgrammingLangService = programmingLangService;
}
	@GetMapping
	public List<programmingLanguage> getAll(){
		return ProgrammingLangService.getALl();
		
	}
	@GetMapping("{/id}")
	public programmingLanguage getOneById(int id) {
		return ProgrammingLangService.getOneById(id);
		
	}
	
}

