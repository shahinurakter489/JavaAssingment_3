package DiscussTheAssignment_3;

public class PrameterRangl {

	public static void main(String[] args) {
		PrameterRangl pram = new PrameterRangl();// prameter this is non primitive datatypes.
		 pram.rectangleMethod(23,123);
		// pram=variable.specifical .
		 pram.rectangleMethod(20,12); 
		 pram.rectangleMethod(26,13);
	}

	void rectangleMethod(int width , int length) {

		
		int perimeter = (2 * width) + (2 * length);

		System.out.println("This is my Rectangle Method is: " + perimeter);
		// This print statement display the method.
		
	}
}