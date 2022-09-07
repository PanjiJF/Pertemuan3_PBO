package eksplor;
import java.util.Scanner;
import java.math.*;

/**
 * 
 * @author Panji Judha Fadhilla
 * NIM : 211511053
 */
public class Soal6 {
	 public static void main(String[] args){
		 Scanner scan = new Scanner(System.in);
		 BigInteger a = new BigInteger(scan.nextLine());
		 BigInteger b = new BigInteger(scan.nextLine());
		 BigInteger tambah = a.add(b);   
		 BigInteger kali = a.multiply(b);   
		 
		 System.out.println(tambah+"\n"+kali);
	 }
}
