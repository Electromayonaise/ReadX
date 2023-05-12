package model;
import java.util.GregorianCalendar;

/**
 * Abstract class that represents the bibliographic products
 */
public abstract class BibliographicPtoducts {
    
    private String name;
    private int pageNumber;
    private GregorianCalendar publicationDate;
    private double price;
    private String url;
    private GregorianCalendar dateOfPurchase;
    private boolean status;
    private int highestPageNumber;

    /**
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

    /**
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

    /**
     * Abstract method to be implemented in the Book and Magazine classes
     */
    public abstract String generateID();


    /**
     * Method that sets the highest page number a user has read
     */
    public void setHighestPageNumber (int highestPageNumber){
        this.highestPageNumber=highestPageNumber;
    }

    /**
     * Method that returns the highest page number a user has read
     * @return highestPageNumber Highest page number a user has read
     */
    public int getHighestPageNumber (){
        return highestPageNumber;
    }

    /**
     * Method that returns the date of purchase of a bibliographic product
     * @param dateOfPurchase Date of purchase of a bibliographic product
     */
    public GregorianCalendar getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * Method that sets the date of purchase of a bibliographic product
     * @param dateOfPurchase Date of purchase of a bibliographic product
     */
    public void setDateOfPurchase(GregorianCalendar dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    /**
     * Method that returns the name of a bibliographic product
     * @return name Name of a bibliographic product
     */
    public String getName() {
        return name;
    }

    /**
     * Method that returns the number of pages of a bibliographic product
     * @return pageNumber Number of pages of a bibliographic product
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Method that returns the publication date of a bibliographic product
     * @return publicationDate Publication date of a bibliographic product
     */
    public GregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Method that returns the price of a bibliographic product
     * @return price Price of a bibliographic product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method that sets the name of a bibliographic product
     * @param name Name of a bibliographic product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method that sets the number of pages of a bibliographic product
     * @param pageNumber Number of pages of a bibliographic product
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Method that sets the publication date of a bibliographic product
     * @param publicationDate Publication date of a bibliographic product
     */
    public void setPublicationDate(GregorianCalendar publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * Method that sets the price of a bibliographic product
     * @param price Price of a bibliographic product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Method that sets the url of a bibliographic product
     * @param url Url of a bibliographic product
     */
    public void setUrl(String url){
        this.url=url;
    }
    
    /**
     * Method that returns the url of a bibliographic product
     * @return url Url of a bibliographic product
     */
    public String getUrl(){
        return url;
    }

    /**
     * Method that returns the status of a bibliographic product
     * @return status Status of a bibliographic product
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Method that sets the status of a bibliographic product
     * @param status Status of a bibliographic product
     */
    public void setStatus(boolean status) {
        this.status = status;
    }   

    /**
     * Abstract method to be implemented in the Book and Magazine classes
     */
    public abstract String getId ();

    /**
     * Abstract method to be implemented in the Book and Magazine classes
     */
    public abstract void setId (String id);

    /**
     * Abstract method to be implemented in the Book and Magazine classes
     */
    public abstract void setGenreOrCategoryByFlag (int flag);

    /**
     * Method that casts a magazine to set its frequency of issuance
     * @param frequencyOfIssuance
     */
    public void setFrequencyOfIssuance(int frequencyOfIssuance) {
        ((Magazine)this).setFrequencyOfIssuance(frequencyOfIssuance);
    }

    /**
     * Method that casts a book to set its brief review
     * @param category
     */
    public void setBriefReview(String briefReview) {
        ((Book)this).setBriefReview(briefReview);
    }
}
