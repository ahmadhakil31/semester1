import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Jumlah Data :");
		int jumlah data = sc.nextInt();
		int[] angka = new int[jumlah data];
		double total;
		
		
		for (int i = 0; i < jumlah data; i++) {
			angka[i] = sc nextInt();
			System.out.println("Masukan angka ke -" + i);
			
			if (angka[i]%2!= 0) {
				System.out.println("Angka ganjil" + angka[i]);
			} if (angka [i] %2==0)
				System.out.println("Angka genap" + angka[i]);
			}
			
		}
	}	