package p2;

public class LetterGame {
	public String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUEER DURCH BAYERN!"; 
	public String word = "";
	
	
public void setWord(int[] a) {
	for(int i=0; i <= a.length; i++) {
		word = word + keyString.charAt(a[i]);
	}
	  
	
}

	

	
}
