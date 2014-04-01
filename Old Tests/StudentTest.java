package cs2212.team4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*
* StudentTest tests the Student class methods.
*
* @author Zaid Albirawi
* @version 2.0 3/1/2014
*/

public class StudentTest
{
	
	Student stud, stud0, stud1, stud2, stud3, stud4;
	
	@Before
	public void testStudent()
	{
		stud=new Student("Zaid", "Albirawi", "000000000", "zalbiraw0@uwo.ca");
		stud0=new Student("Zaid0", "Albirawi0", "250626000", "zalbiraw0@uwo.ca");
		stud1=new Student("Zaid1", "Albirawi1", "250626001", "zalbiraw1@uwo.ca");
		stud2=new Student("Zaid2", "Albirawi2", "250626002", "zalbiraw2@uwo.ca");
		stud3=new Student("Zaid3", "Albirawi3", "250626003", "zalbiraw3@uwo.ca");
		stud4=new Student("Zaid4", "Albirawi4", "250626004", "zalbiraw4@uwo.ca");
		
		stud.addGrade(0, 100, "Assignment", 0.5);
		stud.addGrade(1, 50, "Exam", 0.5);
	}

	@Test
	public void testGetNameFirst()
	{
		Assert.assertTrue(stud0.getNameFirst().equals("Zaid0"));
		Assert.assertTrue(stud1.getNameFirst().equals("Zaid1"));
		Assert.assertTrue(stud2.getNameFirst().equals("Zaid2"));
		Assert.assertTrue(stud3.getNameFirst().equals("Zaid3"));
		Assert.assertTrue(stud4.getNameFirst().equals("Zaid4"));
		
		Assert.assertFalse(stud0.getNameFirst().equals("Zaid"));
		Assert.assertFalse(stud1.getNameFirst().equals("Zaid"));
		Assert.assertFalse(stud2.getNameFirst().equals("Zaid"));
		Assert.assertFalse(stud3.getNameFirst().equals("Zaid"));
		Assert.assertFalse(stud4.getNameFirst().equals("Zaid"));		
	}

	@Test
	public void testGetNameLast()
	{
		Assert.assertTrue(stud0.getNameLast().equals("Albirawi0"));
		Assert.assertTrue(stud1.getNameLast().equals("Albirawi1"));
		Assert.assertTrue(stud2.getNameLast().equals("Albirawi2"));
		Assert.assertTrue(stud3.getNameLast().equals("Albirawi3"));
		Assert.assertTrue(stud4.getNameLast().equals("Albirawi4"));
		
		Assert.assertFalse(stud0.getNameLast().equals("Albirawi"));
		Assert.assertFalse(stud1.getNameLast().equals("Albirawi"));
		Assert.assertFalse(stud2.getNameLast().equals("Albirawi"));
		Assert.assertFalse(stud3.getNameLast().equals("Albirawi"));
		Assert.assertFalse(stud4.getNameLast().equals("Albirawi"));
	}

	@Test
	public void testGetNumber()
	{
		Assert.assertTrue(stud0.getNumber().equals("250626000"));
		Assert.assertTrue(stud1.getNumber().equals("250626001"));
		Assert.assertTrue(stud2.getNumber().equals("250626002"));
		Assert.assertTrue(stud3.getNumber().equals("250626003"));
		Assert.assertTrue(stud4.getNumber().equals("250626004"));
		
		Assert.assertFalse(stud0.getNumber().equals("25062600"));
		Assert.assertFalse(stud1.getNumber().equals("25062600"));
		Assert.assertFalse(stud2.getNumber().equals("25062600"));
		Assert.assertFalse(stud3.getNumber().equals("25062600"));
		Assert.assertFalse(stud4.getNumber().equals("25062600"));
	}

