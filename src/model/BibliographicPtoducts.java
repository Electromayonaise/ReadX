package model;
import java.util.GregorianCalendar;


public abstract class BibliographicPtoducts {
    
    private String name;
    private int pageNumber;
    private GregorianCalendar publicationDate;
    private double price;


    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
    }

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
