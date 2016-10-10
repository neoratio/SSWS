package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet02;

import bwi.prog.utils.TextIO;

public class LoopStatistics {

	public static void main(String[] args) {
		float min=0;
		float max=0;
		float mean=0;
		float temp=0;
		int i=0;
		TextIO.put("enter numbers:\n");
		float input = min = max = TextIO.getFloat();
		while (input > 0){
			if (input < min)min = input;
			if (input > max)max = input;
			temp+=input;
			i++;
			input = TextIO.getFloat();
			}
		mean=temp/i;
		//TextIO.put(mean + " = " + temp + " / " + i);
		if (i==0)TextIO.put("no number entered.\n");
		else {
			TextIO.putf("numbers entered: %d",i);
			TextIO.putf("\nminimum: %.2f\nmaximum: %.2f\nmean:    %.2f\n", min,max,mean);
			}
	}
}
