package ch13_Collections;

//demo: use of genetics

//Making class with three generic types: T1, T2, T3

public class GeneItems<T1, T2, T3> {
	private T1 firstObj;
	private T2 secondObj;
	private T3 thirdObj;
	
	public GeneItems(T1 Obj1, T2 Obj2, T3 Obj3) {
		firstObj = Obj1;
		secondObj = Obj2;
		thirdObj = Obj3;
	}

}
