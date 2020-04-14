//package studentdatabaseapp;
import java.util.Scanner;

public class StudentDatabaseApp{
   
	public static void main(String[] args) {
	  /*Student stu1 = new Student();
		stul.enroll();
		stul.payTuition();
		Sysyem.out.println(stu1.toString());
	  */
		
	    //ask no of new users to add
	    Scanner in = new Scanner(System.in);
        System.out.print("enter no of students");
        int numOfStudents= in.nextInt();
		Student[] students = new Student[numOfStudents];
		
	    //create n new students
		for( int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		
		}
		System.out.println("Hello World");
	}
}


