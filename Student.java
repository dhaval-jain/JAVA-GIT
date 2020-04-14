//package studentdatabaseapp;

import java.util.Scanner;

public class Student{
    private String firstName;
    private String lastName;
    private int gradYear;
    private String courses = null;
    private String studentID;
    private int tuitionBalance=0;
    private static int costOfCourse=600;
	private static int id=1000;
	
    //constructor to initialize name and year
	
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter student's first name:");
        this.firstName = in.nextLine();
        
        System.out.print("enter student's last name:");
        this.lastName = in.nextLine();
        
        System.out.print("1) Freshman\n2) sophmore\n3) junior\n4)senior \nENTER YEAR");
        this.gradYear = in.nextInt();
		
		setStudentID();
		
		
		
    }
    //generate id
    
	private void setStudentID(){
		//grade level + ID
		id++;
		this.studentID = gradYear +""+ id;
	}
	
    //enroll in course
    
	public void enroll() {
		do {
			System.out.print("Enter course name to enroll, Q to exit");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else{
				break;
			}
		} while(1 != 0 );
		
		//System.out.println("ENROLLED IN: "+ courses);
	}
	
    //view balance
    public void viewBalance() {
		System.out.println("Your balance is: $ "+ tuitionBalance);
	}
	
    //pay tuiton
    public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
    //show status
	public String toString() {
		return "Name: " + firstName + " " + lastName + 
				"\nGrade Level: " +  gradYear + 
				"\nStudent ID: " + studentID + 
				"\nCourses enrolled: " + courses + 
				"\nBalance: $" + tuitionBalance;
		
	}
	
	

