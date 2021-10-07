public class latihan9 {
	public static void main(String[] args) {
		int batas = 0;
		do {
			System.out.print(batas);
			batas++; 		
			//jika batas++ diganti menjadi batas-- 
			//maka outputnya adalah infinite loop 
			
		} while (batas<10);
	}
}