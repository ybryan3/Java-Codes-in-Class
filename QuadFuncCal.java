import java.util.*;

public class QuadFuncCal {

	public static Scanner sc = new Scanner(System.in); // a scanner to be called

	public static void main(String[] args) {

		System.out.println("Enter the a, b, and c of your quadratic function ");
		System.out.println("(separated by spaces):"); //additional info to use program
		double a, b, c, y, x; // will be used over and over
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
				
		x = ((-1) * b) / (2*a);         //• Vertex X = -b/2a (principle of quadratic formula)
		y = a*(x*x) + (b*x) + c;        //quadratic function completed
		
		System.out.println("The vertex of the corresponding parabola is: ");
		System.out.printf("( %.2f , %.2f) ", x, y ); //round to 2 decimal places
		System.out.println("");
		
		if (x == 0) 
			System.out.println("This vertex is also the y-intercept of your parabola");
		if (y == 0)
			System.out.println("This vertex is also the zero of your parabola"); //using else if will set the program to end at first 'if'
	
		/* 
		 * While programming the if statements above based on grading rubric that says: 
		 * 
		 *Print "This vertex is also the zero of your parabola"  ↔  Test: (1, -1, 0.25) and get "Zero" message
		 *Print "This vertex is also the y-intercept of your parabola"  ↔  Test: enter (2, 0, 1) and get the "y-intercept" message
		 *
		 *I felt like it should be backwards, if I am understanding the wording correctly.
		 *However, I decided to follow the rubric just in case.
		 *but if y is 0, shouldn't the program output "This vertex is also the y-intercept of your parabola"?
		 *Maybe this is mathmatical misunderstanding for me.
		 *
		 */
			
		
	}

}
