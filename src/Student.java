/*
 * Description: This is a student class with the properties:  name, a Social Security number, and a GPA 
 * Author: Daniel Zelfo
 * Date: 4/17/2019
 */
public class Student {
	/**instance variables*/
	private String name;
	private int socialSecurityNumber;
	private double gpa;
	
	/**default constructor*/
	public Student() {
		this.name = "unknown";
	}
	
	/**overload constructor*/
	public Student(String name, int socialSecurityNumber, double gpa) {
		this.name = name;
		setSocialSecurityNumber(socialSecurityNumber);
		setGpa(gpa);
	}
	
	//mutators and accessors
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	/**social security number setter with validation*/
	public void setSocialSecurityNumber(int socialSecurityNumber) {
		if(Integer.toString(socialSecurityNumber).length() == 9)
			this.socialSecurityNumber = socialSecurityNumber;
	}

	public double getGpa() {
		return gpa;
	}
	/**gpa setter with validation*/
	public void setGpa(double gpa) {
		if(gpa >= 0 && gpa <= 5)
			this.gpa = gpa;
	}
	
	/**The toString Method for outputting the student information*/
	public String toString() {
		return("Information for the student: \n"
				+ "name: " + name + "\n"
				+ "Social Security Number: " + socialSecurityNumber + "\n"
				+ "GPA: " + gpa + "\n");
	}
	
	/**The equals Method: This will compare two students */
	public boolean equals( Object compare )
    {
       if ( ! ( compare instanceof Student ) )
 	      return false;
       else
       {
          Student objStudent = ( Student ) compare;
	       if ( name == objStudent.name && socialSecurityNumber == objStudent.socialSecurityNumber && gpa == objStudent.gpa )
             return true;
          else
             return false;
       }
    }
}
