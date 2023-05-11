package model;
import java.util.GregorianCalendar;

public class Book extends BibliographicPtoducts{
    
    private String briefReview;
    private Genre genre;
    private String id;

    /*
     * Constructor method for the Book class
     * @param name Book's name
     * @param pageNumber Book's number of pages
     * @param publicationDate Book's publication date
     * @param price Book's price
     * @param briefReview Book's brief review
     * @param genre Book's genre (flag value converted inside the constructor to a Genre enum)
     */
    public Book (String name, int pageNumber, GregorianCalendar publicationDate, double price, String url, String briefReview, int genre) {
        super(name, pageNumber, publicationDate, price, url, briefReview, genre);
        setGenreByFlag(genre);
        this.briefReview = briefReview;
        generateID();
    }

    /*
     * Method that generates a random ID for the book that is  a unique 3 hexadecimal digit identifier (1,2,3,4,5,6,7,8,9,A,B,C,D,E,F)
     */
    @Override
     public String generateID() {
        String id = "";
        for (int i = 0; i < 3; i++) {
            id += Integer.toHexString((int) (Math.random() * 16));
        }
        setId(id);
        return id;
    }

    /*
     * Method that converts the genre flag value to a Genre enum value
     * @param genre Genre flag value
     */
    public void setGenreByFlag(int genre) {
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
    }
    
    /*
     * Method that returns the book's brief review
     * @return briefReview Book's brief review
     */
    public String getBriefReview() {
        return briefReview;
    }

    /*
     * Method that returns the book's genre
     * @return genre Book's genre
     */
    public Genre getGenre() {
        return genre;
    }

    /*
     * Method that returns the book's ID
     * @return id Book's ID
     */
    public String getId() {
        return id;
    }

    /*
     * Method that sets the book's brief review
     * @param briefReview Book's brief review
     */
    public void setBriefReview(String briefReview) {
        this.briefReview = briefReview;
    }

    /*
     * Method that sets the book's genre
     * @param genre Book's genre
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /*
     * Method that sets the book's ID
     * @param id Book's ID
     */
    public void setId(String id) {
        this.id = id;
    }
}
