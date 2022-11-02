package Kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.programmingLangRepo;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.programmingLanguage;

@Repository
public class inMemoryProgramLang implements programmingLangRepo{
	List<programmingLanguage> programmingLanguages;
	
	 public inMemoryProgramLang() {
		programmingLanguages = new ArrayList<>();
		programmingLanguages.add(new programmingLanguage("pyton", 1));
		programmingLanguages.add(new programmingLanguage("java", 2));
		programmingLanguages.add(new programmingLanguage("c+", 3));
		
	} 
	
	
	
	
	@Override
	public List<programmingLanguage> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(programmingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(programmingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(programmingLanguage programmingLanguage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public programmingLanguage getOneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
