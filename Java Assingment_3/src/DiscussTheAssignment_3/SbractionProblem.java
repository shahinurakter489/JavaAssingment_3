package DiscussTheAssignment_3;

public class SbractionProblem {

	public static void main(String[] args) {
		 SbractionProblem sub=new  SbractionProblem();
		
	int  SbractionProblem;	
		int numberOne=sub.numberOne();
		int numberTwo=sub.numberTwo();
		if(numberOne > numberTwo) {
			System.out.println("This is one Number");
		}else {
			
			System.out.println("this is  two number");
			}
		}
		

	
int numberOne() {
	int numberOne=(int)Math.floor(Math.random()*100);
	return numberOne;
}
int numberTwo() {
	int numberTwo=(int)Math.floor(Math.random()*100);
	return numberTwo;
}
}
