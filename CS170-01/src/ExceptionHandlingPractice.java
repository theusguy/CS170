import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class ExceptionHandlingPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Grade grade = new Grade();
		
		String str;
		int score = 0;
		
		boolean notDone = true;
		while (notDone) {
			try {
				//ask for input score
				str = JOptionPane.showInputDialog("Please enter an integer score: ");
				score = Integer.parseInt(str);
				notDone = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Input Error...Enter an integer as student score");
				continue;
			} //end catch
		} //end while
		grade.setScore(score);
		grade.assignGrade();
		JOptionPane.showMessageDialog(null, "Grade: " + grade.getGrade());
	}

}
