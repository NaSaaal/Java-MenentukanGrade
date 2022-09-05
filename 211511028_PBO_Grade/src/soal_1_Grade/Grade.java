//@Author Naufal Salman Mulyadi
package soal_1_Grade;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		char nilai;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nilai Tugas: ");
		float nilaiTugas =  scanner.nextFloat();
		System.out.print("Nilai UTS: ");
		float nilaiUTS = scanner.nextFloat();
		System.out.print("Nilai UAS: ");
		float nilaiUAS = scanner.nextFloat();
		
		if(scanner != null) {
		    scanner.close();
		}
		
		nilaiTugas = (float) (nilaiTugas * 0.2);
		nilaiUTS = (float) (nilaiUTS * 0.35);
		nilaiUAS = (float) (nilaiUAS * 0.45);
		float nilaiAkhir = (float) (nilaiTugas + nilaiUTS + nilaiUAS);
		
		if (nilaiAkhir > 85) {
			nilai = 'A';
		}else if(nilaiAkhir > 75) {
			nilai = 'B';
		}else if(nilaiAkhir > 65) {
			nilai = 'C';
		}else if(nilaiAkhir > 49) {
			nilai = 'D';
		}else {
			nilai = 'E';
		}
		
		System.out.println("Nilai Akhir: " + nilaiAkhir);
		System.out.println("Nilai: " + nilai);

	}

}
