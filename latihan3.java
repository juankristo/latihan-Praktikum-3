import java.util.Scanner;
public class latihan3
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("masukkan nilai = ");
		nilai = input.nextInt();
		
	//posisi if berjalan
	if(nilai % 2 == 0){
		System.out.println("angka yang dimasukkan adalah genap");
		}
		else
		System.out.println("angka yang dimasukkan adalah ganjil");
		
	}
}