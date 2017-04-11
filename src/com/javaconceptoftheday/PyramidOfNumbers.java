package com.javaconceptoftheday;

public class PyramidOfNumbers {

	/**
	 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6 6 6 7 7 7 7 7 7 7 8 8 8 8 8 8 8 8 9
	 * 9 9 9 9 9 9 9 9
	 * 
	 * @param numberOfLines
	 */
	public void pattern1(int numberOfLines) {
		int elements = 0;
		while (numberOfLines > 0) {
			elements++;
			int space = numberOfLines;
			while (space-- > 0) {
				System.out.print(" ");
			}
			for (int i = 1; i <= elements; i++) {
				System.out.print(elements + " ");
			}
			System.out.println();
			numberOfLines--;
		}
	}

	/**
	 * @param numberOfLines
	 *            1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6 1 2 3 4 5 6 7 1 2 3
	 *            4 5 6 7 8 1 2 3 4 5 6 7 8 9
	 */
	public void pattern2(int numberOfLines) {
		int elements = 0;
		while (numberOfLines > 0) {
			elements++;
			int space = numberOfLines;
			while (space-- > 0) {
				System.out.print(" ");
			}
			for (int i = 1; i <= elements; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			numberOfLines--;
		}
	}

	/**
	 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 * 
	 * @param numberOfLines
	 */
	public void pattern3(int numberOfLines) {
		int elements = 0;
		while (numberOfLines > 0) {
			elements++;
			int space = numberOfLines;
			while (space-- > 0) {
				System.out.print(" ");
			}
			for (int i = 1; i <= elements; i++) {
				System.out.print("* ");
			}
			System.out.println();
			numberOfLines--;
		}
	}

	/**
	 *                    1 
		                1 2 1 
		              1 2 3 2 1 
		            1 2 3 4 3 2 1 
		          1 2 3 4 5 4 3 2 1 
		        1 2 3 4 5 6 5 4 3 2 1 
		      1 2 3 4 5 6 7 6 5 4 3 2 1 
		    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
		  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
	 * @param numberOfLines
	 */
	public void pattern4(int numberOfLines) {
		int elements = 0;
		while (numberOfLines > 0) {
			
			int space = numberOfLines * 2;
			while (space-- > 0) {
				System.out.print(" ");
			}
			int i = 1;
			for (; i <= elements; i++) {
				System.out.print(i + " ");
			}
			for (; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
			numberOfLines--;
			elements++;
		}
	}

	/**
	 *  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
		  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
		    1 2 3 4 5 6 7 6 5 4 3 2 1 
		      1 2 3 4 5 6 5 4 3 2 1 
		        1 2 3 4 5 4 3 2 1 
		          1 2 3 4 3 2 1 
		            1 2 3 2 1 
		              1 2 1 
		                1 
	 */
	public void pattern5(int numberOfLines) {
		int elements = 1;
		while (numberOfLines > 0) {

			int i = 1;
			for (; i < numberOfLines; i++) {
				System.out.print(i + " " );
			}
			for (; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
			int space = elements * 2;
			while (space-- > 0) {
				System.out.print(" ");
			}
			numberOfLines--;
			elements++;
		}
	}
	/**
	 *                9 
	                8 9 8 
	              7 8 9 8 7 
	            6 7 8 9 8 7 6 
	          5 6 7 8 9 8 7 6 5 
	        4 5 6 7 8 9 8 7 6 5 4 
	      3 4 5 6 7 8 9 8 7 6 5 4 3 
	    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 
	  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
	 * @param numberOfLines
	 */
	public void pattern6(int numberOfLines) {
		int elements = 0;
		while (numberOfLines > 0) {
			
			int space = numberOfLines * 2;
			while (space-- > 0) {
				System.out.print(" ");
			}
			int i = 1;
			space = numberOfLines;
			for (; i <= elements; i++,space++) {
				System.out.print(space + " ");
			}
			for (; i > 0; i--,space--) {
				System.out.print(space + " ");
			}
			System.out.println();
			numberOfLines--;
			elements++;
		}
	}
	
	public static void main(String[] args) {
		PyramidOfNumbers pyramidOfNumbers = new PyramidOfNumbers();
		System.out.println("Start of application");
		pyramidOfNumbers.pattern6(9);
		System.out.println("End of application");
	}
}
