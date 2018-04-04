
public class ConditionalExpressionExample {
	double discountRate = 0;
	int total;
	public void ifStatement() {
		//if else version
		if (total >= 150) {
			discountRate = 0.2;
		} else {
			discountRate = 0.15;
		}
	}
	
	public void conditionalStatement() {
		//conditional version
		discountRate = (total >= 150 ? 0.2 : 0.15);
	}
	
	//Another example
	public void grade() {
		int grade = 0;
		System.out.println(grade >= 60 ? "passed":"failed");
	}
	

}
