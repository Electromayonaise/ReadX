package model;
import utils.Validators;
import java.util.GregorianCalendar;


public class BibliographicPtoducts {
    
    private String name;
    private int pageNumber;
    private GregorianCalendar publicationDate;
    private double price;
    public static Book book;
    public static Journal journal;

    public BibliographicPtoducts(String name, int pageNumber, GregorianCalendar publicationDate, double price, int selectedProduct) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.publicationDate = publicationDate;
        this.price = price;
        if (selectedProduct == 1) {
            createBook();
        } else if (selectedProduct == 2) {
            createJournal();
        }
    }

    public void createBook() {
        Validators.print("Please enter the book`s genre: ");
        Genre genre = Validators.validateGenre();
        book = new Book(name, pageNumber, publicationDate, price, genre);
    }

    public void createJournal() {
        journal = new Journal(name, pageNumber, publicationDate, price);
    }
}
