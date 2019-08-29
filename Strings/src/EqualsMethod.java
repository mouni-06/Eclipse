import java.util.Scanner;

public class EqualsMethod {

  //Three ways to compare strings 
  // 1. By equals() method
  
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter any string1:");
	String s1=new String(s.nextLine());
	
	System.out.println("enter any string2:");
	String s2=new String(s.nextLine());
	
    
    if(s1.equals(s2)) //checks case sensitive 
    {
  	  System.out.println ("both are equal");
    }
    else    {
  	  System.out.println ("not equal");
    }

    System.out.println("enter any string3:");
	String s3=new String(s.nextLine());
	
	System.out.println("enter any string4:");
	String s4=new String(s.nextLine());
	
	if(s3.equalsIgnoreCase(s4)) //Ignores case sensitive 
    {
  	  System.out.println ("both are equal");
    }
    else    {
  	  System.out.println ("not equal");
    }
}
}
