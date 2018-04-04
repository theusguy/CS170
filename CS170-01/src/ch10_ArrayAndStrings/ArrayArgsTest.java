package ch10_ArrayAndStrings;

public class ArrayArgsTest {
	public static void main(String[] args) {
		//for some reason both for loops aren't working :(
		for (String element : args) {
			System.out.println(element);
			
			for(int i = 0; i < args.length; i++)
				System.out.print("args[" + i + "] = " + args[i] + "\t");
			System.out.println();
		}
	}

}
