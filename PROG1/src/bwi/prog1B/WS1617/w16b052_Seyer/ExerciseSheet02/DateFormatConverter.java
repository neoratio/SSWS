package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet02;

import bwi.prog.utils.TextIO;

public class DateFormatConverter {

	public static void main(String[] args) {
		
		int date;
		TextIO.put("enter date (yyyymmdd)");
		date = TextIO.getInt();
		if (date < 15821016 || date > 21001231)TextIO.put("\ninvalid date\n");
		else {
			int day = date%100;
			date /= 100;
			int month = date%100;
			date /= 100;
			TextIO.putf("\n%02d.%02d.%02d", day,month,date);
			}
		
	}

}
