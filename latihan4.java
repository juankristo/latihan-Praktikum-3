import java.util.Scanner;

public class latihan4 {
	
  public static void main(String[] args) {
    int maksimum, minimum, jumlah, i, lokasi = 1, array[], x, lokasi2=1;
    
    Scanner scan = new Scanner(System.in);
   
    jumlah = 5;
    
    array = new int[jumlah];
    
   System.out.println("Untuk Menghitung Nilai MAX");
   
    for(i = 0; i < jumlah; i++) {
      System.out.print("Masukkan Elemen ke-"+ (i+1) +": " );
      array[i] = scan.nextInt();
    }
    
    maksimum = array[0];
    for(i = 0; i < jumlah; i++) {
      if (array[i] > maksimum){
        maksimum = array[i];
        lokasi = i+1;
      }
    }
    System.out.println("Nilai maksimum adalah "+maksimum+" berada di elemen ke "+lokasi );
    
    
    
    

    
   System.out.println("Untuk Menghitung Nilai MIN");
   
    
    minimum = array[0];
    for(x = 0; x < jumlah; x++) {
      if (array[x] < minimum){
        minimum = array[x];
        lokasi2 = x+1;
      }
    }
    System.out.println("Nilai minimum adalah "+minimum+" berada di elemen ke "+lokasi2);
    
   
    
    
  }
}