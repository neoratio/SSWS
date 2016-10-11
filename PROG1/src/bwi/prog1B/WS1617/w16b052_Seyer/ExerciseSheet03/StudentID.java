package bwi.prog1B.WS1617.w16b052_Seyer.ExerciseSheet03;

import bwi.prog.utils.TextIO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentID {

	public static void main(String[] args) {
	TextIO.put("enter studentID (wi**b***): ");
	String studID = TextIO.getln();
	TextIO.putf("ID valid: %s\n", validate(studID));
	TextIO.putf("graduation in: %d\n", graduation(studID));
	}

	public static Boolean validate(String studID){
		Pattern p= Pattern.compile("wi[0-9]{2}b[0-9]{3}");
		Matcher m= p.matcher(studID);
		return m.matches();
	}
	
	public static Integer graduation(String studID){
	int year=0;
	if (validate(studID) == false) return -1;
	else {
		int stelle1 = Character.getNumericValue(studID.charAt(2));
		int stelle2 = Character.getNumericValue(studID.charAt(3));
		year = 2000 + (stelle1*10) + stelle2 + 3;
		return year;
		}
	}
}


