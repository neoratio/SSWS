package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet02;

import bwi.prog.utils.TextIO;

public class LeapChecker {

	public static void main(String[] args) {
		int year;
		TextIO.put("enter year:\n");
		year = TextIO.getInt();
		if (year %4 == 0 && year %100 > 0) TextIO.put(year + " is/was a leap year\n");
		else if (year %400 == 0) TextIO.put(year + " is/was a leap year\n");
			else TextIO.put(year + " is/was not a leap year\n");
	}

}
