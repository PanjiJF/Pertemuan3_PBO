package eksplor;

import java.util.Scanner;

public class Soal5 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String plat4 = input.nextLine();
		String[] split = plat4.split(" ");
		String plat = split[0] + split[1] + split[2] + split[3];
		
		long sum = Long.parseLong(plat);
		sum -= 999999;
		System.out.println(sum);
		
		if(sum % 5 == 0) {
			System.out.println("berhenti");
		} else {
			System.out.println("jalan");
		}
	}
}
