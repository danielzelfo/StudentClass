/*
 * Description: This is a cient for the student classthat is testing it
 * Author: Daniel Zelfo
 * Date: 4/17/2019
 */
public class StudentClient {

	public static void main(String[] args) {
		//creating new student objects
		Student student1 = new Student("Daniel", 384284621, 3.9);
		Student student2 = new Student("Jonathan", 754727472, 3.8);
		
		//comparing the two students
		System.out.println("The two students are the same? " + student1.equals(student2) + "\n");
		
		//using the accessors
		System.out.println(student1.getName() + "'s social security number: " + student1.getSocialSecurityNumber());
		System.out.println(student2.getName() + "'s GPA: " + student2.getGpa() + "\n");
		
		//using the mutator
		student2.setGpa(3.9);
		
		//Printing the objects using the toString method
		System.out.println(student1.toString());
		//No need to type in the toString method because it will be used automatically
		System.out.println(student2);
	}

}
