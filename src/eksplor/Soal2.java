package eksplor;

import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s=input.next();
                int angka=input.nextInt();
                if(s.length() < 10 && angka >= 0 && angka <= 999) {
                	System.out.printf("%-15s", s);
                	System.out.printf("%03d\n", angka );
                }
                else {
                	System.out.printf("error input");
                }
            }
            System.out.println("================================");

    }
}
