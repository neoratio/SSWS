package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bwi.prog.utils.TextIO;

public class ISBN {

	public static void main(String[] args) {
	TextIO.put("enter ISBN: ");
	String isbn = TextIO.getln();
	TextIO.putf("valid pattern: %s\n", validatePattern(isbn));
	TextIO.putf("valid checkDigit: %s\n", validateCheckDigit(isbn));
	}
	
	public static String validatePattern(String isbn){
		Pattern p= Pattern.compile("[0-9]{13}+");
		Matcher m= p.matcher(isbn);
		if (m.matches()) return "true";
		else return "false";	
	}
	
	public static String validateCheckDigit(String isbn){
	int stelle;
	long sum=0;
	if (isbn.length()>13 || isbn.length()<13 )return "false";
	for(int i=0;i<12;i++){
	stelle = Character.getNumericValue(isbn.charAt(i));
	if(i%2 == 1) sum= sum + 3* stelle;
	else sum += stelle;
	//TextIO.putf("stelle: %d\n",stelle);
	}
	//TextIO.putf("sum: %d, %d\n",sum, Character.getNumericValue(isbn.charAt(12)));
	if (Character.getNumericValue(isbn.charAt(12))== (10-(sum%10)%10)) return "true";
	else return "false";
	}
}
