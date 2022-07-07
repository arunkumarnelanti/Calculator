import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Basic_calculator bc=new Basic_calculator();
		Maths_calculator mc=new Maths_calculator();
		
		int option;
		
		Scanner s =new Scanner(System.in);
		
		
		System.out.println("1.Basic Calculator");
		System.out.println("2.Mathematical Calculator");
		System.out.println("3.EXIT");
		
		option=s.next().charAt(0);
		
		switch(option) {
			case '1':
				bc.bCalculator();
				break;
			case '2':
				mc.mCalculator();
				break;
			case '3':
				System.out.println("Thank you for Using!!!");
				break;
			default:
				System.out.println("Invalid Option Selected");
				break;
		}
		s.close();
	}

}
