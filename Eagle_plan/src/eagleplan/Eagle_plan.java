package eagleplan;

import eagleplan.course_enums.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Eagle_plan {
	
	private ArrayList<Course> semester;
	private int semnumber;
	private int numcourses;
	private double credits;
	
	
	public Eagle_plan(int semnumber, int numcourses, double credits) {
		semester = new ArrayList<Course>();
		this.semnumber = semnumber;
		this.numcourses = numcourses;
		this.credits = credits;
	}

	
public static Course getCS1() {
	return Course.CS1;
}

public static Course getCS2() {
	return Course.CS2;
}

public static Course getLogic() {
	return Course.LOGIC;
}

public static Course getComporg() {
	return Course.COMPORG;
}

/*public static void setCourse(String newCourse) {
	this.Course = newCourse;
}*/


//Selector allows user to choose a course and return that course
public void selector(ArrayList<Course> fillsem) {
	Scanner ask_course = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Choose from these courses: ");
	for (Course i: Course.values()) {
		System.out.println(i);
	}
		try {
			String c = ask_course.next();
			Course c1 = Course.valueOf(c);
			System.out.println("Selected course: " + c1);
			switch (c1) {
			case CS1:
				fillsem.add(Course.CS1);
				break;
			case CS2:
				fillsem.add(Course.CS2);
				break;
			case LOGIC:
				fillsem.add(Course.LOGIC);
				break;
			case COMPORG:
				fillsem.add(Course.COMPORG);
				break;
			}
			ask_course.close();
		}
		catch (IllegalArgumentException err) {
			System.out.println("Error: " + err);
		}
}


	public static void main(String[] args) {
		Scanner semnum = new Scanner(System.in);
		System.out.println("Which semester would you like to plan out? ");
		int sn = semnum.nextInt();
		
		Scanner coursenum = new Scanner(System.in);
		System.out.println("How many courses would you like to add to this semester? ");
		int cn = coursenum.nextInt();
		
		Scanner creditnum = new Scanner(System.in);
		System.out.println("How many credits would you like to take this semester? ");
		double crn = creditnum.nextDouble();
		
		Eagle_plan plan = new Eagle_plan(sn, cn, crn);
		//loop for selector method 
		Scanner run = new Scanner(System.in); 
		System.out.println("Type 'start' to choose courses or type 'quit'.");
		while (run.nextLine().equals("start")) {
			plan.selector(plan.semester);
		}

		System.out.println(plan.semester);
		semnum.close();
		coursenum.close();
		creditnum.close();
		run.close();
		// TODO: stop loop when it hits course and/or credit limit
		

	}

}
