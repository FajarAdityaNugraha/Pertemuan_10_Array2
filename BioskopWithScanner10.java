/**
 * Bioskop10
 */
import java.util.Scanner;
public class BioskopWithScanner10 {

    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        int baris=0, kolom=0;
        String nama, next;
        String [][] penonton = new String[4][2];
        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Silahkan Pilih Menu: ");
            int pilihan = input10.nextInt();
            input10.nextLine();
            switch (pilihan) {
                case 1:
                System.out.print("Masukkan Nama: ");
                nama = input10.nextLine();
                System.out.print("Masukkan Baris: ");
                baris = input10.nextInt();
                System.out.print("Masukkan Kolom: ");
                kolom = input10.nextInt();
                input10.nextLine();
                penonton[baris-1][kolom-1] = nama;
                if (baris >=1 && baris <=4 && kolom >=1 && kolom <=2) {
                    penonton[baris-1][kolom-1]=nama;
                    System.out.println("Data Penonton Berhasil Dimasukkan ");
                } else {
                    System.out.println("Kursi Tidak Tersedia!");
                }
                break;
                case 2:
                System.out.println("Daftar Penonton: ");
                for (int i=0;i<4;i++) {
                    for (int j=0;j<2;j++) {
                        if (penonton[i][j]!=null) {
                            System.out.println(("Baris"+(i+1)+", Kolom")+(j+1)+" : "+penonton[i][j]);
                        }
                    }
                }
                break;
                case 3:
                System.out.println("Program Telah Selesai.");
                System.exit(0);
                default:
                System.out.println("Pilihan Tidak Sesuai! Silahkan Pilih Menu Yang Sesuai!");
            }
            System.out.print("Lanjutkan (y/n): ");
            next = input10.nextLine();
            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}