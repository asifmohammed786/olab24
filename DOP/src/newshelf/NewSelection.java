package newshelf;


public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Comic c) {
			return ((Comic) o).Title();
		}
		if(o instanceof TextBook t){
			return ((TextBook) o).subject();
		}	
		if(o instanceof Fiction f){
			return ((Fiction) o).name();
		}

		return null;
	}

	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("C programming");
		Comic comic1 = new Comic("Batman",29);
		Fiction fiction1 = new Fiction("Sorrow World",FictionType.Tragedy);
		System.out.println(getAgeOrTitle(fiction1));
		System.out.println(getAgeOrTitle(comic1));
		System.out.println(getAgeOrTitle(tb1));
		
	}
}
