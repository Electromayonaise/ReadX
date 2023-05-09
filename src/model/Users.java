package model;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public abstract class Users {
 
    private String name;
    private String id;
    private int boughtBooks=0;
    private int boughtMagazineSubscriptions=0;
    private GregorianCalendar registrationDate;
    public ArrayList <Book> userBooksList = new ArrayList<Book>();
    public ArrayList <Magazine> userMagazinesList = new ArrayList<Magazine>();

    /*
     * Constructor method for the Users class (Basic users)
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     */
    public Users (String name, String id, GregorianCalendar registrationDate) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
        
    }

    /*
     * Constructor method for the Users class (Premium users)
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param cardNumber User's credit card number
     * @param securityCode User's credit card security code
     */
    public Users (String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
       
    }

    /*
     * Method that adds a book to the user's book list
     * @param foundUser User that is buying the book
     * @param desiredProduct Book that the user wants to buy
     */
    public void buyBook(String foundUser, Book desiredProduct){
        userBooksList.add(desiredProduct);
        boughtBooks++;
        System.out.println("Book bought successfully, with the user: " +foundUser);
    }

    /*
     * Method that adds a magazine to the user's magazine list
     * @param foundUser User that is buying the magazine
     * @param desiredProduct Magazine that the user wants to buy
     */
    public void buyMagazine(String foundUser, Magazine desiredProduct){
        userMagazinesList.add(desiredProduct);
        boughtMagazineSubscriptions++;
        System.out.println("Magazine bought successfully, with the user: " +foundUser);
    }
    
    public int getBoughtBooks() {
        return boughtBooks;
    }

    public int getBoughtMagazineSubscriptions() {
        return boughtMagazineSubscriptions;
    }

    public void setBoughtBooks(int boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    public void setBoughtMagazineSubscriptions(int boughtMagazineSubscriptions) {
        this.boughtMagazineSubscriptions = boughtMagazineSubscriptions;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public GregorianCalendar getRegistrationDate() {
        return registrationDate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id= id;
    }

    public void setRegistrationDate(GregorianCalendar registrationDate) {
        this.registrationDate = registrationDate;
    }

}
