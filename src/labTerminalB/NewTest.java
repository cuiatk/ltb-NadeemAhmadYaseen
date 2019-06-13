package labTerminalB;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewTest {

	@Test
	public void test() {
		
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
