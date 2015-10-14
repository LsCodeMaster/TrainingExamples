/**
 * 
 */
package com.sapient.test.finance;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.finance.Money;

/**
 * @author ilisze
 *
 */
public class MoneyTestCase {
	int fAmount;
	String fCurrency;
	Money account;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fAmount = 500;
		fCurrency = "$";
		account = new Money(fAmount, fCurrency);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		account = null;
		fAmount = 0;
		fCurrency = "";
	}

	/**
	 * Test method for {@link com.sapient.finance.Money#amount()}.
	 */
	@Test
	public void testMoney() {
		assertNotNull(account);
		assert account instanceof Money;
	}

	
	/**
	 * Test method for {@link com.sapient.finance.Money#amount()}.
	 */
	@Test
	public void testAmount() {
		int expectedValue = fAmount;
		int actualValue = account.amount();
		assertEquals("Returns the wrong value", expectedValue, actualValue);
	}

	/**
	 * Test method for {@link com.sapient.finance.Money#currency()}.
	 */
	@Test
	public void testCurrency() {
		String expectedValue = fCurrency;
		String actualValue = account.currency();
		assertEquals("Returns the wrong value", expectedValue, actualValue);		
	}

	/**
	 * Test method for {@link com.sapient.finance.Money#add(com.sapient.finance.Money)}.
	 */
	@Test
	public void testAdd() {
		int expectedValue = 1000;
		Money secondAccount = account.add(account);
		int actualValue = secondAccount.amount();
		assertEquals("Did not add properly", expectedValue, actualValue);
	}
	
	@Test
	public void testAddNull() {
		int expectedValue = fAmount;
		Money secondAccount = account.add(null);
		int actualValue = secondAccount.amount();
		assertEquals("Did not add properly", expectedValue, actualValue);
	}

}
