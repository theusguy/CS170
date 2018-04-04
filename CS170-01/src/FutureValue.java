
public class FutureValue {
	private String name;
	private int years;
	private double monthlyInvest, yearlyRate, futureValue = 0;
	
	//following are setXx() and getXx() for class variables
	
	public void setName(String userName) {
		name = userName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMonthlyInvest(double monthlyInvestment) {
		monthlyInvest = monthlyInvestment;
	}
	
	public double getMonthlyInvest() {
		return monthlyInvest;
	}
	
	public void setYearlyRate(double yearlyReturnRate) {
		yearlyRate = yearlyReturnRate;
	}
	
	public double getYearlyRate() {
		return yearlyRate;
	}
	
	public void setYears(int investYears) {
		years = investYears;
	}
	
	public int getYears() {
		return years;
	}
	
	public double getFutureValue() {
		return futureValue;
	}
	
	public void futureValueCompute() {
		double monthlyReturnRate = yearlyRate/12/100;
		int months = years * 12;
		int i = 1;
		while (i <= months) {
			futureValue = (futureValue + monthlyInvest) * (1 + monthlyReturnRate);
			i++;
		} //end while
	} //end futureValueCompute

}
