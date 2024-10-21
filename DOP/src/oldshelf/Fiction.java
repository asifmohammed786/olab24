package oldshelf;

public class Fiction extends Book {

	/* TODO: Add most strict modifiers here*/
	private String name;
	private String title;
	// TODO: change 
	/**
	 * type is  a per instance object and it is initialized only once.
	 * 
	 */
	private static FictionType type;
	public Fiction(String title, String name) {
		this.title = title;
		this.name = name;
	}

	public String getName() {
        return name;
    }

	public void setName(String name) {
        this.name = name;
    }

	public void displayInfo() {
        System.out.println(this.toString());
    }

	public String getTitle() {
        return title;
    }

	@Override
    public String toString() {
        return "Fiction Title: " + getTitle() + ", Name: " + name + ", Type: " + type;
    }

}


