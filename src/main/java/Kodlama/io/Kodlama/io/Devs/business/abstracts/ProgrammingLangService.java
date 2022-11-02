package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.programmingLanguage;

public interface ProgrammingLangService {

	List<programmingLanguage> getALl();
	void add(programmingLanguage ProgrammingLanguage) throws Exception;
	void update(programmingLanguage programmingLanguage) throws Exception;
	void delete(programmingLanguage programmingLanguage);
	programmingLanguage getOneById(int id);
}
