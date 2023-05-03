package model;
import java.util.GregorianCalendar;


public class BibliographicPtoducts {
    
    private String name;
    private int pageNumber;
    private GregorianCalendar publicationDate;
    private double price;
    public static Book book;
    public static Magazine magazine;

    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
        
        book = new Book(name, pageNumber, publicationDate, price, briefReview, genre);
    }

    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
        magazine = new Magazine(name, pageNumber, publicationDate, price, frequencyOfIssuance, category);
    }

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
