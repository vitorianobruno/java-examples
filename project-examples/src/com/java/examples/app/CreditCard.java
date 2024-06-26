package com.java.examples.app;

public class CreditCard {

	public static String maskify(String creditCardNumber) {

		char[] strChars = creditCardNumber.toCharArray();
        
        // Never mask credit cards with less than 6 characters.
		if (creditCardNumber.length() < 6)
			return creditCardNumber;

		for (int i = 0; i < strChars.length - 4; i++) {
			boolean isNum = Character.isDigit(creditCardNumber.charAt(i));
            
            // Never mask non-digit characters.
			if (isNum && i != 0) {
					strChars[i] = '#';
			}
		}
		return new String(strChars);
	}
}
