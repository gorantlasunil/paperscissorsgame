package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(true)
	{
		String[] rps = {"rock","paper","scissors"};
		String computerMove = rps[new Random().nextInt(rps.length)];
//		System.out.println(computerMove);
		String playerMove;
		while(true)
		{
			System.out.println("please Enter your move as (rock,paper or scissor)");
			playerMove = scan.nextLine();
			if(playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors"))
			{
				break;
			}
			System.out.println(playerMove +"is not Vaild move: ");
		}
			System.out.println("computer played : "+computerMove);
			if(playerMove.equals(computerMove))
			{
				System.out.println("The Game Is TIE: ");
			}
			else if (playerMove.equals("rock")) {
				if(computerMove.equals("paper"))
				{
					System.out.println("You Lose! ");
					System.out.println("Game is Completed");
				}
				else if (computerMove.equals("scissors")) {
					System.out.println("You WIN");
				}
			}
			else if (playerMove.equals("paper")) {
				if(computerMove.equals("rock"))
                 {
                	 System.out.println("You WIN");
                 }
				else if (computerMove.equals("scissors")) {
					System.out.println("You LOSE");
				}
			}
			else if (playerMove.equals("scissors")) {
				if(computerMove.equals("rock"))
				{
					System.out.println("You WIN");
				}
				else if (computerMove.equals("paper")) {
					System.out.println("You Lose");
				}
			}
			System.out.println("Play Again ? (yes/no)");
			String playAgain = scan.nextLine();
			if(playAgain.equals("no"))
			{
				break;
			}
		}
		scan.close();
	}
}

