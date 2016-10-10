package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet01;
import bwi.prog.utils.TextIO;
public class TimeCalculator {

	public static void main(String[] args) {
		
		long number;
		long millisec;
		long seconds;
		long minutes;
		long hours;
		long days;
		
		TextIO.put("Welcome to the TimeCalculator!\n");
		TextIO.put("please enter a duration in milliseconds:");
		number = TextIO.getlnLong();
		TextIO.put(number + "ms are exactly:\n");
		millisec = number % 1000;
		number /=1000;
		seconds = number % 60;
		number /=60;
		minutes = number % 60;
		number /=60;
		hours = number % 24;
		days = number /24;
		TextIO.putf("%7s %d\n","days",days);
		TextIO.putf("%7s %d\n","hours",hours);
		TextIO.putf("%7s %d\n","minutes",minutes);
		TextIO.putf("%7s %d\n","seconds",seconds);
		TextIO.putf("%7s %d\n","ms",millisec);
	}

}
