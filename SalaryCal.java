import java.util.*;

public class SalaryCal {

	public static Scanner sc = new Scanner(System.in); // a scanner to be called
	public static double answer; // The final solve-for
	
	public static void main(String[] args) {

		sc.useDelimiter(",");
		System.out.println("Type full name of employee, the base pay, and hours he/she worked." );
		System.out.println("<(Ex) David Kane,9.81,46,> "); //Additional info for user to use
		System.out.println("[※Note: ★No spaces before/after comma ★Put comma at the end also]"); // Avoid errors
		
		String fullName = sc.next();
		double pay = sc.nextDouble();
		double hour = sc.nextDouble(); //collect datas to input in salarayTotal method
		
		answer = salaryTotal(pay,hour); //last step
		
		if (answer == -1)
			System.out.println("The base salary you entered does not comply with the state law");
		else if (answer == -2)
			System.out.println("The number of hours your entered does not comply with company policy");
		else 
			System.out.printf("The total pay for <%s> is <%.2f> dollars", fullName, answer);
	}

	
	
	
	
	public static double salaryTotal(double basePay, double hoursWorked) { //2 inputs : base pay & hours worked in a week
		
		double salary; //the one that will be returned
		double overtime = hoursWorked - 40; // created for else if statement
		
		if (basePay < 5.24)	
			return -1;
		if (hoursWorked > 60) 
			return -2;
		else if (hoursWorked > 40)
			salary = (overtime * (basePay*1.5)) + ((hoursWorked-overtime)*basePay); 
		else
			salary = hoursWorked * basePay;
		return salary;
		
	
	}
	
}
