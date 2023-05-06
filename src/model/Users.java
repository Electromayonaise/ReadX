package model;
import java.util.GregorianCalendar;

public class Users {
 
    private String name;
    private String id;
    private GregorianCalendar registrationDate;
    public BibliographicPtoducts[] bibliographicPtoducts= new BibliographicPtoducts[100];

    public Users (String name, String id, GregorianCalendar registrationDate) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
    }

    public Users (String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
    }

    public void buyProduct(String foundUser, BibliographicPtoducts desiredProduct, int pos){
        bibliographicPtoducts[pos] = desiredProduct;
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
