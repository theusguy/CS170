package ch12_OOP_Technology;

public enum DiscountType2 {
	//Define enumeration type: each member field has two subfields
	BASIC_DISCOUNT("for new customers", "10%"),
	EXTRA_DISCOUNT("for returning customers", "20%"),
	SUPER_DISCOUNT("for royal customers with 3 years", "30%");
	
	final private String explain;
	final private String rate;
	
	//Constructor
	private DiscountType2(String explain, String rate) {
		this.explain = explain;
		this.rate = rate;
	}
	
	public String getExplain() {
		return explain;
	}
	
	public String getRate() {
		return rate;
	}
}
