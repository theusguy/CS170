package ch12_OOP_Technology;

public class EnumTest {
	public static void main(String[] args) {
		DiscountType myDiscount;
		myDiscount = DiscountType.BASIC_DISCOUNT;
		
		System.out.println(myDiscount.name());
		System.out.println(myDiscount.toString());
		
		System.out.println(myDiscount.ordinal());
	}
}

enum DiscountType {
	BASIC_DISCOUNT,
	EXTRA_DISCOUNT,
	SUPER_DISCOUNT;
}
