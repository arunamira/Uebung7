package p1;

public class P1_main { public static void main(String[] args) {
	
multFrac(5,2,3,4);
Bruch t = new Bruch(5, 2);
Bruch s = new Bruch(3, 4);
multFrac(t, s);
System.out.print(t.toString());
}


public static void multFrac(int z1, int n1, int z2, int n2) {
	int z = z1*z2;
	int n = n1*n2;
	System.out.println(z + ":" + n);
		
}

public static void multFrac(Bruch a, Bruch b) {
	int x = a.z * b.z;
	int y = a.n * b.n;
	System.out.println(x + ":" + y);
	//oder multFrac(a.z,a.n, b.z, b.n)

}

}
