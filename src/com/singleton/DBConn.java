package com.singleton;

public class DBConn {
	
	private static DBConn dbConn;
	
	public DBConn() {
		
	}
	public static DBConn getDbConnection() {
		if(dbConn==null) {
			dbConn = new DBConn();
		}
		return dbConn;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return new CloneNotSupportedException();
	}
}
