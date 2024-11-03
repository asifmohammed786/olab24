package bonus;
import java.util.*;
public class newselection {
	public static String getAgeOrTitle(Object o) {
		switch(o){
			case Comic(String Title,int ageOfMainCharacter) -> {
				return Title;
			}
			case Fiction(String name,FictionType type) -> {
				return name;
			}
			case TextBook(String subject) -> {
				return subject;
			}
			default -> {
				return null;
			}
		}
	}
	public static void main(String[] args) {
		// TODO: Write a test code here and execute and text.
		Ibook<Integer> comic1 = new Comic("Batman", 13);
        Ibook<Integer> comic2 = new Comic("seven ages", 18);
        Ibook<FictionType> fiction1 = new Fiction("Brave new world", FictionType.Tragedy);
        Ibook<FictionType> fiction2 = new Fiction("The alchemist", FictionType.Comedy);
        Ibook<String> textbook1 = new TextBook("C programming");
        Ibook<String> textbook2 = new TextBook("java");
		System.out.println("\nTesting of compareTo method:");
        System.out.println("comic1 vs comic2: " + comic1.compareTo(comic2)); 
        System.out.println("fiction1 vs fiction2: " + fiction2.compareTo(fiction2));
        System.out.println("textbook1 vs textbook2: " + textbook1.compareTo(textbook2));
	}
}