package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet01;
import bwi.prog.utils.TextIO;
public class Swapper {

	public static void main(String[] args) {
		TextIO.put("enter first number (a):");
		int number1 = TextIO.getInt();
		TextIO.put("enter second number (b):");
		int number2 = TextIO.getInt();
		TextIO.putf("a=%d, b=%d\n", number1, number2);
		int number3 = number1;
		number1= number2;
		number2= number3;
		TextIO.put("swapped:\n");
		TextIO.putf("a=%d, b=%d\n", number1, number2);
	}

}
