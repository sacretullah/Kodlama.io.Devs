package Kodlama.io.Kodlama.io.Devs.entities.concretes;

public class programmingLanguage {
	private String isim;
	private int ıd;
	public programmingLanguage() {
		
	}
	public programmingLanguage(String isim, int id) {
		
		this.isim = isim;
		ıd = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getId() {
		return ıd;
	}
	public void setId(int id) {
		ıd = id;
	}

}
