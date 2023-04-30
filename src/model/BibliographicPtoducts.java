package model;
import utils.Validators;
import java.util.GregorianCalendar;


public class BibliographicPtoducts {
    
    private String name;
    private int pageNumber;
    private GregorianCalendar publicationDate;
    private double price;
    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, int selectedProduct) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
        if (selectedProduct == 1) {
            Validators.print("Please enter the book's genre:");
            String genre = Validators.reader.nextLine();
            Book book = new Book(name, pageNumber, publicationDate, price);
        } else if (selectedProduct == 2) {
            Journal journal = new Journal(name, pageNumber, publicationDate, price);
        }
    }
}
