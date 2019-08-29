import java.util.Scanner;

public class SubString {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
	
	System.out.println("enter any string:");
	
	String str=new String(s.nextLine());
	
	System.out.println("string is:"+str);
	
	System.out.println("enter index/position  below "+str.length());
	
	int index=s.nextInt(); 
	
	String substr1=str.substring(index); //substr from index to end of the string
	
	System.out.println("substring1 is:"+substr1);
	
	System.out.println("starting index position(below "+str.length()+") :");
	
	int beginindex = s.nextInt(); 
	
	System.out.println("ending index position(below "+str.length()+") :");
	
	int endindex = s.nextInt(); 
	
	String substr2=str.substring(beginindex,endindex ); 
	
	System.out.println("substring2 is:"+substr2);
	
}
}
