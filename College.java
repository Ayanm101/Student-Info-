public class College {

	public String name;
	public int students;
	

	public College(String st)
	{
		name = st;
	}
	
	
	
	public void setStudents(int s) //Using setStudents will take the number of students "s" and store it in students. 
	{
		students = s; 
	}
	
	public String getCollege() //The command getStudents returns the following string. 
	{
		return "The name of the School is " + name + "\nThe number of students at " + name + " is " + students;
	}
}
