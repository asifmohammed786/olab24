package oldshelf;

public class Comic extends Book {
    private String title;
    private final int ageOfMainCharacter;
	private String author;
	private int ISBN;
	private int publishedyear;
    // Constructor
    public Comic(String title, int ageOfMainCharacter, String author, int publishedyear, int ISBN) {
        // super(title, author, publishedyear, ISBN); 
        this.title = title;
		this.author = author;
        this.ageOfMainCharacter = ageOfMainCharacter;
    }

    // Getter for title
	public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

	public int getISBN(){
		return ISBN;
	}

    public int getPublishedYear() {
        return publishedyear;
    }

	    
    // Getter for ageOfMainCharacter
    public int getAgeOfMainCharacter() {
        return ageOfMainCharacter;
    }
	public void displayInfo() {
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Comic Title: " + getTitle() + ", Author: " + getAuthor() + 
               ", Publication Year: " + getPublishedYear() + 
               ", Age of Main Character: " + ageOfMainCharacter;
    }

    @Override
    public int hashCode() {
        return title.hashCode() + ageOfMainCharacter;
    }

    @Override
    public boolean equals(Object o) {
        return ageOfMainCharacter == this.hashCode() && title.equals(this.title);
    }    
}
