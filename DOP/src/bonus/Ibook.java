package bonus;
public sealed interface Ibook<T> extends Comparable<Ibook<T>> permits Comic, Fiction, TextBook {
    int compareTo(Ibook<T> other);
}
enum FictionType {
	Comedy,
	Tragedy,
	GoK,DEFAULT
}
record Fiction(String name,FictionType type) implements Ibook<FictionType> {
	 public int compareTo(Ibook<FictionType> other) {
        if (other instanceof Fiction otherFiction) {
            return this.type.compareTo(otherFiction.type); 
        }
        return 0; 
	}
}
record TextBook(String subject) implements Ibook<String>{
    public int compareTo(Ibook<String> other) {
        if (other instanceof TextBook otherTextBook) {
            return this.subject.compareTo(otherTextBook.subject);
        }
        return 0; 
    }
}
record Comic(String Title,int ageOfMainCharacter) implements Ibook<Integer> {	
    public int compareTo(Ibook<Integer> other) {
        if (other instanceof Comic otherComic) {
            return this.ageOfMainCharacter-otherComic.ageOfMainCharacter;
        }
        return 0; 
    }
}
