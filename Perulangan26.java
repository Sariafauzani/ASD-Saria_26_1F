import java.util.Scanner;

public class Perulangan26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        // Meminta input NIM pengguna
        System.out.println("Program Menampilkan Deretan Bilangan dari angka 1 sampai n");
        System.out.println("==========================================================");
        System.out.print("Masukkan NIM : ");
        String NIM = input26.next();
        System.out.println("=======================");
        
        // Mendapatkan dua digit terakhir NIM
        int n = Integer.parseInt(NIM.substring(NIM.length() - 2));

        // Jika n kurang dari 10, maka ditambah 10
        if (n < 10) {
            n += 10;
        }
        System.out.println("n : " + n);

        // Menampilkan deretan bilangan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // 6 dan 10 dilewati
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
