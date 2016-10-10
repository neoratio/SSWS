package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet02;

import bwi.prog.utils.TextIO;

public class TowerOfPower {

	public static void main(String[] args) {
		int base;
		int erg;
		TextIO.put("enter base:");
		base = erg = TextIO.getInt();
		TextIO.putf("\n%8d\n",erg);
		for (int i = 1;i < 7;i++){
			erg *= base;
			TextIO.putf("%8d\n",erg);
		}
	}

}
