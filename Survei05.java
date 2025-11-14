import java.util.Scanner;
public class Survei05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [][] survey = new int [10][6];

        for (int i = 0; i < survey.length; i++) {
            System.out.println("Responden ke- " + (i+1));

            for (int j = 0; j < survey[i].length; j++) {
                System.out.print("Nilai pertanyyan ke-" + (j+1)+" (1-5) :");
                survey[i][j] = sc.nextInt();
            }
            System.out.println();

        }
        

        sc.close();
        
    }
    
}
