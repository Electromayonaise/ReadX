package model;
import java.util.GregorianCalendar;

public class Book extends BibliographicPtoducts{
    
    private String briefReview;
    private Genre genre;
    private String id;

    public Book (String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre) {
        super(name, pageNumber, publicationDate, price, briefReview, genre);
        Genre finalGenre = null;
        if (genre==1){
            finalGenre = Genre.SCIENCEFICTION;
        }
        else if (genre==2){
            finalGenre = Genre.FANTASY;
        }
        else if (genre==3){
            finalGenre = Genre.HISTORICNOVEL;
        }
        this.genre = finalGenre;
        this.briefReview = briefReview;
        generateBookID();
    }

     // must generate a unique 3 hexadecimal digit identifier (1,2,3,4,5,6,7,8,9,A,B,C,D,E,F) may be generated by placing a 0x before the number
     public void  generateBookID() {
        String id = "0x";
        for (int i = 0; i < 3; i++) {
            id += Integer.toHexString((int) (Math.random() * 16));
        }
        setId(id);
        System.out.println("Generated book ID: " + id);
    }
    
    public String getBriefReview() {
        return briefReview;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getId() {
        return id;
    }

    public void setBriefReview(String briefReview) {
        this.briefReview = briefReview;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setId(String id) {
        this.id = id;
    }
}
