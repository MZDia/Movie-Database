//Written by Mia Dia
public class MovieDatabase {
	private GenLL<String> db; // db for database
	public MovieDatabase() {
		this.db = new GenLL<String>();
	}
	
// Methods / / / / / / / / / / / / / / /
	public void add(String name) 
	{
		if(findMovie(name)) {
			p("\n"+name+" is already in the database!");
			return;
		}
		this.db.add(name);
		p("");
		p(name+" has been added to the database.");
	}
	
	public void remove(String name)
	{
		if(findMovie(name) == false) {
			p("\nNo movie titled "+name+" found!");
			return;
		}
		
		this.db.deleteTitle(name);
		p("");
		p(name+" has been removed to the database.");
	}
	
	public boolean findMovie(String name)
	{
		return this.db.contains(name);
	}
	
	public void printList(){
		db.print();
	}
	
// Print method / / / / 
	public void p(String words) {
		System.out.println(words);
	}
}
