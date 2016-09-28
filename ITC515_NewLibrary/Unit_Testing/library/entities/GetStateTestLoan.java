/**
 * 
 */
package library.entities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;
import java.util.Date;

/**
 * @author sarvanjit
 *
 */
public class GetStateTestLoan {
	Loan instance;
	IBook book;
	IMember member;
	Date borrowDate, returnDate;

	/**
	 * @throws java.lang.Exception
	 */

	@Before
	public void setUp() throws Exception {
		book = new Book("Skk", "jhh", "hyyt", 45);
		member = new Member("james", "Mack", "12132", "jjh", 45);
		borrowDate = new Date(2016, 05, 10);
		returnDate = new Date(2016, 05, 10);

		instance = new Loan(book, member, borrowDate, returnDate);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link library.entities.Loan#getState()}.
	 */
	@Test
	public final void testGetState() {
		ELoanState expResult = ELoanState.PENDING;
		ELoanState result = instance.getState();
		assertEquals(expResult, result);

	}

}