	@Test
	public void testGetEmail() 
	{
		Assert.assertTrue(stud0.getEmail().equals("zalbiraw0@uwo.ca"));
		Assert.assertTrue(stud1.getEmail().equals("zalbiraw1@uwo.ca"));
		Assert.assertTrue(stud2.getEmail().equals("zalbiraw2@uwo.ca"));
		Assert.assertTrue(stud3.getEmail().equals("zalbiraw3@uwo.ca"));
		Assert.assertTrue(stud4.getEmail().equals("zalbiraw4@uwo.ca"));
		
		Assert.assertFalse(stud0.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertFalse(stud1.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertFalse(stud2.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertFalse(stud3.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertFalse(stud4.getEmail().equals("zalbiraw@uwo.ca"));
	}

	@Test
	public void testGetGrade()
	{
		Assert.assertTrue(stud.getGrade(0)==100);
		Assert.assertTrue(stud.getGrade(1)==50);
		
		Assert.assertFalse(stud.getGrade(0)==0);
		Assert.assertFalse(stud.getGrade(1)==0);
	}

	@Test
	public void testGetAvg() 
	{
		Assert.assertTrue(stud.getAvg()==75);
		Assert.assertFalse(stud.getAvg()==0);
	}

	@Test
	public void testGetAsnAvg()
	{
		Assert.assertTrue(stud.getAsnAvg()==100);
		Assert.assertFalse(stud.getAsnAvg()==0);
	}

	@Test
	public void testGetExmAvg()
	{
		Assert.assertTrue(stud.getExmAvg()==50);
		Assert.assertFalse(stud.getExmAvg()==0);
	}

	@Test
	public void testSetNameFirst()
	{
		stud0.setNameFirst("Zaid");
		stud1.setNameFirst("Zaid");
		stud2.setNameFirst("Zaid");
		stud3.setNameFirst("Zaid");
		stud4.setNameFirst("Zaid");
		
		Assert.assertTrue(stud0.getNameFirst().equals("Zaid"));
		Assert.assertTrue(stud1.getNameFirst().equals("Zaid"));
		Assert.assertTrue(stud2.getNameFirst().equals("Zaid"));
		Assert.assertTrue(stud3.getNameFirst().equals("Zaid"));
		Assert.assertTrue(stud4.getNameFirst().equals("Zaid"));
		
		Assert.assertFalse(stud0.getNameFirst().equals("Zaid0"));
		Assert.assertFalse(stud1.getNameFirst().equals("Zaid1"));
		Assert.assertFalse(stud2.getNameFirst().equals("Zaid2"));
		Assert.assertFalse(stud3.getNameFirst().equals("Zaid3"));
		Assert.assertFalse(stud4.getNameFirst().equals("Zaid4"));
	}

	@Test
	public void testSetNameLast()
	{
		stud0.setNameLast("Albirawi");
		stud1.setNameLast("Albirawi");
		stud2.setNameLast("Albirawi");
		stud3.setNameLast("Albirawi");
		stud4.setNameLast("Albirawi");
		
		Assert.assertTrue(stud0.getNameLast().equals("Albirawi"));
		Assert.assertTrue(stud1.getNameLast().equals("Albirawi"));
		Assert.assertTrue(stud2.getNameLast().equals("Albirawi"));
		Assert.assertTrue(stud3.getNameLast().equals("Albirawi"));
		Assert.assertTrue(stud4.getNameLast().equals("Albirawi"));
		
		Assert.assertFalse(stud0.getNameLast().equals("Albirawi0"));
		Assert.assertFalse(stud1.getNameLast().equals("Albirawi1"));
		Assert.assertFalse(stud2.getNameLast().equals("Albirawi2"));
		Assert.assertFalse(stud3.getNameLast().equals("Albirawi3"));
		Assert.assertFalse(stud4.getNameLast().equals("Albirawi4"));
	}

	@Test
	public void testSetNumber()
	{
		stud0.setNumber("000000000");
		stud1.setNumber("111111111");
		stud2.setNumber("222222222");
		stud3.setNumber("333333333");
		stud4.setNumber("444444444");
		
		Assert.assertTrue(stud0.getNumber().equals("000000000"));
		Assert.assertTrue(stud1.getNumber().equals("111111111"));
		Assert.assertTrue(stud2.getNumber().equals("222222222"));
		Assert.assertTrue(stud3.getNumber().equals("333333333"));
		Assert.assertTrue(stud4.getNumber().equals("444444444"));
		
		Assert.assertFalse(stud0.getNumber().equals("25062600"));
		Assert.assertFalse(stud1.getNumber().equals("25062600"));
		Assert.assertFalse(stud2.getNumber().equals("25062600"));
		Assert.assertFalse(stud3.getNumber().equals("25062600"));
		Assert.assertFalse(stud4.getNumber().equals("25062600"));
	}

	@Test
	public void testSetEmail()
	{
		stud0.setEmail("zalbiraw@uwo.ca");
		stud1.setEmail("zalbiraw@uwo.ca");
		stud2.setEmail("zalbiraw@uwo.ca");
		stud3.setEmail("zalbiraw@uwo.ca");
		stud4.setEmail("zalbiraw@uwo.ca");
		
		Assert.assertTrue(stud0.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertTrue(stud1.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertTrue(stud2.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertTrue(stud3.getEmail().equals("zalbiraw@uwo.ca"));
		Assert.assertTrue(stud4.getEmail().equals("zalbiraw@uwo.ca"));
		
		Assert.assertFalse(stud0.getEmail().equals("zalbiraw0@uwo.ca"));
		Assert.assertFalse(stud1.getEmail().equals("zalbiraw1@uwo.ca"));
		Assert.assertFalse(stud2.getEmail().equals("zalbiraw2@uwo.ca"));
		Assert.assertFalse(stud3.getEmail().equals("zalbiraw3@uwo.ca"));
		Assert.assertFalse(stud4.getEmail().equals("zalbiraw4@uwo.ca"));
	}

	@Test
	public void testSetAvg()
	{
		stud.setAvg(100);
		Assert.assertTrue(stud.getAvg()==100);
		Assert.assertFalse(stud.getAvg()==75);
	}

	@Test
	public void testSetAsnAvg()
	{
		stud.setAsnAvg(75);
		Assert.assertTrue(stud.getAsnAvg()==75);
		Assert.assertFalse(stud.getAsnAvg()==100);
	}

	@Test
	public void testSetExmAvg()
	{
		stud.setExmAvg(75);
		Assert.assertTrue(stud.getExmAvg()==75);
		Assert.assertFalse(stud.getExmAvg()==50);
	}

	@Test
	public void testAddGrade()
	{
		Assert.assertTrue(stud.addGrade(0, 100, "Other", 1));
	}

	@Test
	public void testRemoveGrade()
	{
		Assert.assertTrue(stud.removeGrade(0, "Assignment"));
		Assert.assertTrue(stud.removeGrade(1, "Exam"));
		
		Assert.assertFalse(stud.removeGrade(0, "Exam"));
		Assert.assertFalse(stud.removeGrade(1, "Assignment"));
	}

	@Test
	public void testEqualsStudent()
	{
		Assert.assertTrue(stud0.equals(new Student("Zaid0", "Albirawi0", "250626000", "zalbiraw0@uwo.ca")));
		Assert.assertTrue(stud1.equals(new Student("Zaid1", "Albirawi1", "250626001", "zalbiraw1@uwo.ca")));
		Assert.assertTrue(stud2.equals(new Student("Zaid2", "Albirawi2", "250626002", "zalbiraw2@uwo.ca")));
		Assert.assertTrue(stud3.equals(new Student("Zaid3", "Albirawi3", "250626003", "zalbiraw3@uwo.ca")));
		Assert.assertTrue(stud4.equals(new Student("Zaid4", "Albirawi4", "250626004", "zalbiraw4@uwo.ca")));
		
		Assert.assertFalse(stud0.equals(new Student("Zaid", "Albirawi", "25062600", "zalbiraw@uwo.ca")));
		Assert.assertFalse(stud1.equals(new Student("Zaid", "Albirawi", "25062600", "zalbiraw@uwo.ca")));
		Assert.assertFalse(stud2.equals(new Student("Zaid", "Albirawi", "25062600", "zalbiraw@uwo.ca")));
		Assert.assertFalse(stud3.equals(new Student("Zaid", "Albirawi", "25062600", "zalbiraw@uwo.ca")));
		Assert.assertFalse(stud4.equals(new Student("Zaid", "Albirawi", "25062600", "zalbiraw@uwo.ca")));
	}

	@Test
	public void testToString()
	{
		Assert.assertTrue(stud0.toString().equals("\"Albirawi0\", \"Zaid0\", \"250626000\", \"zalbiraw0@uwo.ca\"\n"));
		Assert.assertTrue(stud1.toString().equals("\"Albirawi1\", \"Zaid1\", \"250626001\", \"zalbiraw1@uwo.ca\"\n"));
		Assert.assertTrue(stud2.toString().equals("\"Albirawi2\", \"Zaid2\", \"250626002\", \"zalbiraw2@uwo.ca\"\n"));
		Assert.assertTrue(stud3.toString().equals("\"Albirawi3\", \"Zaid3\", \"250626003\", \"zalbiraw3@uwo.ca\"\n"));
		Assert.assertTrue(stud4.toString().equals("\"Albirawi4\", \"Zaid4\", \"250626004\", \"zalbiraw4@uwo.ca\"\n"));
		
		Assert.assertFalse(stud0.toString().equals("\"Albirawi\", \"Zaid\", \"25062600\", \"zalbiraw@uwo.ca\"\n"));
		Assert.assertFalse(stud1.toString().equals("\"Albirawi\", \"Zaid\", \"25062600\", \"zalbiraw@uwo.ca\"\n"));
		Assert.assertFalse(stud2.toString().equals("\"Albirawi\", \"Zaid\", \"25062600\", \"zalbiraw@uwo.ca\"\n"));
		Assert.assertFalse(stud3.toString().equals("\"Albirawi\", \"Zaid\", \"25062600\", \"zalbiraw@uwo.ca\"\n"));
		Assert.assertFalse(stud4.toString().equals("\"Albirawi\", \"Zaid\", \"25062600\", \"zalbiraw@uwo.ca\"\n"));
	}
}