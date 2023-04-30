package model;

import java.util.GregorianCalendar;

public class ReadXController {
    
    BibliographicPtoducts bibliographicPtoducts;
    Users users;
    public ReadXController( String name, int pageNumber, GregorianCalendar publicationDate, double price, int selectedProduct) {
        bibliographicPtoducts = new BibliographicPtoducts(name, pageNumber, publicationDate, price, selectedProduct);
    }


}
