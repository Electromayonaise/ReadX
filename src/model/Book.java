package model;
import java.util.GregorianCalendar;

public class Book extends BibliographicPtoducts{
    
    private Genre genre;

    public Book (String name, int pageNumber, GregorianCalendar publicationDate, double price, Genre genre) {
        super(name, pageNumber, publicationDate, price,1);
        this.genre = genre;
    }
    // must generate a unique 3 hexadecimal digit identifier (1,2,3,4,5,6,7,8,9,A,B,C,D,E,F) may be generated by placing a 0x before the number
    public String generateBookID() {
        String id = "0x";
        for (int i = 0; i < 3; i++) {
            id += Integer.toHexString((int) (Math.random() * 16));
        }
        return id;
    }
}
