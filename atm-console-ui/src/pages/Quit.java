package pages;

import errors.InvalidInputException;

public class Quit extends Page {

	@Override
	protected String options() {
		return null;
	}
	
	public void enterPage() {
		System.out.println(pageIntro());
		return;
	}

	@Override
	protected String pageIntro() {
		return "Exiting ATM app. Have a nice day!😀";
	}

	@Override
	protected Page processAction(String input) throws InvalidInputException {
		switch (input) {
		default:
			throw new InvalidInputException();
		}
	}

}
