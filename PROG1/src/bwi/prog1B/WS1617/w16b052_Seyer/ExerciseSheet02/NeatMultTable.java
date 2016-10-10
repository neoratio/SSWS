package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet02;

import bwi.prog.utils.TextIO;

public class NeatMultTable {

	public static void main(String[] args) {
	
		int rows;
		int columns;
		TextIO.put("enter rows: ");
		rows = TextIO.getInt();
		TextIO.put("enter columns: ");
		columns = TextIO.getInt();
		for (int i=1;i<rows+1;i++){
			if (i==1) {
					TextIO.put("\n    ");
					for (int k=0;k!=columns;k++)TextIO.putf(" %2d", k+1);
					TextIO.put("\n----");
					for (int k=0;k!=columns;k++)TextIO.put("---");
					}
			TextIO.putf("\n%2d |",i);
			for(int j=1;j<columns+1;j++){
				TextIO.putf(" %2d", i*j);
				}
			
		}
			
	}

}
