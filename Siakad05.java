import java.util.Scanner;
public class Siakad05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa : ");
        int jmlhMahaSiswa = sc.nextInt();
        System.out.print("masukkan jumlah mata kulia : ");
        int jmlhMatkul = sc.nextInt();
 
        int [][] nilai = new int [jmlhMahaSiswa][jmlhMatkul];

        for (int i = 0; i <jmlhMahaSiswa; i++) {
            System.out.println ("\nInput nilai untuk mahasiswa ke-" + (i+1));

            double totalPerSiswa = 0;

            for (int j = 0; j < jmlhMatkul; j++) {
                System.out.print ("nilai mata kuliah " + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            double ratapersiswa = totalPerSiswa/jmlhMatkul;
            System.out.println ("Nilai rata - rata mahasiwa ke-" + (i+1) + ": " + ratapersiswa);
        }
        System.out.println("\n============================================");
        System.out.println("Rata-rata Nilai setiap mata kuliah: ");

        for (int j = 0; j < jmlhMatkul; j++) {
            double totalPerMatkul = 0 ;

            for (int i = 0; i < jmlhMahaSiswa; i++) {
            totalPerMatkul += nilai[i][j];
        }

        double rataPerMatkul= totalPerMatkul/jmlhMahaSiswa;
        System.out.println("Mata kuliah " + (j+1)+ ": "+ rataPerMatkul);
        }

        sc.close();
    }
    }
     
