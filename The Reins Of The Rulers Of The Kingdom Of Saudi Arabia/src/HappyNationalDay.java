import java.util.Scanner;

public class HappyNationalDay {
	
  private static Scanner scanner;
  
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		System.out.println("Enter the Year:");
		int year = scanner.nextInt();
		
		switch (year) {
		case 1902:
		System.out.println("The King AbdullAziz");
		System.out.println("Happy National Day the Kingdom of Saudi Arabia");
			break;
			
		case 1953:
			System.out.println("The King Saud");
			System.out.println("Happy National Day the Kingdom of Saudi Arabia");
			break;
		
		case 1946:
			System.out.println("The King Faisal");
			System.out.println("Happy National Day the Kingdom of Saudi Arabia");
			break;	
			
		case 1975:
			System.out.println("The King Khalid");
			System.out.println("Happy National Day the Kingdom of Saudi Arabia");
			break;
			
		case 1982:
			System.out.println("The King Fahad");
			System.out.println("Happy National Day the Kingdom of Saudi Arabia");
			break;
			
		case 2005:
			System.out.println("The King Abdullauh");
			System.out.println("Happy National Day the Kingdom of Saudi Arabia");
			break;
		
		case 2015:
			System.out.println("The King Salman");
			System.out.println("Happy National Day the Kingdom of Saudi Arabia");
			break;
		
		default:	
		}

	}

}
