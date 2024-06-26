package com.java.examples.app;

public class Ordinal {

	public static String numberToOrdinal(Integer number) {

		String strNum = "0";
		String suffix;
		int num = 0;

		// Apply Constraints
		if (number <= 0 || number >= 10000)
			return strNum;

		if (number < 20) {
			if (number < 10) {
                suffix = switch (number) {
                    // st is used with numbers ending in 1
                    case 1 -> "st";
                    // nd is used with numbers ending in 2
                    case 2 -> "nd";
                    // rd is used with numbers ending in 3
                    case 3 -> "rd";
                    default -> "th";
                };

			} else {
				suffix = "th";
			}

		} else {
			String decimals = number.toString();
			decimals = decimals.substring(decimals.length() - 2);
			
            // Convert String to INT when we have decimals 
            if (!decimals.isEmpty()){
            	decimals = decimals.substring(0,1);
            	num = Integer.parseInt(decimals);
            }
            
			String units = number.toString();
			units = units.substring(units.length() - 1);

			if (num == 1) {
				suffix = "th";
			} else {
                suffix = switch (units) {
                    // st is used with numbers ending in 1
                    case "1" -> "st";
                    // nd is used with numbers ending in 2
                    case "2" -> "nd";
                    // rd is used with numbers ending in 3
                    case "3" -> "rd";
                    default -> "th";
                };
			}
		}

		strNum = number.toString();
		return strNum + suffix;

	}
}
