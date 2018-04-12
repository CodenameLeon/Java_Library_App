
import java.ArrayList;

public class Library {
	
		

		private ArrayList<Book> books = new ArrayList<Book>();
		private ArrayList<Dvd> dvds = new ArrayList<Dvd>();
		
		
		public void addBook(Book argBook){
		books.add(argBook);
		}
	
		public void addDvd(Dvd argDvd) {
		dvds.add(argDvd);
		}
		
	//Book Search
	public String bookSearchTitle(String bookTitleSearch) {
		
		if (bookTitleSearch == null) return " No Books Avaliable ";
		
		for(int i = 0; i < books.size(); i++){
        
		if(bookTitleSearch.equalsIgnoreCase(books.get(i).getTitle())){
            return books.get(i).toString();
        }
    }
    return "\n No Books Avaliable "; //reachable only if no book found
	}
	
	//DVD Search
	public String dvdSearchTitle(String dvdTitleSearch) {
		
		if (dvdTitleSearch == null) return " No Books Avaliable ";
		
		for(int i = 0; i < dvds.size(); i++){
        
		if(dvdTitleSearch.equalsIgnoreCase(dvds.get(i).getTitle())){
            return books.get(i).toString();
        }
    }
    return "\n No DVDs Avaliable "; //reachable only if dvd found
	}
	
}