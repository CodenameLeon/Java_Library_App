import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Dvd implements LibraryRecords
{
	String title;
	String dvdRating;
	int id;
	
	public Dvd (String title, String dvdRating, int id){
		this.title=title;
		this.dvdRating=dvdRating;
		this.id=id;
	}
	
	public String getTitle()
	{
		// Logic to obtain the title of a DVD:
		return this.title;
	}
	
		public String getId()
	{
		// Logic to obtain the id of a DVD:
		return this.id;
	}
	

	public void checkOut()
	{
	// check to make sure book is not already checked out
		if (checkedOut == true)
			System.out.println("Error: " + title + " is already checked out!\n");
		
		else
		{
			checkedOut = true;
			System.out.println("Successfully checked out " + title + "!\n");
		}
	}

	public void checkIn()
	{
	// check to make sure book is not already checked in
		if (checkedOut == false)
		System.out.println("Error: " + title + " is already checked in!\n");
		
		else
		{
			checkedOut = false;
			System.out.println("Successfully checked in " + title + "!\n");
		}
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
			LocalDate dateDue=dateCheckOut.plusDays(7);
			return true;
		}
	}

public boolean checkOut (LibraryCard borrower)
//default check out method that uses todays' date
{
return checkOut(borrower, LocalDate.now());
}

	public boolean returnBook()
	{
		if (card == null)
		return false;
		card = null;
		return true;
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
			calculateFine = 1 + diff();
		}

}