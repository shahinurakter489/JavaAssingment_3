package DiscussTheAssignment_3;

public class MethodProblem_2 {

	public static void main(String[] args) {
		MethodProblem_2 m =new MethodProblem_2();
		int a=9;
		int b=11;
		int result=a+b+m.multiplyValue();
		System.out.println("Result is:"+result);
		
	}
int multiplyValue() {
	int a=9;
	int b=11;
	int c=a*b;
	return c;
}
}
