package com.walmart;

public class SystemDes {

}

class LBS {
	String userName;
	String password;

	public void Login(String userName, String password) {

	}

	public void Logout() {

	}

}

interface User {
	String getInfo();
}

class Users implements User {
    String name;
    String password;
    
    
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Staff implements User {

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}

class Librarian {

}

class LibDataBase {

}

class Books {

}
