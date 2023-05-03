package model;
import java.util.GregorianCalendar;

public class ReadXController {
    
    BibliographicPtoducts bibliographicPtoducts;
    Users users;
    public ReadXController(){}

    public void createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre) {
        bibliographicPtoducts = new BibliographicPtoducts(name, pageNumber, publicationDate, price, briefReview, genre);
    }

    public void createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category){
        bibliographicPtoducts = new BibliographicPtoducts(name, pageNumber, publicationDate, price, frequencyOfIssuance, category);
    }

    public void createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode){
        users = new Users(name, id, registrationDate, cardNumber, securityCode);
    }

    public void createBasicUser(String name, String id, GregorianCalendar registrationDate){
        users = new Users(name, id, registrationDate);
    }

    public void buyProducts(String id, String productID){

    }
}
