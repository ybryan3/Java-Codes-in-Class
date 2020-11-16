import java.io.*;
import java.util.*;

public class EndLessDiceGame 
{
	public static int computer = 0, human = 0, computerTurnScore = 0, userPreviousScore = 0, computerPreviousScore = 0;  //variables to be recycled
	public static Scanner sc = new Scanner(System.in);//Scanner for user input
	public static boolean done = false;
	
	/*PROGRAMMING STRATEGY
	 *ⓐGame begins
	 *ⓑHuman goes first, throws dice < [1] directs to computer's turn. [2~6] directs to user input for decision making >
	 *ⓒcomputer's turn < [1] directs to user's turn. [2~6] directs to continuous loop until that turn's score reaches more or equal to 20 >
	 *ⓓDice [1] also causes that turn's score to 0.
	 *ⓔInput mismatch catch for Scanner
	 */
	
	public static void main(String[] args) 
	{
	System.out.println("Welcome to endless dice game. Follow the instructions and enjoy urself!");
	System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
	
	    //START OF THE ACTUAL GAME
		while ( (human <= 100) || (computer <=100))	
		{
			humanTurn();// METHOD TO START THE GAME AND END THE GAME
		}

	}

	
	
	/*
	 * Human Turn Method / Start of The Game / End of The Game (Ending ①) Combined
	 *ⓑHuman goes first, throws dice < [1] directs to computer's turn. [2~6] directs to user input for decision making >

	 */

	public static void humanTurn() 
	{
    System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");	// score-board
	System.out.printf("■ <Current Score> Player : %d , Computer : %d ■\n", human, computer);
	System.out.println("■■■■■■■■■■■■■■■■■■■< PLAYER TURN >■■■■■■■■■■■■■■■■■■■");	// indication

		// first dice throw & Use of intertwined method recall
		while(!done)
		{
			try
			{
			System.out.println("It is your turn. Enter 'R' to roll the dice");
			String input = sc.next();
			char inputConvert = input.charAt(0);
			    
			    //Reading user input
				if(inputConvert == 'R')
				{
				int dice = (int)(Math.random() * 6) + 1;
				
					if(dice >= 2) // possibility 1st
					{
					human = human + dice;
				    System.out.printf("You rolled, %d\n" , dice);
				    System.out.printf("Your Current Score : %d\n", human);
				    
				    	if (human >= 100)	//user win condition (Ending ①)
				    	{
						System.out.printf("\n ٩(๑`^´๑)۶ You HAVE WON!! BUT ONLY THIS TIME! WITH THE SCORE OF %d. OH WELL, GOODBYE :)", human);
						System.exit(0);
				    	}
				    	
					additionalTurn(); //intertwined method recall
					
					}
					
					else if (dice == 1)	// possibility 2nd
					{
					System.out.println("You rolled [1] Too bad HAHAHAHAHAAHAHAH!!!!! You loose all your point for this turn!! Now it's the computer's turn.");
					human = userPreviousScore;
					System.out.printf("Your Current Score : %d\n\n", human);
					System.out.println("▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽");
					System.out.println(" ______");
					System.out.println("༼ つ ◕_◕ ༽つ ");
					System.out.println("└ ‿.̫.̫.̫.̫.‿┙");
					System.out.println("<Computer>: ˝Greetings Human, now it is my turn˝ ");
					computerTurnScore = 0;
					computerTurn(); //intertwined method recall
					}
			
				}
				
				if(inputConvert != 'R')
				{
				throw new Exception ("<SYSTEM MESSAGE> Enter Again, must enter according to given instruction  Ƹ• ͟ʖ•Ʒ ");
				}
				
			done = true; // not necessary
			
			}
			
			catch(Exception e) // catch of the input error (limited to first letter of input) 
			{
				String message = e.getMessage();
				System.out.println(message);
			}
			
		}
	}
	
	
	
	/*
	 * Computer Turn Method
	 *ⓒcomputer's turn < [1] directs to user's turn. [2~6] directs to continuous loop until that turn's score reaches more or equal to 20 >
	 */

	public static void computerTurn()
	{
		while (computerTurnScore <= 40)
		{
		int dice = (int)(Math.random() * 6) + 1;
		
		    //computer win condition (Ending ②)
			if (computer >= 100) 
			{
				System.out.printf("\n ٩(ˊᗜˋ*)و  I HAVE WON!! WITH THE SCORE OF %d WELL, GOODBYE :)", computer);
				System.exit(0);
			}
		
			if (dice == 1)
			{
			System.out.println("૮(ꂧꁞꂧ)ა");
			System.out.println("Oh no I rolled [1]!!!! I lost all my points for the turn!!");
			computer = computerPreviousScore;
			humanTurn();
			}
			
			else if (dice >= 2)
			{
			System.out.printf("◝(・ω・)◟ just got [%d]!!!\n", dice);
			computer = computer + dice;
			computerTurnScore = computerTurnScore + dice;
			
			    //computer win condition 2 (Ending ②)
				if (computer >= 100)
				{
				System.out.printf("\n ٩(ˊᗜˋ*)و  I HAVE WON!! WITH THE SCORE OF %d WELL, GOODBYE :)", computer);
				System.exit(0);
				}
		
				
			}
			
			//[2~6] directs to continuous loop until that turn's score reaches more or equal to 20
			if (computerTurnScore >= 20)
			{
				computerPreviousScore = computer;
				computerTurnScore = 0;
				humanTurn();
				break;
			}
			
			
		}
		
	}
	
	
	
	
	/*
	 * Additional Turn Method
	 * user input for decision making
	 */
	
	public static void additionalTurn()
	{
		while(!done)
		{
			try
			{
			System.out.println("Would you like to roll again? input “R” to get a chance to roll again or “H” to let the computer have its turn ");	
			String input = sc.next();
			char inputConvert = input.charAt(0);
			
				if(inputConvert == 'R')
				{
				humanTurn();
				}
				
				if(inputConvert == 'H')
				{
				userPreviousScore = human;
				computerTurnScore = 0;
				computerTurn();
				}
				
				if( (inputConvert != 'R') || (inputConvert != 'H'))
				{
			    throw new Exception ("<SYSTEM MESSAGE> Enter Again, must enter according to given instruction  Ƹ• ͟ʖ•Ʒ ");
				}
		
			done = true;
			
			}			
			catch(Exception e)
			{
			String message = e.getMessage();
			System.out.println(message);
			}
		}
		
	}
	
	
	
	
}
