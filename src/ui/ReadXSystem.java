package ui;
import java.util.Scanner;

import model.BibliographicPtoducts;
import model.ReadXController;
import java.util.GregorianCalendar;
import utils.Validators;

/*
 * Context: ReadX is an egyptian conglomerate that is in need of a software that allows them to manage their publication business globally. 
 * Functional Requirements:
 * Bibliographic products management 
 * User management
 * Buy books and journal subscriptions
 * Library presentation 
 * Reading session simulation 
 * Report generation 
 * Testing management 
 */
public class ReadXSystem {
    
    public static Scanner reader;

    public static ReadXController readXController;
    public static void print(Object a) {
        System.out.println(a);
    }

    public ReadXSystem() {
        reader  = new Scanner(System.in);
    }
    public static void main(String[] args) {
        
        menu();
        int option = reader.nextInt();
        while(option != 8) {
            switch(option) {
                case 1:
                    print("Bibliographic products management selected");
                    BibliographicProductsManagement();
                    break;
                case 2:
                    print("User management selected");
                    break;
                case 3:
                    print("Buy books and journal subscriptions selected");
                    break;
                case 4:
                    print("Library presentation selected");
                    break;
                case 5:
                    print("Reading session simulation selected");
                    break;
                case 6:
                    print("Report generation selected");
                    break;
                case 7:
                    print("Testing management selected");
                    break;
                default:
                    print("Invalid option");
                    break;
            }
            menu();
            option = reader.nextInt();
        }
    }

    public static void menu() {
        
        print("***********************************");
        print("************ReadX System***********");
        print("***********************************");
        print("1. Bibliographic products management");
        print("2. User management");
        print("3. Buy books and journal subscriptions");
        print("4. Library presentation");
        print("5. Reading session simulation"); 
        print("6. Report generation"); 
        print("7. Testing management");
        print("8. Exit");
        print("***********************************");
    }


    /*
     * Bibliographic products management: 
     * For now, the two bibliographic products are books and journals. 
     * On one hand, each book has a unique 3 hexadecimal digit identifier, a name, number of pages,  a brief review, a publication date, 
     * a genre ( Science Fiction, Fantasy, and Historic Novel), a url that leads to a repository with the book cover, the selling price in dollars, 
     * the number of sold units, and the number of accumulated read pages. 
     * On the other hand, Each journal has a unique identifier (3 alphanumeric characters), a name, a number of pages, a publication date, 
     * a category (Variety, Design, and Sience), a URL leading to a repository with the cover of the magazine, the value of the subscription (in dollars), 
     * the frequency of issuance, the number of active subscriptions and accumulated pages read
     */
    public static void BibliographicProductsManagement() {
        int selectedProduct = 0;
        print("What type of bibliographic product do you want to add? 1. Book 2. Journal");
        Validators.validateBibliographicProducts();  // missing validation method 
        print("Please enter the book's name");
        String name = reader.nextLine();
        print("Please enter the number of pages");
        int pageNumber = reader.nextInt();
        print("Please enter the publication date");
        GregorianCalendar publicationDate = new GregorianCalendar();
        print("Please enter the price");
        double price = reader.nextDouble();
        readXController= new ReadXController(name, pageNumber, publicationDate, price, selectedProduct);
    }
    
}
