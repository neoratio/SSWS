package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet01;
import bwi.prog.utils.TextIO;
public class TheLifeOfPi {

	public static void main(String[] args) {
		double pi = 3.14159265359; 
		TextIO.putf("Pi=%f!%n", pi);
		TextIO.putf("Pi=%12f!%n", pi);
		TextIO.putf("Pi=%12.2f!%n", pi);
		TextIO.putf("Pi=%10.0f!%n", pi);
		TextIO.putf("Pi=%13.11f!%n", pi);
		TextIO.putf("Pi=%015f!%n", pi);
		TextIO.putf("Pi=%+015.2f!%n", pi);
	}

}
