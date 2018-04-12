import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Book implements LibraryRecords
{
	// Declaring variables...
	String title;
	String bookAuthor;
	int id;
	
	//Constructor
	public Book (String title, String bookAuthor, int id){

		this.title=title;
		this.bookAuthor=bookAuthor;
		this.id=id;
	}
	
	public String getTitle()
	{
		// Logic to obtain the title of a book:
		return this.title;
	}
	
		public String getAuthor()
	{
		// Logic to obtain the author of a book:
		return this.author;
	}
	
		public String getId()
	{
		// Logic to obtain the id of a book:
		return this.id;
	}
	
LocalDate checkOutDate = new LocalDate();
LocalDate current = LocalDate.now();
int daysRemaining = 0;
long diff=ChronoUnit.DAYS.between(checkOutDate, dateDue);

Patron checkedOutBy;
	
	public boolean checkOut(Patron p, LocalDate argDate )
	{
		if (checkedOut != null){
			return false;
		}
		else {
			checkedOut = argDate;
			checkedOutBy = p;
			LocalDate dateDue=dateCheckOut.plusDays(28);
			return true;
		}
	}

		public boolean isOverdue()
	{
		if ( checkedOut==true && current).isAfter(dateDue)) {
			System.out.println("Overdue!");
			return true;
			}
	}	
	
	
	
	public double calculateFine () {
		double calculateFine=0;
		
		if (isOverdue == true) {
			calculateFine = .25 + diff();
		}
}