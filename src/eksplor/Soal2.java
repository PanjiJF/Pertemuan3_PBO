package eksplor;
/**
 * @author Panji Judha Fadhilla
 * NIM : 211511053
 */
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int index = 3;
            String[] s = new String[index];
            int[] angka = new int[index];
            int i=0;
            while(i<index)
            {
            	s[i]=input.next();
            	angka[i]=input.nextInt();
            	if(s[i].length() > 10 || (angka[i] > 999 || angka[i] < 0))//constraint
            		System.out.println("Melebihi Batas Input");
            	else
            		i+=1;
            }
            System.out.println("================================");
            for(int x=0;x < index;x+=1) 
            {
	           	System.out.printf("%-15s", s[x]);
	          	System.out.printf("%03d\n", angka[x] );
            }
	        System.out.println("================================");

    }
}
