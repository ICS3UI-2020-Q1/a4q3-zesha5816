import java.util.Scanner;
/**
 * Write a program that will prompt the user to enter in a positive integer. It will then    calculate the sum from 1 up to that number.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//prompt user for their integer
    System.out.println("Please enter an integer to count down to");
		//initializing variables
		int num = input.nextInt(); 
		int count = 1;
		int total = 0;

       while(count <= num){
				 //adding a accumulator
           total = total + count;
					 //count = count + 1/count++;
           count=count + 1;
       }
       System.out.println("The sum from 1 - " + num + " is " + total);
  }
}

