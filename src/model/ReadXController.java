package model;
import java.util.GregorianCalendar;

public class ReadXController {
    
    BibliographicPtoducts[] bibliographicPtoducts = new BibliographicPtoducts[100];
    Users[] users= new Users[100];
    public ReadXController(){}

    public void createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre, int bookPos) {
        bibliographicPtoducts[bookPos] = new BibliographicPtoducts(name, pageNumber, publicationDate, price, briefReview, genre);
    }

    public void createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category, int magazinePos){
        bibliographicPtoducts[magazinePos] = new BibliographicPtoducts(name, pageNumber, publicationDate, price, frequencyOfIssuance, category);
    }

    public void createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode, int premiumPos){
        users[premiumPos] = new Users(name, id, registrationDate, cardNumber, securityCode);
    }

    public void createBasicUser(String name, String id, GregorianCalendar registrationDate, int basicPos){
        users[basicPos] = new Users(name, id, registrationDate);
    }

    public void buyProducts(String id, String productID){
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId().equals(id)) {
                users[i].buyProduct(productID);
            }
        }
    }
}
