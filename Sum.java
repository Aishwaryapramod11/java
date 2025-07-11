package firstproject;
import java.util.Scanner;
public class Sum {
		public static void main(String[]args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your grade");
			String grade=sc.nextLine();
			switch (grade) {
			case "O":
				System.out.println("outstanding");
				break;
			case "A+":
				System.out.println("excellent");
				break;
			case "A":
			    System.out.println("very good");
			    break;
			case "F":
				System.out.println("fail");
				break;
			default:
				System.out.println("error");
			
			
				
		
			
			}
			
		}

	}
