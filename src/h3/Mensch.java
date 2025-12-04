package h3;

public class Mensch {
	public String name;
	public int alter, gebJahr;
	
	public Mensch() {}
	
	public void setName(String s) {
		name = s;
	}
	
	public void setGebJahr(int a) {
		gebJahr = a;
	}
	
	public void setAlter() {
		alter = 2025-gebJahr;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGebJahr() {
		return gebJahr;
	}
	
	public int getAlter() {
		return alter;
	}

}
