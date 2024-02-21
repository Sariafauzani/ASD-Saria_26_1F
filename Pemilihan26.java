import java.util.Scanner;

public class Pemilihan26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        // Meminta input nilai tugas, kuis, UTS, dan UAS
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================================");
        System.out.println("==================================\n");
        System.out.print("Masukkan Nilai Tugas : ");
        int nilaiTugas = input26.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int nilaiKuis = input26.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int nilaiUTS = input26.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int nilaiUAS = input26.nextInt();
        System.out.println("==================================");
        System.out.println("==================================\n");

        // Memeriksa nilai yang di inputkan valid atau tidak
        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
        nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
            System.out.println("=================================");
            return;
        }

        // Menghitung nilai akhir sesuai ketentuan
        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;

        // Mengkonversi nilai akhir menjadi nilai huruf
        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir >= 0) {
            nilaiHuruf = "E";
        } else {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        // Menampilkan nilai akhir, nilai huruf, dan keterangan lulus/tidak lulus
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("==================================\n");
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || 
        nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
    }
    
}