package ConstructorOverloading;

public class Test {
public static void main(String[] args) {
		
		Database db = new Database();
		
		System.out.println ("Connecting to server:");
		db.display();

		db.setDbHost("192.10.20.1");
		db.display();

		db.setDbUid("java");
		db.setDbPasswd("java123");
		db.display();

		System.out.println ("currecnt uid:"+db.getDbUid());
		
		System.out.println ("currecnt server location :"+db.getDbHost());			
	}
}
