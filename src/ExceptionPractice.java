import java.util.Scanner;

class InsufficientFundException extends Exception {
	public InsufficientFundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
	
	}
public class ExceptionPractice {
	static Scanner scanner=new Scanner(System.in);
	public static void multiply(int number1, int number2) {
		try {
		System.out.println(number1/number2);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("hiii");
	}
	public static void main(String[] args) throws Exception {
		int balance=1000;
		System.out.print("Enter the debit amount : ");
		int enteredAmount=scanner.nextInt();
		if(enteredAmount>balance) {
			throw new InsufficientFundException("Balance required");
		}
		else {
			balance-=enteredAmount;
			System.out.println("debited ");
		}
		System.out.println("press 1 to check balance : ");
		int check=scanner.nextInt();
		if(check==1) {
			System.out.println("Balance : "+balance);
		}
	}
	
}
