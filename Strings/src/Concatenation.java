
public class Concatenation {
public static void main(String[] args) {
	String s1="hello";
	String s2="world";
	System.out.println(s1+s2); //s2 concatenates with s1
	
	int id=1001;
	double salary=30000;
	int age=25;
	System.out.println(id+salary+age);  // output: 31026.0
	System.out.println(id+""+salary+""+age); //output:  100130000.025
	System.out.println(id+":"+salary+":"+age); //output:   1001:30000.0:25
}
}
