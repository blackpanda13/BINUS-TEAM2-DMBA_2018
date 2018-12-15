package week4;


public class Operators {
	public static void main (String[]args) {
		
		int a;
		int b;
		int c;
		int d;
		
		a = 20;
		b = ++a;
		c = --b + a++;
		d = c-- + b;
		
		System.out.println("hasil a = " + a);
		System.out.println("hasil b = " + b);
		System.out.println("hasil c = " + c);
		System.out.println("hasil d = " + d);
	}
}
