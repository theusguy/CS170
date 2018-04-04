
public class Grade {
	int score;
	char grade;
	
	public void setScore(int s ) {
		score =  s;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setGrade(char g) {
		grade = g;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void assignGrade() {
		if (score >= 60) {
			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else {
				grade = 'D';
			}
		} else {
			grade = 'F';
		}
	}

}
