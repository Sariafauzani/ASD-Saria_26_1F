import java.util.Scanner;

public class Array26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        // Deklarasi array untuk nama mata kuliah
        String[] namaMatkul = {"Agama", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Bahasa Indonesia", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Pengantar Akuntansi Manajemen Bisnis"};

        // Deklarasi array untuk SKS
        int[] sks = {2, 2, 2, 2, 2, 2, 2, 3, 2};

        // Deklarasi array untuk nilai angka
        double[] nilaiSetara = new double[namaMatkul.length];

        // Membaca nilai angka dari pengguna
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMatkul[i] + ": ");
            nilaiSetara[i] = scanner.nextDouble();
        }

        // Array untuk bobot nilai
        double[] bobotNilai = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0};

        // Menghitung total SKS dan IP Semester
        int totalSks = 0;
        double ipSemester = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            totalSks += sks[i];
            ipSemester += bobotNilai[konversiNilaiIndex(nilaiSetara[i])] * sks[i];
        }

        // Menghitung IP Semester
        ipSemester /= totalSks;

        // Menampilkan hasil
        System.out.println("=============================");
        System.out.println("Hasil IP Semester");
        System.out.println("=============================");
        System.out.printf("%-45s %-20s %-20s %-20s %-20s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "SKS");

        for (int i = 0; i < namaMatkul.length; i++) {
            double nilaiSetaraTemp = konversiNilaiAngka(nilaiSetara[i]);
            String nilaiHuruf = konversiNilaiHuruf(nilaiSetaraTemp);

            System.out.printf("%-45s %-20.1f %-20s %-20.1f %-20d\n", namaMatkul[i], nilaiSetara[i], nilaiHuruf, 
            bobotNilai[konversiNilaiIndex(nilaiSetara[i])], sks[i]);
        }
        System.out.println("Total SKS: " + totalSks); // Menampilkan total SKS
        System.out.println("\nIP: " + String.format("%.2f", ipSemester)); // Menampilkan IP Semester
    }

    // Metode untuk mengonversi nilai angka menjadi nilai setara sesuai tabel konversi
    public static double konversiNilaiAngka(double nilaiAngka) {
        if (nilaiAngka >= 85) {
            return 4.0;
        } else if (nilaiAngka >= 73) {
            return 3.5;
        } else if (nilaiAngka >= 65) {
            return 3.0;
        } else if (nilaiAngka >= 60) {
            return 2.5;
        } else if (nilaiAngka >= 50) {
            return 2.0;
        } else if (nilaiAngka >= 39) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    // Metode untuk mengonversi nilai setara menjadi indeks array bobot nilai
    public static int konversiNilaiIndex(double nilaiAngka) {
        if (nilaiAngka >= 85) {
            return 0;
        } else if (nilaiAngka >= 73) {
            return 1;
        } else if (nilaiAngka >= 65) {
            return 2;
        } else if (nilaiAngka >= 60) {
            return 3;
        } else if (nilaiAngka >= 50) {
            return 4;
        } else {
            return 5;
        }
    }

    // Metode untuk mengonversi nilai setara menjadi nilai huruf
    public static String konversiNilaiHuruf(double nilaiSetara) {
        if (nilaiSetara == 4.0) {
            return "A";
        } else if (nilaiSetara >= 3.5) {
            return "B+";
        } else if (nilaiSetara >= 3.0) {
            return "B";
        } else if (nilaiSetara >= 2.5) {
            return "C+";
        } else if (nilaiSetara >= 2.0) {
            return "C";
        } else if (nilaiSetara >= 1.0) {
            return "D";
        } else {
            return "E";
        }
    }
}
