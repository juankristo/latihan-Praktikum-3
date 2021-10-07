import java.util.Scanner;
public class latihan5
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("masukkan nilai = ");
		nilai = input.nextInt();
		
	if(nilai >= 0){
		System.out.println("angka yang dimasukkan adalah positif");
		}
		else
		System.out.println("angka yang dimasukkan adalah negatif");
		
	}
}