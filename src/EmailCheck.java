import java.util.Scanner;

public class EmailCheck {
	static Scanner scanner=new Scanner(System.in);
	public static boolean checkMail(String email) {
		String regex="^[a-z0-9._%+-]+@[a-z0-9-]+\\.[a-z]{2,}$";
		return email.matches(regex);
	}
public static void main(String[] args) {
	System.out.println("Enter the Email: ");
	String mail=scanner.nextLine();
	System.out.println(EmailCheck.checkMail(mail)?"Valid Email id....":"Invalid email id !");
}
}
