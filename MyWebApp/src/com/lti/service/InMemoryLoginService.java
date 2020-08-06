package com.lti.service;

import java.util.HashMap;

public class InMemoryLoginService {
	private static HashMap<String, String> users = new HashMap<String, String>();
	
	public InMemoryLoginService() {
		users.put("Rachit", "123");
		users.put("Majrul", "456");
		users.put("Soumya", "789");
	}

	public boolean authenticate(String uname, String pwd) {
		//if(uname.equals("Rachit") && pwd.equals("123"))  //this line was hardcoded before we used HashMap.
		if(users.containsKey(uname) && users.get(uname).equals(pwd))
			return true;
		return false;
	}
}
