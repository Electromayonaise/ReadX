package model;

import java.util.GregorianCalendar;

public class Journal extends BibliographicPtoducts{
    
    public Journal(String name, int pageNumber, GregorianCalendar publicationDate, double price) {
        super(name, pageNumber, publicationDate, price,2);
    }
}
