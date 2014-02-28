/**
 * team4-gradebook application
 * 
 * Student is the class that will store all the student grades and informations.
 *
 * @author Zaid Albirawi
 * @version 1.4 2/28/2014
 */

package cs2212.team4;

public class Student implements StudentADT
{
	/* ************************************************************
	* Instance Variables
	************************************************************ */
	
	//The Student object first name, last name, and email.
	private String nameFirst="", nameLast="", email="";
	//The Student object number
	private int number;
	//The Student object grades.
	private StudentGrades grades;

	/**
	  * Constructor.
	  * 
	  * @param		nameFirst		String, Student object first name.
	  * @param		nameLast		String, Student object last name.
	  * @param		number			Integer, Student object unique number.
	  * @param		email			String, Student object unique email.
	  * 
	  */
	public Student(String nameFirst, String nameLast, int number, String email)
	{
		this.nameFirst=nameFirst;
		this.nameLast=nameLast;
		this.number=number;
		this.email=email;
		grades = new StudentGrades();
	}

	/* ************************************************************
	* Accessor Methods
	************************************************************ */
	
	/**
	  * Gets the Student object first name.
	  * 
	  * @return		String, the Student object first name.
	  * 
	  */
	public String getNameFirst(){return nameFirst;}

	/**
	  * Gets the Student object last name.
	  * 
	  * @return		String, the Student object last name.
	  * 
	  */
	public String getNameLast(){return nameLast;}

	/**
	  * Gets the Student object number.
	  * 
	  * @return		Integer, the Student object number.
	  * 
	  */
	public int getNumber(){return number;}

	/**
	  * Gets the Student object email.
	  * 
	  * @return		String, the Student object email.
	  * 
	  */
	public String getEmail(){return email;}
	
	/**
	  * Gets a Student object Grade object.
	  * 
	  * @return		Grade, a Student object Grade object.
	  * 
	  */
	public double getGrade(int grade){return grades.getGrade(grade);}
	
	/**
	  * Gets the Student object average.
	  * 
	  * @return		Double, the Student object average.
	  * 
	  */
	public double getAvg(){return grades.getAvg();}
	
	/**
	  * Gets the Student object assignment average.
	  * 
	  * @return		Double, the Student object assignment average.
	  * 
	  */
	public double getAsnAvg(){return grades.getAsnAvg();}
	
	/**
	  * Gets the Student object exam average.
	  * 
	  * @return		Double, the Student object exam average.
	  * 
	  */
	public double getExmAvg(){return grades.getExmAvg();}
	
	/* ************************************************************
	* Mutator Methods
	************************************************************ */
	
	/**
	  * Sets the Student object first name.
	  * 
	  * @param		nameFirst		String, the Student object first name.
	  * 
	  */
	public void setNameFirst(String nameFirst){this.nameFirst=nameFirst;}

	/**
	  * Sets the Student object last name.
	  * 
	  * @param		nameLast		String, the Student object last name.
	  * 
	  */
	public void setNameLast(String nameLast){this.nameLast=nameLast;}

	/**
	  * Sets the Student object number.
	  * 
	  * @param		number		String, the Student object number.
	  * 
	  */
	public void setNumber(int number){this.number=number;}

	/**
	  * Sets the Student object email.
	  * 
	  * @param		email			String, the Student object email.
	  * 
	  */
	public void setEmail(String email){this.email=email;}
	
	/**
	  * Sets the Student object average.
	  * 
	  * @param		avg				Double, the Student object average.
	  * 
	  */
	public void setAvg(double avg){grades.setAvg(avg);}
	
	/**
	  * Sets the Student object assignment average.
	  * 
	  * @param		asnAvg			Double, the Student object assignment average.
	  * 
	  */
	public void setAsnAvg(double asnAvg){grades.setAsnAvg(asnAvg);}
	
	/**
	  * Sets the Student object exam average.
	  * 
	  * @param		exmAvg			Double, the Student object exam average.
	  * 
	  */
	public void setExmAvg(double exmAvg){grades.setExmAvg(exmAvg);}
	
	/* ************************************************************
	* Helper Methods
	************************************************************ */
	
	/**
	  * Adds a grade to the StudentGrades object.
	  * 
	  * @param		deliver				Integer, the grade insertion position.
	  * @param		grade				Double, the grade.
	  * @param		type				String, the deliverable type.
	  * @param		weight				Double, the grade weight.
	  * 
	  * @return		boolean, true if the grade was inserted successfully, false otherwise.
	  * 
	  */
	public boolean addGrade(int deliver, double grade, String type, double weight){return grades.add(deliver, grade, type, weight);}
	
	/**
	  * Removes a grade from the StudentGrades object.
	  *
	  * @param		deliver				Integer, the position at where the grade will be inserted.
	  * @param		type				String, the type of the deliverable.
	  * 
	  * @return		boolean, true if the grade was removed successfully, false otherwise.
	  * 
	  */
	public boolean removeGrade(int deliver, String type){return grades.remove(deliver, type);}
	
	/**
	  * An equals method.
	  * 
	  * @param		stud				Student, the Student object.		
	  * 
	  * @return		boolean, true if the Student object is equal to this, false otherwise.
	  * 
	  */
	public boolean equals(Student stud)
	{
		if(this.toString().equalsIgnoreCase(stud.toString()))return true;
		return false;
	}

	/**
	  * A toString method.
	  * 
	  * @return		String, the Student object information string.
	  * 
	  */
	public String toString(){return ("\""+nameLast+"\", \""+nameFirst+"\", \""+number+"\""+", \""+email+"\"\n");}
}