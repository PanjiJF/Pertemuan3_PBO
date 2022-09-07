package eksplor;
/**
 * 
 * 
 * @author Panji Judha Fadhilla
 * 
 */
import java.util.Scanner;

public class Soal1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		while(true) {
		String s = input.nextLine();
		if (s.length() < 1 || s.length() > 400000) {
			System.out.print("Input melewati batas");
		} else {
			String[] token = s.split(" |\\!|\\,|\\?|\\_|\\'|\\@",-1);
			int n = token.length;
			System.out.println(n);
			for(int index = 0; index < n;index += 1) {
				System.out.println(token[index]);
			}
			break;
		}
		}
	}
}
