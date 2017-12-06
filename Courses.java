import java.util.ArrayList;

public class Courses{

	public String name; 
	public int courseID;
	public String coursePre; 
	public int credits; 
	public String department;
	public String intstructor;
	
	private ArrayList<Student> list;
	
	
	public Courses(String sc)  //This set the name of the course
	{
		list = new ArrayList<Student>();
		name = sc; 
	}
	
	
	public void setCourseID(int id) //This sets the course ID
	{
		courseID = id;
	}

	public void setCoursePre(String pre) //This string is to set any prerequisites
	{
		coursePre = pre;
	}
	public void setCredith(int c) //This string is to set the number of credits
	{
		credits = c;
	}
	public void setDept(String dept) //This line sets the department of the course
	{ 
		department = dept;
	}
	public void setInt(String ints) //This line sets the instructor 
	{
		intstructor = ints;
	}
	
	public void addStudent(Student st){
		list.add(st);
	}
	
	public String getCourse()  //This string return all of the course info
	{
		return "Name: " + name + " \nCourse ID: " +courseID +"\nCourse prerequisites: "+ coursePre+ 
				" \nCredits: "+ credits +"\nDepartment: " + department + "\nIntstructor: " + intstructor + "students "+ list;  
	}
	

}
