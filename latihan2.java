import java.util.Scanner;
public class latihan2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("masukkan nilai = ");
		nilai = input.nextInt();
		
	//posisi if berjalan
	if(nilai==1){
			System.out.println("angka yang dimasukkan adalah satu");
		}
		else
			System.out.println("angka yang dimasukkan bukan satu");
	}
}