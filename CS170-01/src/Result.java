
public class Result {
	//if else version
	int score;
	String result;
	
	public void setScore(int s) {
		score = s;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setResult(String r) {
		result = r;
	}
	
	public String getResult() {
		return result;
	}
	
	public void ifElseVersion(int score) {
		if (score < 60) {
			setResult("Fail");
		} else if (score > 60 && score < 70) {
			setResult("Repeat");
		} else {
			setResult("Pass");
		} 
	} //end ifElseVersion
	
	//switch version
	public void switchVersion() {
		int scoreRank;
		if (score > 70) {
			scoreRank = 1;
		} else if (score > 60 && score < 70) {
			scoreRank = 2;
		} else {
			scoreRank = 3;
		}
		switch(score) {
		case 1:
			result = "Pass";
			break;
		case 2:
			result = "Repeat";
			break;
		case 3:
			result = "Fail";
			break;
		}
	}
}
