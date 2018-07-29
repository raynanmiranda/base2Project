package hoks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class hokSteps {
	@Before
	public void setUp() {
		DriverFactory.initializeDriver();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		DriverFactory.quitDriver();
	}
}
