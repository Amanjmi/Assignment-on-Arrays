
	import java.util.*;
	class Guesser
	{
		int guessNo;
		
		int guessNo()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Guesser Please guess the number in range of (1 to 20)");
			guessNo=scan.nextInt();
			return guessNo;
		}	
	}

	class Player
	//If player will enter beyond the range, will get the below massage.
	// invalid no!! Lost your chance, Next time Kindly guess in range of (1 to 20)
	{
		int guessNo;
		
		int guessNo()
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Player Please guess the number");
			guessNo=scan.nextInt();
			if (guessNo<1 || guessNo>20) {
				System.out.println("Invalid no!! Lost your chance, Next time Kindly guess in range of (1 to 20)");
				System.out.println();
				guessNo=0;
				
			}
			return guessNo;
		}
	}

	class Umpire
	{
		int numFromGuesser;
		int numFromPlayer1;
		int numFromPlayer2;
		int numFromPlayer3;
		
		void collectNumFromGuesser()
		{
			Guesser g=new Guesser();
			numFromGuesser=g.guessNo();
		}
		void collectNumFromPlayers()
		{
			Player p1=new Player();
			Player p2=new Player();
			Player p3=new Player();
			numFromPlayer1=p1.guessNo();
			numFromPlayer2=p2.guessNo();
			numFromPlayer3=p3.guessNo();
		}
		void compare()
		{
			if(numFromGuesser==numFromPlayer1)
			{
				if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				{
					System.out.println("All players won the game");
				}
				else if(numFromGuesser==numFromPlayer2 )
				{
					System.out.println("Player 1 & Player2 won");
				}
				else if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 1 & Player3 won");
				}
				else
				{
				System.out.println("Player 1 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				if(numFromGuesser==numFromPlayer3)
				{
					System.out.println("Player 2 & Player3 won");
				}
				else
				{
				System.out.println("Player 2 won the game");
				}
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 3 won the game");
			}
			else
			{
				System.out.println("Game lost Try Again!");
			}
			
		}
		
	}


	public class Guessergame1 {

		public static void main(String[] args) {
			
				Umpire u=new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();

		}

	}

