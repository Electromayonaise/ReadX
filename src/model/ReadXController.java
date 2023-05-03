package model;

import java.util.GregorianCalendar;

public class ReadXController {
    
    BibliographicPtoducts bibliographicPtoducts;
    Users users;
    public ReadXController(){}

    public void createBibliographicProduct( String name, int pageNumber, GregorianCalendar publicationDate, double price, int selectedProduct) {
        bibliographicPtoducts = new BibliographicPtoducts(name, pageNumber, publicationDate, price, selectedProduct);
    }
    public void createUser(String name, String id, GregorianCalendar registrationDate, int plan){
        users = new Users(name, id, registrationDate, plan);
    }
}
