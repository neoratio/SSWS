package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet02;

import bwi.prog.utils.TextIO;

public class Classifier {

	public static void main(String[] args) {

		int quality;
		int price;
		
		TextIO.put("enter price: ");
		price = TextIO.getInt();
		TextIO.put("enter quality: ");
		quality = TextIO.getInt();
		if(quality >= 50 && price >= 50)TextIO.put("high price\nhigh quality\nluxury\n");
		if(quality < 50 && price < 50)TextIO.put("low price\nlow quality\njunk\n");
		if(quality < 50 && price >= 50)TextIO.put("high price\nlow quality\nrip off\n");
		if (quality >= 50 && price < 50)TextIO.put("low price\nhigh quality\nbargain\n");
	}

}
