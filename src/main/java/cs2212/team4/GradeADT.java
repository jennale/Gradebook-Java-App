package cs2212.team4;

public interface GradeADT
{
	/**
	  * Gets the Grade object grade.
	  * 
	  * @return		Double, the Grade object grade.
	  * 
	  */
	public double getGrade();
	
	/**
	  * Gets the Grade object weight.
	  * 
	  * @return		Double, the Grade object weight.
	  * 
	  */
	public double getWeight();
	
	/**
	  * Sets the Grade object grade.
	  * 
	  * @param		grade			Double,the Grade object grade.
	  * 
	  */
	public void setGrade(double grade);
	
	/**
	  * Sets the Grade object weight.
	  * 
	  * @param		weight			Double,the Grade object weight.
	  * 
	  */
	public void setWeight(double weight);
}