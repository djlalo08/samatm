package pages;

import errors.InvalidInputException;
import utils.Utils;

public abstract class Page {

	protected abstract String options();
	
	protected abstract String pageIntro();
	
	protected abstract Page processAction(String input) throws InvalidInputException;
	
	public void enterPage() {
		System.out.println(pageIntro());
		
		Page nextPage = null;
		while (nextPage == null) {
			String input = Utils.waitForInput().toLowerCase();
			try {
				nextPage = processAction(input);
			} catch (InvalidInputException e) {
				nextPage = defaultActions(input);
			}
		}
		nextPage.enterPage(); //Creates a massive callstack, but we're ignoring that for simplicity's sake
	}

	private Page defaultActions(String input) {
		switch (input){
		case "quit":
			return new Quit();
		case "options":
			System.out.println(options());
			return null;
		default:
			System.out.println("Sorry, That command isn't recognized! Type \"options\" for valid commands");
			return null;
		}
	}
	
}
