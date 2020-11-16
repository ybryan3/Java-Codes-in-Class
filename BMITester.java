import java.util.Scanner;

public class BMITester {

	public static double mass, weight, height, BMI;

	
	public static void main(String[] args) {
		System.out.println("Welcome to JAVA BMI check program, this program can anaylyze maximum 10 people's BMIs."); 
		System.out.println("Follow the instructions and I will help you!");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//1
	    nextPerson();
	    
		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//2
	    nextPerson();

		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//3
	    nextPerson();

		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//4
	    nextPerson();

		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//5
	    nextPerson();

		bmiOne();
		bmiTwo();	
		bmiPrinter();			//6
	    nextPerson();

		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//7
	    nextPerson();

		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//8
	    nextPerson();

		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//9
	    nextPerson();

		bmiOne();
		bmiTwo();
		bmiPrinter(); 			//10
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("BMI check is done! Thank you for using java service. Hope to see you next time!");
	}

	
	
	public static void bmiOne() {
		
		System.out.println("Welcome to BMI(SI-unit based) check! Let's get you started!");
		System.out.println("Click on the dialogue box once the program is ran, and type infos asked!"); 
		
		System.out.println("※if you do not know your SI-unit, simply enter 1, the8n again 1. It will lead to next BMI Check :)");
		System.out.println("Here we go :)");
		System.out.println("──────────────────────────────────────────────────────────────────────────────────────────");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your mass in kilograms? ");
		mass = sc.nextDouble();
		
		System.out.println("Okay, what is your height in meters? (Please type to second decimal places. <Ex: 1.81> )");
		height = sc.nextDouble();
		
		BMI = mass/((height)*(height));
		System.out.println("Your BMI is: "+BMI );
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
	}
	
	
	public static void bmiTwo() {
		System.out.println();
		System.out.println("Welcome to BMI(Standard) check! Let's get you started!");
		System.out.println("Click on the dialogue box once the program is ran, and type infos asked!");
		System.out.println("Here we go :)");
		System.out.println("──────────────────────────────────────────────────────────────────────────────────────────");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your weight in pounds? (Up to 2 decimal places, if desired.)");
		weight = sc.nextDouble();
		
		System.out.println("Okay, what is your height in inches? (Same option as above)");
		height = sc.nextDouble();
		
		BMI = (weight/((height)*(height)))*(703);
		System.out.println("Your BMI is: "+BMI );
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
	}

	
	public static void bmiPrinter() {
		System.out.println("Your BMI value is: " + BMI + " Please refer to the table below" );
		System.out.println("to check the category for this value:");
		System.out.println("----------------------------------------");
		System.out.println("| From 16.0 to 18.5 |    Underweight   |");
		System.out.println("----------------------------------------");
		System.out.println("|  From 18.5 to 25  |       Normal     |");
		System.out.println("----------------------------------------");
		System.out.println("|   From 25 to 30   |     Overweight   |");
		System.out.println("----------------------------------------");
		System.out.println("|   From 30 to 35   | Moderately obese |");
		System.out.println("----------------------------------------");
		System.out.println("|   From 35 to 40   |  Severely obese  |");
		System.out.println("----------------------------------------");

	}
	
	

	public static void nextPerson() {
		System.out.println("You are done! Please call the next person to test his/her BMI!");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		
		Scanner sc = new Scanner(System.in);
		int abc;
		System.out.println("Are you ready to start? Please click the dialogue and enter any integer to start!");
		abc = sc.nextInt();

	}
	
}
