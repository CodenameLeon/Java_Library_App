import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;


public interface LibraryRecords  {


	ArrayList<LibraryRecord> records;
	
	LibraryRecord book1 = new Book();
	records.add(book1);
	
	LibraryRecord dvd1 = new Dvd();
	records.add(dvd1);

	LibraryRecord patron1 = new Patron();
	records.add(patron1);
	
	}


	
	

