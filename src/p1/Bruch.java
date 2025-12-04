package p1;

public class Bruch { 
	public int z, n;



public Bruch(int zaehler, int nenner) {
	z = zaehler;
	n = nenner;
}

public String toString() {
	
	String s = new String();
	s = z + ":" + n;
	return s;
}

}
