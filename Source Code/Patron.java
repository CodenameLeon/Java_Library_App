	public class Patron {

	private String name;
	private String email;

	
		//Constructor
	public Patron(String name, String email) {
		this.name=name;
		this.email=email;

	}
		
		public boolean borrowBook(Book book) 
	{
		if (book1 == null)
		{
			book1 = book;
			return true;
		}
		else if(book2 == null)
		{
			book2 = book;
			return true;
		}
		else if(book3 == null)
		{
			book3 = book;
			return true;
		}
		return false;
		
//GET ~~~
	public  String getName (){
		return this.name;
	}
	
	public  String getEmail () {
		 return this.email;
	}
}