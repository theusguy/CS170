
public class GradeWithSwitch {
	
	public void assignGrade() {
		char grade;
		int score = 0;
		int scoreRange = score / 10;
		switch (scoreRange) {
		case 10: //will be the same as case 9 so no break statement!
		case 9: 
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		} //end switch
	} //end assignGrade
}
