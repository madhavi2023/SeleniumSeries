package testngsessions;

import org.testng.annotations.Test;

public class CRUDOperationTest {

	public void createUser() {
		System.out.println("Create User Method");
	}

	public void getUser() {
		System.out.println("Get User Method");

	}

	public void updateUser() {
		System.out.println("Update User Method");

	}

	public void deleteUser() {
		System.out.println("Delete User Method");

	}

	@Test()
	public void createUserTest() {
		createUser();
	}

	@Test()
	public void getUserTest() {
		createUser();
		getUser();
	}

	@Test()
	public void updateUserTest() {
		createUser();
		getUser();
		updateUser();
		getUser();
	}

	@Test()
	public void deleteUserTest() {
		createUser();
		getUser();
		deleteUser();
		getUser();
	}
}
