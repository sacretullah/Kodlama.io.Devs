package Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.programmingLanguage;

public interface programmingLangRepo {
List<programmingLanguage> getAll();
void add(programmingLanguage programmingLanguage);
void update(programmingLanguage programmingLanguage);
void delete(programmingLanguage programmingLanguage);
programmingLanguage getOneById(int id);

}
