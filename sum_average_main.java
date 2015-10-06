import java.util.Scanner;

public class sum_average_main {

	public static void main(String[] args) {
		
		System.out.println("Enter five numbers separated by spaces"
				+ " and hit enter.");
		
		double number1, number2, number3, //five user numbers
			   number4, number5;
		
		double sum, average;			  //location of sum & average
		
		Scanner keyboard = new Scanner(System.in); //user inputs the five
		number1 = keyboard.nextDouble();		   //numbers and they are
		number2 = keyboard.nextDouble();		   //assigned to respective
		number3 = keyboard.nextDouble();		   //variables
		number4 = keyboard.nextDouble();
		number5 = keyboard.nextDouble();
		
		sum = number1 + number2 + number3 + number4 + number5;
		average = (number1 + number2 + number3 + number4 + number5)/5;
		
		System.out.println("The sum of the five numbers you entered is " 
				+ sum);
        System.out.println("The average of the five numbers entered is "
        		+ average);
		
		

	}

}
