package MyPackageAssignment_3;

public class StudentStatement {
	int student;
	String name;
	int student_id;
	int student_age;

	void display() {
		System.out.println("Student Statement :"+(student+" "+name+" "+student_id+" "+student_age+","));
		//System.out.println("Student Statement :"+(student+" "+name+" "+student_id+" "+student_age+","));
		//System.out.println("Student Statement :"+(student+" "+name+" "+student_id+" "+student_age+","));
		//System.out.println("Student Statement :"+(student+" "+name+" "+student_id+" "+student_age+","));
		
	}
	
	public static void main(String[] args) {
		StudentStatement stud1 =new StudentStatement();//first student;
		stud1.student=1;
		stud1.name="Raju";
		stud1.student_id=101;
		stud1.student_age=11;
		stud1.display();
		
		StudentStatement stud2=new StudentStatement();
		
		stud2.student=2;
		stud2.name="Raja";
		stud2.student_id=202;
		stud2.student_age=12;
		stud2.display();
		
		StudentStatement stud3=new StudentStatement();
		

		stud3.student=3;
		stud3.name="Rana";
		stud3.student_id=303;
		stud3.student_age=12;
		stud3.display();
	}

}
