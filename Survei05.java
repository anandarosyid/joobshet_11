import java.util.Scanner;
public class Survei05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] survey = new int [10][6];
        int[] rataPertanyaan = new int [6];
        int totalKeseluruhan = 0;
        


        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke- " + (i+1));

            int total= 0;
            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Nilai pertanyaan ke-" + (j+1)+" (1-5) :");
                survey[i][j] = sc.nextInt();

                total=total+survey[i][j];
                rataPertanyaan[j] += survey[i][j];
                totalKeseluruhan += survey[i][j];

                
            }
            double rataRespon = total / 6.0;
            System.out.println("Rata rata responde ke- " +(i+1)+ " adalah " +rataRespon);
            System.out.println();

        }
        System.out.println("====RATA RATA SETIAP PERTANYAAN====");
        for (int i = 0; i < 6; i++){
            System.out.println("rata-rata pertanyaan "+ (i+1)+"= "+(rataPertanyaan[i]/10.0));
        }

        double rataKeseluruhan = totalKeseluruhan / 60.0;
        System.out.println("\n====RATA-RATA KESELURUHAN====");
        System.out.println("Rata-rata keseluruhan :" + rataKeseluruhan);

        

        sc.close();
        
    }
    
}
