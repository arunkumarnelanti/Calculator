import java.util.Scanner;

public class Basic_calculator {
	 void bCalculator() {
		
		int operator;
		Double first_number, second_number,number,  result,remainder;
		
		//Create an object of Scanner class
		Scanner s=new Scanner(System.in);
		
		System.out.println("******************************");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Square");
		System.out.println("6.Square Root");
		System.out.println("7.EXIT");
		
		operator=s.next().charAt(0);
		
		
		switch(operator){
			case '1':
				//Taking numbers from the user
				System.out.println("Enter First Number : ");
				first_number=s.nextDouble();
				
				System.out.println("Enter Second Number : ");
				second_number=s.nextDouble();
				
				result=first_number+second_number;
				System.out.println("ADDITION");
				System.out.println(first_number+" + "+second_number+ " = "+result);
				break;
				
			case '2':
				//Taking numbers from the user
				System.out.println("Enter First Number : ");
				first_number=s.nextDouble();
				
				System.out.println("Enter Second Number : ");
				second_number=s.nextDouble();
				
				result=first_number-second_number;
				System.out.println("SUBSTRACTION");
				System.out.println(first_number+" - "+second_number+ " = "+result);
				break;
			
			case '3':
				//Taking numbers from the user
				System.out.println("Enter First Number : ");
				first_number=s.nextDouble();
				
				System.out.println("Enter Second Number : ");
				second_number=s.nextDouble();
				
				result=first_number*second_number;
				System.out.println("MULTIPLICATION");
				System.out.println(first_number+" X "+second_number+ " = "+result);
				break;
				
			case '4':
				//Taking numbers from the user
				System.out.println("Enter First Number : ");
				first_number=s.nextDouble();
				
				System.out.println("Enter Second Number : ");
				second_number=s.nextDouble();
				
				result=first_number/second_number;
				remainder=first_number%second_number;
				System.out.println("DIVISION");
				System.out.print("Queotient : ");
				System.out.println(first_number+" / "+second_number+ " = "+result);
				System.out.print("Remainder : ");
				System.out.println(first_number+" % "+second_number+ " = "+remainder);
				break;
			
			case '5':
				//Taking number from the user
				System.out.println("Enter a Number : ");
				number=s.nextDouble();
				
				result=number*number;
				System.out.println("SQUARE OF "+number+" is "+result);
				break;
				
			case '6':
				//Taking number from the user
				System.out.println("Enter a Number : ");
				number=s.nextDouble();
				
				result=Math.sqrt(number);
				System.out.println("SQUARE ROOT OF "+number+" is "+result);
				break;
			
			case '7':
				System.out.println("THANK YOU FOR USING CALCULATOR");
		}
		s.close();
		
	}
}
