package MyPackageAssignment_3;
/*Name:Shahinur Akter
 * Date:04/13/21
 * Problem:A rectangle width and length are: 9 and 13 inches. Write a method to display the perimeter of rectangle in console output.
 */

public class PerimeterOfRectangleHomework_1 {

	public static void main(String[] args) {
		int Py = 7;

	    for(int i = Py; i >= 1; --i) {
	      for(int space = 1; space <= Py - i; ++space) {
	        System.out.print("  ");
	      }

	      for(int j=i; j <= 2 * i - 1; ++j) {
	        System.out.print("* ");
	      }

	      for(int j = 0; j < i - 1; ++j) {
	        System.out.print("* ");
	      }

	      System.out.println();
	}

	
	
	}
}
	
	
	
	

