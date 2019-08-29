import java.util.Scanner;

public class UserValidation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String org_userid="yalagalamounika@gmail.com";
		String org_pswd="moUnika";

		System.out.println("Enter user id");

		String userId = sc.next();

		System.out.println("Enter Passwd :");

		String pwd = sc.next();

		if (userId.equalsIgnoreCase(org_userid) && pwd.equals(org_pswd)) {
			System.out.println("valid user ");
		} else {
			System.out.println("In valid user ");
		}
	}

}
