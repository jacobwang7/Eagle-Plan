package eagleplan;

public class course_enums {
	
	public enum Course {
		CS1("CS1"), CS2("CS2"), LOGIC("LOGIC"), COMPORG("COMPORG");
		
		private String name;
		
		private Course(String name) {
			this.name = name; 
		}
	}
	
}
