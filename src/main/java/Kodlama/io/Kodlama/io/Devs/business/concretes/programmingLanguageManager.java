package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLangService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.programmingLangRepo;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.programmingLanguage;
@Service
public class programmingLanguageManager implements ProgrammingLangService {
	
	private programmingLangRepo programmingLangrepo;
	@Autowired
	public programmingLanguageManager(programmingLangRepo programmingLangrepo) {
		this.programmingLangrepo = programmingLangrepo;
	}

	@Override
	public List<programmingLanguage> getALl() {
		// TODO Auto-generated method stub
		return programmingLangrepo.getAll();
	}

	@Override
	public void add(programmingLanguage ProgrammingLanguage) throws Exception {
	 for(programmingLanguage programmingLanguages : this.programmingLangrepo.getAll()) {
		 if(ProgrammingLanguage.getIsim() == programmingLanguages.getIsim()) {
			 throw new Exception("sistemde bu kurs mevcut");
		 }
			 else if(ProgrammingLanguage.getIsim() == null) {
				 throw new Exception ("programlama dili boş girilemez");
			
			 
		 }
	 }
		
	}

	@Override
	public void update(programmingLanguage programmingLanguage) throws Exception {
		// TODO Auto-generated method stub
		for(programmingLanguage programmingLanguages : this.programmingLangrepo.getAll() ) {
			if(programmingLanguage.getIsim() == programmingLanguages.getIsim()) {
				throw new Exception("sistemde kurt mevcut ");
			 }
			 else if(programmingLanguage.getIsim() == null) {
				 throw new Exception ("programlama dili boş girilemez");
			
			}
		}
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
