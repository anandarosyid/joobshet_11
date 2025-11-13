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

        penonton[baris -1] [kolom-1]= nama;
        System.out.println("Data penonton berhasil disimpan!");
        break;

        case 2:
        System.out.println("\n=====DAFTAR PENONTON=====");
        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                String isi = (penonton[i][j] == null )? "-" : penonton[i][j];
                System.out.println("Baris " + (i+1) + " kolom " + (j + 1)+": "+ isi);
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


