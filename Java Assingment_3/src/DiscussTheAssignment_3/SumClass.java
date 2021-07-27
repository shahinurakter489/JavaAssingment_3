package DiscussTheAssignment_3;
/*Date 04/17/21
 * Local/Instance/static variable
 * */



public class SumClass {
	

int myInstanceVariable=13;
static int myStaticVariable=1300;

	public static void main(String[] args) {
		SumClass s= new SumClass();
		int myLocalVariable=13;
		System.out.println("Value of myLocalVariable from main method  "+myLocalVariable);
		System.out.println("Value of myLocalVariable from main method  "+s.sum(2,3));

		System.out.println(" Instance Variable"+s.myInstanceVariable);
		System.out.println("Static Variable "+myStaticVariable);
		
		
		s.myInstanceVariable=3;
		myStaticVariable=1500;
		System.out.println(" Instance Variable"+s.myInstanceVariable);
		System.out.println("Static Variable "+myStaticVariable);
		
	}
int sum(int a,int b) {
	
	myInstanceVariable=3;
	myStaticVariable=1500;
	int myLocalVariable =a+b;
	//System.out.println("The sum of two number are:"+myLocalVariable);
	return myLocalVariable;
}
int multiply(int a,int b) {
	System.out.println("Value of myLocalVariable from main method  "+myInstanceVariable);
	System.out.println("Value of myLocalVariable from main method  "+myStaticVariable);
	int myLocalVariable=a *b;
	return myLocalVariable;
}
}
