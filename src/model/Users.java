package model;
import java.util.GregorianCalendar;

public abstract class Users {
 
    private String name;
    private String id;
    private GregorianCalendar registrationDate;
    public Book[] books= new Book[100];
    public Magazine[] magazines= new Magazine[100];

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

    
    public void buyBook(String foundUser, Book desiredProduct, int pos){
        books[pos] = desiredProduct;
        System.out.println("Book bought successfully");
    }

    public void buyMagazine(String foundUser, Magazine desiredProduct, int pos){
        magazines[pos] = desiredProduct;
        System.out.println("Magazine bought successfully");
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
