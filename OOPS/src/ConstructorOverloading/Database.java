package ConstructorOverloading;

public class Database {
	private String dbHost;	
	private String dbName;
	private String dbUid;
	private String dbPasswd;
	
	public Database() 
{
		dbHost="localhost";

		dbName="nrit";

		dbUid="scott";

		dbPasswd="tiger";
	}
	

public String getDbHost() {
		return dbHost;
	}

	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}
	
	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUid() {
		return dbUid;
	}

	public void setDbUid(String dbUid) {
		this.dbUid = dbUid;
	}
	public String getDbPasswd() {
		return dbPasswd;
	}

	public void setDbPasswd(String dbPasswd) {
		this.dbPasswd = dbPasswd;
	}
	
	public void display() {

		System.out.println ("Server  :" + getDbHost());
		System.out.println ("Database : " + getDbName());
		System.out.println ("Db user id : " + getDbUid());
		System.out.println ("Db password " + getDbPasswd());
	}
}





