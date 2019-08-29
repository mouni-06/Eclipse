
public class StringSample {
public static void main(String[] args) {
	
	// In java,String is a class. we can create a string object in 2 ways
	//  1.By string literal  2. By new keyword
   

 String s1; //declaration  
 s1="hello(literal)"; //definition

 
String s2="hello world(literal)"; // initialization (creating string by java string literal)

		
String s3; 
s3=new String("sailotech  by new keyword");

		
String s4= new String ("String by new keyword");//creating java string by new keyword

		
String s5=s4;	//assigning

	
String s6 = new String( s4);//passing a reference string object as a argument to the constructor of class String.


String s7=null; // string reference is null, it can not be used, it throws NullPointerException
String  s8= new String(); //s2 is reference String object, which contains nothing, empty object 


//An array of characters works same as java string.
char []  ch ={'W','E','L','C','O','M','E'}; 

String  s9 = new String( ch );  //converting char array to string  


System.out.println(s1);  
System.out.println(s2);  
System.out.println(s3); 
System.out.println(s4); 
System.out.println(s5);  
System.out.println(s6);  
System.out.println(s7);  
System.out.println(s8);
System.out.println("char array of string "+s9);  


}
}
