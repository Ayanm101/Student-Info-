public class Student 

{
	public String name; 
	public double grade;
	public int gpa; 
	public String major; 
	
	public Student(String stu)
	{
		name = stu;	}
		
	public void setName(String na)  //This set the name of the student 
	{
		name = na; }
	
	public void setGrade(double gd) //This sets the grade for the course. 
	{
		grade= gd;
	}


	public void setMajor(String maj) //This string is to set the major
	{
		major =maj;}
	public String toString()  //This string return all of the student's info. 
	{
		return "Student " + name + "\nGrade " + grade +  "\nMajor " + major;}

}
