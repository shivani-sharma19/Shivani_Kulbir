package library.entities.LoanFamily.LoanFamily;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import library.entities.BookFamily.BookFamily.Book;
import library.entities.MemberFamily.MemberFamily.Member;
import library.interfaces.entities.ELoanState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.IMember;


public class GetBookTest {
	Loan instance;
	IBook book;
	IMember  member;
	Date borrowDate, returnDate;
	@Before
	public void setUp() throws Exception {
		
		 book=new Book("Author1", "ITC515","0055",55);		
			member=new Member ("James", "Mack" , "0456","jj",55);
			borrowDate= new Date (2016,05,10);
	        returnDate =new Date(2016,07,10);
	        instance=new Loan(book, member, borrowDate, returnDate);
	}


	

	@Test
	public final void testGetBook() {
		IBook expResult = book;
		IBook result = instance.getBook();
		assertEquals(expResult, result);

	}

}
