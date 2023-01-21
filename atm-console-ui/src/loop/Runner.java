package loop;

import pages.LoginPage;
import pages.Page;

public class Runner {
	
	public static void main(String[] args) {
		Page loginPage = new LoginPage();
		loginPage.enterPage();
	}

}
