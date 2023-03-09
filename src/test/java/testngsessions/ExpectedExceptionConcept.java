package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void loginTest() {
		
		System.out.println("Login ....");
		int i = 9/0;
		
	}

}
