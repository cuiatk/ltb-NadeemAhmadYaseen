package labTerminalB;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */
	@Test
	public void test1() {
		Movie m1 = new Movie("Alladin", 0);
		Movie m2 = new Movie("the Dark web", 1);
		Customer me = new Customer("Shahfahad");
		Customer me2 = new Customer("Manzoor");
		Rental r1 = new Rental(m1, 19);
		Rental r2 = new Rental(m2,15);
		
		/**
		 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
		 */
		
			me.addRental(r1);
			me.addRental(r2);
			//fail("Not yet implemented");
			String output1 = "Rental Record for Nadeem\r\n" + 
					"	Alladin	29.0\r\n" + 
					"	the dark web	60.0";
			if(output1.equals(me.statement()))
			{
				assert true;
			}
		}
	
	
	@Test
	public void test2() {
		
			Movie m1 = new Movie("Avengers", 0);
			Movie m2 = new Movie("JohnWick", 1);
			Customer me = new Customer("Nadeem");
			Customer me2 = new Customer("Faisal");
			Rental r1 = new Rental(m1, 18);
			Rental r2 = new Rental(m2,5);
			
			/**
			 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
			 */
			
				me.addRental(r1);
				me.addRental(r2);
				//fail("Not yet implemented");
				String output1 = "Rental Record for Nadeem\r\n" + 
						"	Avengers	29.0\r\n" + 
						"	johnwick	60.0";
				if(output1.equals(me.statement()))
				{
					assert true;
				}
			}

}
