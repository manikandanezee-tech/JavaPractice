import java.util.Scanner;

public class MobileCheck {
	static Scanner scanner=new Scanner(System.in); 
	public static boolean check(String number) {
		String regex="^[6-9]{1}[0-9]{9}$";
		
		return number.matches(regex);
	}
	
public static void main(String[] args) {
	System.out.println("Enter the mobile numnber: ");
	String number=scanner.nextLine();
	System.out.println(MobileCheck.check(number)?"Valid Number....":"Invalid Number !");
}	

}
