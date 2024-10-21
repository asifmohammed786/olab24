package oldshelf;

public class OldSelection {

    /**
     * 
     * @param o object
     * returns if o is not a book, returns empty string, if Comic, returns title,
     * if Fiction returns name, and if TextBook returns subject.
     */
    public static String getAgeOrTitle(Object o) {
        if (o instanceof Comic) {
            return ((Comic) o).getTitle();
        } else if (o instanceof Fiction) {
            return ((Fiction) o).getName();
        } else if (o instanceof TextBook) {
            return ((TextBook) o).getSubject();
        }
        return ""; // Return empty string if not a Book
    }

    public static void main(String[] args) {
        // Test code
        Comic comic = new Comic("Batman", 29, "Stan Lee", 2008, 983);
        Fiction fiction = new Fiction("Sorrow World", "John");
        TextBook textBook = new TextBook("C programming");

        System.out.println(getAgeOrTitle(comic));     
        System.out.println(getAgeOrTitle(fiction));  
        System.out.println(getAgeOrTitle(textBook));  
    }
}
