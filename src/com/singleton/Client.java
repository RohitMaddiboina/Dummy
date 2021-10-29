package com.singleton;


public class Client {

	public static void main(String[] args) {
		
		DBConn conn1 = DBConn.getDbConnection();
		
		
		DBConn conn2 = DBConn.getDbConnection();
	
		
		
		System.out.println("[conn1 - "+conn1.hashCode()+"] [conn2 - "+conn2.hashCode()+"]");
		
		
	}

}
