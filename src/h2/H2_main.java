package h2;

import java.util.Arrays;

public class H2_main { public static void main(String[] args) {
	
int [] t = {2,7,1,9};
int [] s = {2,7,1,9};
System.out.print(Arrays.toString(change(t,s, 3, 2)));	

	
	
}

public static int[] change(int[] a, int [] b, int start, int end){
	if(end>start) {
		if(Arrays.compare(a, b)!=0) {
			int [] c = a;
			return c;	
		} 
		
		if(Arrays.compare(a, b) == 0) {
			Arrays.sort(a);
			int [] c = Arrays.copyOfRange(a, start, end);
			return c;
			} }
	if(end<=start){
		int [] c = {};
		return c;	}
	
	return b;}}


