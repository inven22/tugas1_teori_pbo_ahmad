/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmad al fajri
 */
import java.util.Scanner;
public class nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Masukkan nilai tugas: ");
        float nilaiTugas = scanner.nextFloat();
        
        System.out.print("Masukkan nilai UTS: ");
        float nilaiUTS = scanner.nextFloat();

        System.out.print("Masukkan nilai UAS: ");
        float nilaiUAS = scanner.nextFloat();

        float nilaiAkhir = 0.20f * nilaiTugas + 0.35f * nilaiUTS + 0.45f * nilaiUAS;
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        String grade;
        if (nilaiAkhir > 85) {
            grade = "A";
        } else if (nilaiAkhir >= 75) {
            grade = "B";
        } else if (nilaiAkhir >= 65) {
            grade = "C";
        } else if (nilaiAkhir >= 49) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);
        System.out.println("===== Terima kasih telah mengunakan aplikasi ini ====");
        
       
        
    }
}
