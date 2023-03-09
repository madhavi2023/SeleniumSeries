package testngsessions;

import org.testng.annotations.Test;

public class TestDependency {

	@Test(expectedExceptions= ArithmeticException.class)
	public void searchTest() {
		System.out.println("Search Test..");
		int i= 9/0;
	}
	
	@Test(dependsOnMethods = "searchTest" )
	public void addToCartTest() {
		System.out.println("Add to cart Test..");
	}
	
	@Test(dependsOnMethods = "addToCartTest")
	public void makePaymentTest() {
		System.out.println("Make payment Test..");
	}
}
