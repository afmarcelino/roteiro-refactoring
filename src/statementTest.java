import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class statementTest {

	@Test
	void testMovie() {
		Movie movieA = new Movie("action",1);
		Movie movieR = new Movie("romance",0);
		Movie movieC = new Movie("comedy",2);
		
		Rental firstR = new Rental(movieA,5);
		Rental secondR = new Rental(movieR,12);
		Rental thirdR = new Rental(movieC,3);
		
		Customer customer = new Customer("ana");
		
		customer.addRental(firstR);
		customer.addRental(secondR);
		customer.addRental(thirdR);
		
		String testStatement = "Rental Record for ana\n\taction\t15.0\n\tromance\t17.0\n\tcomedy\t1.5\nAmount owed is 33.5\nYou earned 4 frequent renter points";
		assertEquals(testStatement,customer.statement());
	}

}
