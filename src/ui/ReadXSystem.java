package ui;
import java.util.Scanner;
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
    
    public static Scanner reader  = new Scanner(System.in);;
    GregorianCalendar date = new GregorianCalendar();
    private static int bookPos=0;
    private static int magazinePos=0;
    private static int basicPos=0;
    private static int premiumPos=0;

    public static ReadXController readXController= new ReadXController();
    public static void print(Object a) {
        System.out.println(a);
    }

    public ReadXSystem() {
        
    }
    public static void main(String[] args) {
        
        menu();
        int option =  Validators.validateIntInput();
        while(option != 8) {
            switch(option) {
                case 1:
                    print("Bibliographic products management selected");
                    BibliographicProductsManagement();
                    break;
                case 2:
                    print("User management selected");
                    UserManagement();
                    break;
                case 3:
                    print("Buy books and journal subscriptions selected");
                    BuyBooksAndJournalSubscriptions();
                    break;
                case 4:
                    print("Library presentation selected");
                    LibraryPresentation();
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
        int selectedProduct;
        print("What type of bibliographic product do you want to add? 1. Book 2. Magazine");
        selectedProduct=Validators.validateBibliographicProducts(); 
        print("Please enter the name");
        String name = reader.next();
        name=name.toUpperCase();
        print("Please enter the number of pages");
        int pageNumber = Validators.validateIntInput();
        print("Please enter the publication year");
        int publicationYear =  Validators.validateIntInput();
        print("Please enter the publication month");
        int publicationMonth =  Validators.validateIntInput();
        print("Please enter the publication day");
        int publicationDay =  Validators.validateIntInput();
        GregorianCalendar publicationDate = new GregorianCalendar(publicationYear, publicationMonth, publicationDay);
        print("Please enter the price");
        double price = Validators.validateDoubleInput();
        if (selectedProduct==1){
            print("Please enter a brief review");
            String briefReview = reader.next();
            print("Please enter the book`s genre: ");
            print("1. Science Fiction 2. Fantasy 3. Historic Novel");
            int genre= Validators.validateGenre();
            readXController.createBook(name, pageNumber, publicationDate, price, briefReview, genre, bookPos);
            bookPos++;
        } else {
            print("Please enter the magazine`s category: ");
            print("1. Variety 2. Design 3. Science");
            int category=Validators.validateCategory();
            print("Please enter the magazine`s frequency of issuance in days: ");
            int frequencyOfIssuance =  Validators.validateIntInput();
            readXController.createMagazine(name, pageNumber, publicationDate, price, frequencyOfIssuance, category, magazinePos);
            magazinePos++;
        }
    }

    public static void UserManagement(){
        print("Please select your plan 1. Basic 2. Premium");
        int plan=Validators.validatePlan();
        print("please enter your name");
        String name = reader.next();
        print("please enter your id");
        String id = readXController.validateUserID();
        // save the registration date as the current date
        GregorianCalendar registrationDate = new GregorianCalendar();
        if(plan==2){
            print("Please enter your credit card number");
            String creditCardNumber = reader.next();
            print("Please enter your credit card CVV" ); 
            String creditCardCVV = reader.next();
            readXController.createPremiumUser(name, id, registrationDate, creditCardNumber, creditCardCVV, premiumPos);
            premiumPos++;
        } else {
            readXController.createBasicUser(name, id, registrationDate, basicPos);
            basicPos++;
        }
    }

    public static void BuyBooksAndJournalSubscriptions(){
        print("Please enter your id");
        String id = reader.next();
        print("If you wish to, you may enter a product's name to get its id by pressing '1', if you already know the id of the product you want to buy, press any other number");
        int option = Validators.validateIntInput();
        if (option==1){
            print("Please enter the product's name");
            String name = reader.next();
            name=name.toUpperCase();
            readXController.getProductID(name);
            print("Please enter the product's id");
            String productId = reader.next();
            readXController.buyProducts(id, productId);
        }
        else{
            print("Please enter the product's id");
            String productId = reader.next();
            readXController.buyProducts(id, productId);
        }

    }
  
    public static void LibraryPresentation(){
        print("Please enter your id");
        String id = reader.next();
        readXController.showLibrary(id);
    }

    
}
