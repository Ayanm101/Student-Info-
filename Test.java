public class Test {

	public static void main(String [] args)
	{
		College augsburg = new College("University of Minnesota");//the name of the school
		Courses first = new Courses("Calculus II");// the course
		Student Ayan = new Student("Ayan");//the students
		Student Sammy = new Student ("Sammy");// another student
		
		
	
		augsburg.setStudents(5000);  //sets number of students that attend augsburg
		
		
		first.setCourseID(145);
		first.setCoursePre("Mat224");
		first.setCredith(4);
		first.setDept("Calc II");
		first.setInt("Flint");
		
		first.addStudent(Ayan);
		first.addStudent(Sammy);
		Sammy.setMajor("Chemistry");
		Ayan.setMajor("Computer Science");
		Ayan.setGrade(3.7);
		Sammy.setGrade(3.8);
		
		
		System.out.println(augsburg.getCollege());
		System.out.println(first.getCourse());
	}

}
