package MyPackageAssignment_3;
/*Name:Shahinur Akter
 * Date:04/12/21
 * Problem _2: A method which returns the multiply value of a and b where a = 9 and b = 11. 
   Write a program which will display addition of a +b +method returns value. 
  */

public class DisplayAdditionalMethodReturnValue {

	public static void main(String[] args) {
		DisplayAdditionalMethodReturnValue moon = new DisplayAdditionalMethodReturnValue();
		moon.myJavaMethod();
		moon.myPerimeterMethod();
		moon.subtractionMethod();
		moon.mySwitchMethod();
		moon.myRandomNumber();

		System.out.println("value:"+moon.subtractionMethod());
	
		System.out.println("additional value:"+moon.myJavaMethod());
	
		int num=moon.myRandomNumber();
		if((num%2)==0) {
			System.out.println("This is even:"+num);
		}else if ((num%2)!=0) {
			System.out.println("This is Odd:"+num);
		}else {
			System.out.println("This number controal here");
		}
	}

	int myJavaMethod() {
		int a = 9;
		int b = 11;
		int c = (9 *11) +additionalmethod();
		
return c;


	}
int additionalmethod() {
	int a=9;
	int b=11;
			int  sum=9+11;
			return sum;
	
	
	
}
	
	
	
	/*
	 * Problem _1:A rectangle width and length are: 9 and 13 inches. Write a method
	 * to display the perimeter of rectangle in console output.
	 */
	void myPerimeterMethod() {
		int length = 13;
		int width = 9;
		for (int i = 1; i <= 13; i++) {
			for (int a = 1; a <= 9; a++) {
				if (i == 1 || i == 13 || a == 1 || a == 9) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}

	}


	/*
	 * Problem_3:A method returns 30, another method returns 50. Write a java
	 * program which will display subtraction value from bigger number to smaller.
	 */

	int subtractionMethod() {

		int a = 50;
		int b = 30;
		int c = a - b;
		return c;
	//	System.out.println("Subtraction value:" + a + "and" + b + "is :" + c);

	}

	/*
	 *Problem_4: Write a Java program which will display name and guesstimate age of every
	 * students in your class. (write separate method for every student).
	 * Student name and age
	 *1. Muna (20)
	 *2.Samia(22)
	 *3.Runa(23)
	 *4.Runu(21)
	 *5.Mamun(24)
	 * 
	 * 
	 */
	void mySwitchMethod() {
		int age=20;
		switch(age) {
		case 20:
			System.out.println("Muna is 20 years old ");
			break;
		case 22:
			System.out.println("Samia is 22 years old ");
			break;
		case 23:
			System.out.println("Runa is 23 years old ");
			break;
		case 21:
			System.out.println("Ranu is 21 years old ");
			break;
		case 24:
			System.out.println("Mamun is 24 years old ");
			break;
			default:
				System.out.println("Student statement is control here");
				
		}
		
		/*Problem_5:Write a Java program with a method name myRandomNumbers() that can generate any random integer from 1 – 100 using this code: 
int randomNumber = (int) Math.floor(Math.random() * 100);

You have to get the random integer number in main() method and display with a printout saying that if that particular random integer is an Even or Odd number.



		 * */
		
		
	}
	
	
	int myRandomNumber() {
		
		int randomNumber=(int)Math.floor(Math.random()*100);
		return randomNumber;
		}
			
		
		
		
	}
	
	
	
	
	
