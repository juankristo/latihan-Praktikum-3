/**
 *contoh aplikasi restoran sederhana yang menggunakan seleksi
 *dan looping
*/

import java.util.Scanner;

public class latihan10 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int pilihan;
		boolean loop = true;
		
		System.out.println("Menu pilihan: ");
		System.out.println("1. nasi goreng ayam");
		System.out.println("2. nasi goreng seafood");
		System.out.println("3. soto ayam");
		System.out.println("4. juice jeruk");
		System.out.println("Pilihan: ");
		pilihan = input.nextInt();
		
		while(loop){
			switch(pilihan) {
				case 1:
					System.out.println("anda memilih nasi goreng ayam");
					loop = false;
					break;
				case 2:
					System.out.println("anda memilih nasi goreng seafood");
					loop = false;
					break;
				case 3:
					System.out.println("anda memilih soto ayam");
					loop = false;
					break;
				case 4:
					System.out.println("anda memilih juice jeruk");
					loop = false;
					break;
					
				default:
					System.out.println("silahkan pilih menu 1-4");
					
			}
		}
		
		System.out.println("pesanan anda akan diantar sebentar lagi ");
		
	}
}