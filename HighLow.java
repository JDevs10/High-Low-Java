import java.util.Random;
import java.util.Scanner;

public class HighLow {
	private String userAnweser;
	private int randomNumber;
	private int userInput;

	public void HighLowGame() {
		// TODO Auto-generated constructor stub
		do {
			randomNumber = randomNb();
			int i=0;
			while(i<10) {
				
				System.out.println(randomNumber+" Enter a number: \n");
				Scanner sc = new Scanner(System.in);
				userInput = sc.nextInt();
				
				if (userInput == randomNumber) {
					System.out.println("Congraz!!! you found the numbre : "+randomNumber);	break;
				} else if (userInput > randomNumber) {
					System.out.println("The number is lower than "+userInput);
				} else {
					System.out.println("The number is higher than "+userInput);
				}
				i++;
			}
			
			System.out.println("You found the number in "+i+" times");
			
			System.out.println("Do you want to continue y|n ? ");
			Scanner scc = new Scanner(System.in);
			userAnweser = scc.nextLine().trim();
		}while(userAnweser.equals("y"));
	}

	private int randomNb() {
		Random rand = new Random();
		return rand.nextInt((100-1)+1)+1;
	}

}
