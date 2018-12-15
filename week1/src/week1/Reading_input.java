package week1;

import java.util.Scanner;

public class Reading_input {
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Masukkan Nama : ");
		String nama = input.nextLine();
		
		System.out.printf("Masukkan NIM  : ");
		int nim = input.nextInt();
		
		System.out.println("Nama : " + nama);
		System.out.println("NIM  : " + nim);
	}

}
