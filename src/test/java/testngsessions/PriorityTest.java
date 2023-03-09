package testngsessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 5)
	public void a_Test() {
		System.out.println("a Test");
	}

	@Test(priority = 4)
	public void b_Test() {
		System.out.println("b Test");
	}
	@Test(priority = 2)
	public void c_Test() {
		System.out.println("c Test");
	}
	@Test(priority = 3)
	public void d_Test() {
		System.out.println("d Test");
	}
	@Test(priority = 1)
	public void e_Test() {
		System.out.println("e Test");
	}
}
