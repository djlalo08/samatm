package pages;

import errors.InvalidInputException;

public class UserPage extends Page {

	private long userId;
	
	public UserPage(long userId) {
		this.userId = userId;
	}
	
	@Override
	protected String options() {
		// TODO
		return null;
	}

	@Override
	protected String pageIntro() {
		return "Welcome, " + this.userId;
	}

	@Override
	protected Page processAction(String input) throws InvalidInputException {
		// TODO 
		switch (input) {
		case "log out":
			return new LoginPage();
		default:
			throw new InvalidInputException();
		}
	}

}
