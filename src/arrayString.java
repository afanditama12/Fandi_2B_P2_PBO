import java.util.Scanner;

public class arrayString {
    public static void main(String[] args) {
        String NPM[], Nama[];
        int banyakMHS, indeks;
        Scanner input = new Scanner(System.in);
        System.out.println("Banyak Mahasiswa = ");
        banyakMHS = input.nextInt();
        NPM = new String[banyakMHS];
        Nama = new String[banyakMHS];
        for (indeks = 0; indeks < banyakMHS; indeks++) {
            System.out.println("Data Mahasiswa indeks ke-" + indeks);
            System.out.println("NPM : ");
            NPM[indeks] = input.next();
            System.out.println("Nama : ");
            Nama[indeks] = input.next();
        }
        System.out.println("Rekap Data MAHASISWA\nNPM\t\tNama");
        for (indeks = 0; indeks < banyakMHS; indeks++)
            System.out.println(NPM[indeks] + "\t" + Nama[indeks]);
    }
}
