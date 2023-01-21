package utils;

import java.io.IOException;

public class Utils {

	public static String waitForInput() {
		String buffer = "";
		try {
			while (true) {
				char c = (char)System.in.read();
				if (c == '\n')
					return buffer;
				buffer += c;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return buffer;
	}
	
}
