package labTerminalB;

import static org.junit.Assert.*;

import org.junit.Test;

public class Twotest {

	@Test
	public void test() {
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
	}


