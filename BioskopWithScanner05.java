import java.util.Scanner;
public class BioskopWithScanner05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int baris, kolom, menu;
    String nama;
    String [][]penonton = new String [4][2];    

    while (true) {
        System.out.println("\n======MENU BIOSKOP=====");
        System.out.println(" 1: Input data penonton ");
        System.out.println(" 2: Tampilkan daftar penonton");
        System.out.println(" 3: Exit");
        System.out.print("pilih salah satu menu : ");
        menu = sc.nextInt();
        sc.nextLine();

    switch  (menu) {
        case 1:
        System.out.print ("masukkan nama : ");
        nama = sc.nextLine();
        System.out.print ("masukkan baris : ");
        baris = sc.nextInt();
        System.out.print ("masukkan kolom : ");
        kolom = sc.nextInt();
        sc.nextLine();

        if ( baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length ) {
            System.out.println("nomor baris atau kolom tidak tersedia! Silahkan coba lagi");
        } else if (penonton[baris-1][kolom-1] != null) {
            System.out.println("kursi ini sudah terisi! silahka pilih kursi yang kosong");

        } else {
              penonton[baris -1] [kolom-1]= nama;
        System.out.println("Data penonton berhasil disimpan!");
        }
              break;

      

        case 2:
        System.out.println("\n=====DAFTAR PENONTON=====");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                System.out.println("Baris " + (i+1) + " kolom " + (j + 1)+": "+ penonton[i][j]);
            }
        }
        break;

        case 3:
        System.out.println("Terima kasih");
        sc.close();
        return;

        default:
        System.out.println("Menu tidak valid, silahkan coba lagi");

    }
}
    }
}


