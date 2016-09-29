package library.entities;
import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;

public class GetBookLoan {
	Loan instance;
	IBook book;
	IMember member;
	Date borrowDate, returnDate;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		book = new Book("Skk", "jhh", "hyyt", 45);
		member = new Member("james", "Mack", "12132", "jjh", 45);
		borrowDate = new Date(2016, 05, 10);
		returnDate = new Date(2016, 05, 10);

		instance = new Loan(book, member, borrowDate, returnDate);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testBook() {
		IBook expResult = book;
		IBook result = instance.getBook();
		assertEquals(expResult, result);
		
	}

}
