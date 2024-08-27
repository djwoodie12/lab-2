/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
		
		
	}
	
	//Test methods
	
	public static void fail() {
	}
	
	public static void assertEquals(double val, double quo) {
		if (val != quo) {
		fail();
		}
	}
	
	public static void assertEquals(int val, int quo) {
		if (val != quo) {
			fail();
		}
	}
	

	public void assertTrue(boolean test) {
		
	}
	
	public void assertFalse(boolean test) {
		if (test != false) {
			fail();
		}
	}
	
	public void assertArrayEquals(String[] array, String[] compare) {
		if (array.length != compare.length) {
			fail();
		} else {
			for (int i = 0; i < array.length; i++) {
				if (!(array[i].equals(compare[i]))) {
					fail();
				}
			}
		}
	}
	
	public void assertArrayEquals(int[] array, int[] compare) {
		if (array.length != compare.length) {
			fail();
		} else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != compare[i]) {
					fail();
				}
			}
		}
	}
	
	public static String main(String word) {
		return "Overloaded main method was passed \"" + word + "\".";
	}


	
	
	//Math methods
	
	public static double divide(double num1, double num2) {
		return num1 / num2;
	}
	
	public static int divide (int num1, int num2) {
		return num1 / num2;
	}
	
	public static boolean isDivisibleBy7(int value) {
		if (value % 7 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int findMin(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
	} else if (b < a && b < c) {
		return b;
	} else {
		return c;
	}
}
	
	public static int findMin(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static double average(int[] array) {
		double sum = 0.0;
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			count++;
		}
		return sum / count;
	}
	
	public static String[] toLowerCase(String[] word) {
		for (int i = 0; i < word.length; i++) {
			word[i] = word[i].toLowerCase();
		}
		return word;
	}
	
	public static String[] toLowerCaseCopy(String[] word) {
		String[] copy = new String[word.length];
		for (int i = 0; i < word.length; i++) {
			copy[i] = word[i].toLowerCase();
		}
		return copy;
	}
	
	public static int[] removeDuplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				boolean isDuplicate = false;
			for (int k = i + 1	; k < array.length; k++) {
				if (array[k] == array[i]) {
					array[k] = 0;
					isDuplicate = true;
				}
			}
			if (isDuplicate) {
				array[i] = 0;
			}
		}
	}
		return array;
	}
	}
	

