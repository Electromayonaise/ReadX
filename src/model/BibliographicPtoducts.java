package model;
import java.util.GregorianCalendar;


public abstract class BibliographicPtoducts {
    
    private String name;
    private int pageNumber;
    private GregorianCalendar publicationDate;
    private double price;
    private String url;
    private GregorianCalendar dateOfPurchase;
    private boolean status;
    private int highestPageNumber;

    /*
     * Constructor method for the BibliographicPtoducts class (Books)
     * @param name Bibliographic product's name
     * @param pageNumber Bibliographic product's number of pages
     * @param publicationDate Bibliographic product's publication date
     * @param price Bibliographic product's price
     * @param briefReview Bibliographic product's brief review
     * @param genre Bibliographic product's genre (flag value)
     */
    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, String url, String briefReview, int genre) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
        this.url=url;
        this.status=false ;
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
    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, String url, int frequencyOfIssuance, int category) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
    }

    /*
     * Abstract method to be implemented in the Book and Magazine classes
     */
    public abstract String generateID();


    public void setHighestPageNumber (int highestPageNumber){
        this.highestPageNumber=highestPageNumber;
    }

    public int getHighestPageNumber (){
        return highestPageNumber;
    }
    
    public GregorianCalendar getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(GregorianCalendar dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
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

    public void setUrl(String url){
        this.url=url;
    }
    
    public String getUrl(){
        return url;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }   
}
