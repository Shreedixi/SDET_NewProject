package com.crm.contacttest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		System.out.println("execute createContactTest");
		String user=System.getProperty("user");
		System.out.println("===============USERNAME==========="+user);
	}
	@Test
	public void editContactTest() {
		System.out.println("execute editrContactTest");
	}

}
