package com.sapient.test.login;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.model.login.Login;

public class LoginTest {
	Login login;
	@Before
	public void setUp() throws Exception {
		login = new Login("danielle@gmail.com", "abc@123");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=IllegalArgumentException.class)
	public void testInvalidPasswordInput() {
		login.setPword("1234");
	}
	@Test
	public void passwordInputTest() {
		assert 
		fail("Not yet implemented");
	}

}
