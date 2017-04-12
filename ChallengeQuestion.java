package Review.java;

import java.util.Scanner;

public class ChallengeQuestion {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		int birthMonth = 0;
		int birthYear = 0;
		birthMonth= scnr.nextInt();
		birthYear = scnr.nextInt();
		
		System.out.print(birthMonth + "/" + birthYear);

	}

}
