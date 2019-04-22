package io.github.danielblokus.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test (dataProvider = "testData")
	public void dummyTestMethod (String email, String password) {
		System.out.println(email + " " + password);
	}

	@DataProvider
	public Object[][] testData ()
	{
		Object [][] data = new Object [2][2];
		data [0][0] = "daniel@danielblokus.github.io";
		data [0][1] = "myPassword123";
		data [1][0] = "admin@danielblokus.github.io";
		data [1][1] = "adminPassword123";
		return data;
	}
}
