package model;
import java.util.GregorianCalendar;


public abstract class BibliographicPtoducts {
    
    private String name;
    private int pageNumber;
    private GregorianCalendar publicationDate;
    private double price;

    /*
     * Constructor method for the BibliographicPtoducts class (Books)
     * @param name Bibliographic product's name
     * @param pageNumber Bibliographic product's number of pages
     * @param publicationDate Bibliographic product's publication date
     * @param price Bibliographic product's price
     * @param briefReview Bibliographic product's brief review
     * @param genre Bibliographic product's genre (flag value)
     */
    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    /*
     * Constructor method for the BibliographicPtoducts class (Magazines)
     * @param name Bibliographic product's name
     * @param pageNumber Bibliographic product's number of pages
     * @param publicationDate Bibliographic product's publication date
     * @param price Bibliographic product's price
     * @param frequencyOfIssuance Bibliographic product's frequency of issuance
     * @param category Bibliographic product's category (flag value)
     */
    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    /*
     * Abstract method to be implemented in the Book and Magazine classes
     */
    public abstract void generateID();

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public GregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPublicationDate(GregorianCalendar publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
