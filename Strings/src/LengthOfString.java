import java.util.Scanner;

public class LengthOfString {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter any string:");
	String str=new String(s.nextLine());
	System.out.println("string is:"+str);
	 
	int len=str.length(); //method to find length
    System.out.println("length of string is:"+len);
	
    System.out.println("enter index/position  below "+len);
	int index=s.nextInt(); 
	char ch=str.charAt(index);  //method to char at any index
	System.out.println("char at index "+index+" is "+ch);
}
}
