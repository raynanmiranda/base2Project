package hook;

import java.net.MalformedURLException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class HookSteps {

	@Before
	public void setUp() throws MalformedURLException {
		
		DriverFactory.initializeDriver();
		
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		DriverFactory.quitDriver();
	}

	
}
