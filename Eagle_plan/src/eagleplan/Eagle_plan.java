package eagleplan;

import eagleplan.course_enums.Course;

import java.util.ArrayList;

import java.util.Scanner;

public class Eagle_plan {
	
	private ArrayList<Course> semester_1;
	private ArrayList<Course> semester_2;
	private ArrayList<Course> semester_3;
	private ArrayList<Course> semester_4;
	private ArrayList<Course> semester_5;
	private ArrayList<Course> semester_6;
	private ArrayList<Course> semester_7;
	private ArrayList<Course> semester_8;
	
	public Eagle_plan() {
		
		semester_1 = new ArrayList<Course>();
		semester_2 = new ArrayList<Course>();
		semester_3 = new ArrayList<Course>();
		semester_4 = new ArrayList<Course>();
		semester_5 = new ArrayList<Course>();
		semester_6 = new ArrayList<Course>();
		semester_7 = new ArrayList<Course>();
		semester_8 = new ArrayList<Course>();
		
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


public Course selector() {
	Scanner ask_course = new Scanner(System.in);  // Create a Scanner object
	System.out.println("Choose from these courses: ");
	for (Course i: Course.values()) {
		System.out.println(i);
	}
	
	while(true) {
		try {
			String c = ask_course.next();
			System.out.println("Selected course: " + Course.valueOf(c));
			Course c1 = Course.valueOf(c);
			return c1;
		}
		catch (IllegalArgumentException error) {
			System.out.println("  Error: " + error);
		}
	}
}


	public static void main(String[] args) {
		Eagle_plan plan1 = new Eagle_plan();
		System.out.println(plan1.selector());
			
		
		/*Course class1 = getCS1();
		Course class2 = getCS2();
		plan1.semester_1.add(class1);
		plan1.semester_2.add(class2);
		System.out.println(plan1.semester_1);
		System.out.println(plan1.semester_2);*/
		
		
		// TODO Auto-generated method stub
		
		
		//USE SWITCH CASE BUT c = User input
		//see if user input can input enum
		
		/*Course c = Course.CS2;
		
		switch (c) {
		case CS1:
			System.out.println("CS1");
			break;
		case CS2:
			System.out.println("CS2");
			break;
		case LOGIC:
			System.out.println("Logic & Computation");
			break;
		case COMPORG:
			System.out.println("Computer organization");
			break;
		}*/

	}

}
