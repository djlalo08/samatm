package pages;

import errors.InvalidInputException;
import utils.Utils;

public class LoginPage extends Page {

	@Override
	protected String options() {
		return "Type \"log in\" to log in"
				+ "\nType \"new user\" to create a new user account\n";
	}

	@Override
	protected String pageIntro() {
		return "Welcome to the SAMBANK ATM!"
				+ "\nIf You are confused at any time, say \"options\""
				+ "\n";
	}
	
	@Override
	protected Page processAction(String input) throws InvalidInputException {
		switch (input) {
		case "log in":
			System.out.println("Please enter user id:");
			String userId = Utils.waitForInput();
			if (doesUserExist(userId))
				return new UserPage(Long.parseLong(userId));
			
			System.out.println("No such user id exists! Returning to log in page");
			return null;
			
		case "new user":
			System.out.println("This functionality does not yet exist");
			return null;
			
		default:
			throw new InvalidInputException();
		}
	}
	
	private boolean doesUserExist(String userId) {
		return true;
	}


}
