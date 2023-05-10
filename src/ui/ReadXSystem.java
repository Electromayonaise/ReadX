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

    public static ReadXController readXController= new ReadXController();
    /*
     * Method that prints an object, to avoid writing System.out.println() every time
     * @param a Object to be printed
     */
    public static void print(Object a) {
        System.out.println(a);
    }

    public ReadXSystem() {
        
    }

    /*
     * Main method that runs the program by calling the menu method and the other methods according to the user's input
     */
    public static void main(String[] args) {
        
        menu();
        int option =  Validators.validateIntInput();
        while(option != 8) {
            switch(option) {
                case 1:
                    print("Bibliographic products management selected");
                    bibliographicProductsManagement();
                    break;
                case 2:
                    print("User management selected");
                    userManagement();
                    break;
                case 3:
                    print("Buy books and journal subscriptions selected");
                    buyBooksAndJournalSubscriptions();
                    break;
                case 4:
                    print("Library presentation selected");
                    libraryPresentation();
                    break;
                case 5:
                    print("Reading session simulation selected");
                    readingSimulation();
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

    /*
     * Method that prints the menu
     */
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
     * Gives the user the option to add, delete or update a bibliographic product
     */
    public static void bibliographicProductsManagement() {
        int desiredOption;
        print("Please enter what do you wish to manage");
        print("1. Add a bibliographic product 2. Delete a bibliographic product 3. Update a bibliographic product ");
        desiredOption=Validators.validateOptionInput();
        switch(desiredOption){
            case 1:
                addBibliographicProduct();
                break;
            case 2:
                deleteBibliographicProduct();
                break;
            case 3:
                updateBibliographicProduct();
                break;
        } 

    }

    /*
     * Method that adds a bibliographic product
     * For now, the two bibliographic products are books and journals. 
     * On one hand, each book has a unique 3 hexadecimal digit identifier, a name, number of pages,  a brief review, a publication date, 
     * a genre ( Science Fiction, Fantasy, and Historic Novel), a url that leads to a repository with the book cover, the selling price in dollars, 
     * the number of sold units, and the number of accumulated read pages. 
     * On the other hand, Each journal has a unique identifier (3 alphanumeric characters), a name, a number of pages, a publication date, 
     * a category (Variety, Design, and Sience), a URL leading to a repository with the cover of the magazine, the value of the subscription (in dollars), 
     * the frequency of issuance, the number of active subscriptions and accumulated pages read
     */
    public static void addBibliographicProduct(){
        print("What type of bibliographic product do you want to add? 1. Book 2. Magazine");
            int selectedProduct;
            selectedProduct=Validators.validateBibliographicProducts(); 
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
            print("Please enter the product's url");
            String url = Validators.validateUrlInput();
            if (selectedProduct==1){
                print("Please enter the book`s name");
                String name = reader.next();
                name=name.toUpperCase();
                print("Please enter a brief review");
                String briefReview = reader.next();
                print("Please enter the book`s genre: ");
                print("1. Science Fiction 2. Fantasy 3. Historic Novel");
                int genre= Validators.validateGenre();
                String addBook = readXController.createBook(name, pageNumber, publicationDate, price, url, briefReview, genre);
                print("the list of created books is (by id): " + addBook);
            } else {
                print("Please enter the magazine`s name");
                String name = reader.next();
                name=name.toUpperCase();
                print("Please enter the magazine`s category: ");
                print("1. Variety 2. Design 3. Science");
                int category=Validators.validateCategory();
                print("Please enter the magazine`s frequency of issuance in days: ");
                int frequencyOfIssuance =  Validators.validateIntInput();
                String addMagazine= readXController.createMagazine(name, pageNumber, publicationDate, price, url, frequencyOfIssuance, category);
                print("the list of created magazines is (by id): " + addMagazine);
            }
    }


    /*
     * Method that deletes a bibliographic product by it´s id
     */
    public static void deleteBibliographicProduct(){
        print("What type of bibliographic product do you want to delete? 1. Book 2. Magazine");
        int selectedProduct;
        selectedProduct=Validators.validateBibliographicProducts(); 
        print("If you wish to search the id of the product you want to delete, please enter 1. If you already know the id, please enter any other number");
        int desiredOption=Validators.validateOneOrTwo();
        boolean productExistance= true;
        if (desiredOption==1){
            print("Please enter the product's name");
            String name = reader.next();
            name=name.toUpperCase();
            String bookSearch = readXController.getBookIdByName(name);
            String magazineSearch= readXController.getMagazineIdByName(name);
            if (bookSearch.equals("Book not found") && magazineSearch.equals("Magazine not found")){
                print("Product not found");
                productExistance = false;
            } 
            else if (bookSearch.equals("Book not found")){
                print(magazineSearch);
            } else {
                print(bookSearch);
            }

        }
        if (productExistance == true){
            print("Please enter the id");
            String id = reader.next();
            if (selectedProduct==1){
                readXController.deleteBook(id);
            } else {
                readXController.deleteMagazine(id);
        
            }
        }
    }

    /*
     * Method that updates a bibliographic product, acording to the user's choice
     */
    public static void updateBibliographicProduct(){

        print("What type of bibliographic product do you want to update? 1. Book 2. Magazine");
        int selectedProduct;
        selectedProduct=Validators.validateBibliographicProducts(); 
        print("If you wish to search the id of the product you want to update, please enter 1. If you already know the id, please enter any other number");
        int desiredOption=Validators.validateOneOrTwo();
        boolean productExistance= true;
        if (desiredOption==1){
            print("Please enter the product's name");
            String name = reader.next();
            name=name.toUpperCase();
            String searchBookId= readXController.getBookIdByName(name);
            String searchMagazineId= readXController.getMagazineIdByName(name);
            if (searchBookId.equals("Book not found")&& searchMagazineId.equals("Magazine not found")){
                print("The product was not found");
                productExistance = false;
            } else if (searchBookId.equals("Book not found") && !searchMagazineId.equals("Magazine not found")){
                print(searchMagazineId);
            } else {
                print(searchBookId);
            }
        }
        if (productExistance == true){
            print("Please enter the id");
            String id = reader.next();
            if (selectedProduct==1){
                print("Please enter what data do you want to update");
                print("1. Name 2. Number of pages 3. Publication date 4. Price 5. Brief review 6. Genre");
                int selectedData= Validators.validateUpdateInput();
                switch(selectedData){
                    case 1:
                        print("Please enter the new name");
                        String newName = reader.next();
                        newName=newName.toUpperCase();
                        String updateBookName = readXController.updateBookName(id, newName);
                        print(updateBookName);
                        break;
                    case 2:
                        print("Please enter the new number of pages");
                        int newPageNumber = Validators.validateIntInput();
                        String updateBookPages= readXController.updateBookPageNumber(id, newPageNumber);
                        print(updateBookPages);
                        break;
                    case 3:
                        print("Please enter the new publication year");
                        int newPublicationYear =  Validators.validateIntInput();
                        print("Please enter the new publication month");
                        int newPublicationMonth =  Validators.validateIntInput();
                        print("Please enter the new publication day");
                        int newPublicationDay =  Validators.validateIntInput();
                        GregorianCalendar newPublicationDate = new GregorianCalendar(newPublicationYear, newPublicationMonth, newPublicationDay);
                        String updateBookDate=readXController.updateBookPublicationDate(id, newPublicationDate);
                        print(updateBookDate);
                        break;
                    case 4:
                        print("Please enter the new price");
                        double newPrice = Validators.validateDoubleInput();
                        String updateBookPrice=readXController.updateBookPrice(id, newPrice);
                        print(updateBookPrice);
                        break;
                    case 5:
                        print("Please enter the new brief review");
                        String newBriefReview = reader.next();
                        String updateBriefReview=readXController.updateBookBriefReview(id, newBriefReview);
                        print(updateBriefReview);
                        break;
                    case 6:
                        print("Please enter the new genre");
                        print("1. Science Fiction 2. Fantasy 3. Historic Novel");
                        int newGenre= Validators.validateGenre();
                        String updateBookGenre=readXController.updateBookGenre(id, newGenre);
                        print(updateBookGenre);
                        break;
                }
            } else {
                print("Please enter what data do you want to update");
                print("1. Name 2. Number of pages 3. Publication date 4. Price 5. Frequency of issuance 6. Category");
                int selectedData= Validators.validateUpdateInput();
                switch(selectedData){
                    case 1:
                        print("Please enter the new name");
                        String newName = reader.next();
                        newName=newName.toUpperCase();
                        String updateMagazineName=readXController.updateMagazineName(id, newName);
                        print(updateMagazineName);
                        break;
                    case 2:
                        print("Please enter the new number of pages");
                        int newPageNumber = Validators.validateIntInput();
                        String updateMagazinePages=readXController.updateMagazinePageNumber(id, newPageNumber);
                        print(updateMagazinePages);
                        break;
                    case 3:
                        print("Please enter the new publication year");
                        int newPublicationYear =  Validators.validateIntInput();
                        print("Please enter the new publication month");
                        int newPublicationMonth =  Validators.validateIntInput();
                        print("Please enter the new publication day");
                        int newPublicationDay =  Validators.validateIntInput();
                        GregorianCalendar newPublicationDate = new GregorianCalendar(newPublicationYear, newPublicationMonth, newPublicationDay);
                        String updateMagazineDate = readXController.updateMagazinePublicationDate(id, newPublicationDate);
                        print(updateMagazineDate);
                        break;
                    case 4:
                        print("Please enter the new price");
                        double newPrice = Validators.validateDoubleInput();
                        String updateMagazinePrice=readXController.updateMagazinePrice(id, newPrice);
                        print(updateMagazinePrice);
                        break;
                    case 5:
                        print("Please enter the new frequency of issuance");
                        int newFrequencyOfIssuance = Validators.validateIntInput();
                        String updateFrecuencyOfIssuance= readXController.updateMagazineFrequencyOfIssuance(id, newFrequencyOfIssuance);
                        print(updateFrecuencyOfIssuance);
                    case 6:
                        print("Please enter the new category");
                        print("1. Variety 2. Design 3. Science");
                        int newCategory=Validators.validateCategory();
                        String updateMagazineCategory=readXController.updateMagazineCategory(id, newCategory);
                        print(updateMagazineCategory);
                        break;
                }
            }
        }
    }

    /*
     * User management:
     * There are two types of users: basic and premium.
     * On one hand, basic users have a name, an id, and a registration date. 
     * On the other hand, premium users have a name, an id, a registration date, a credit card number, and a security code.
     * In terms of the ads, a interface called advertisable is created, which has a method called showAds, applicable to basic users.
     */
    public static void userManagement(){
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
            String premiumUserAdd = readXController.createPremiumUser(name, id, registrationDate, creditCardNumber, creditCardCVV);
            print (premiumUserAdd);
        } else {
            String basicUserAdd = readXController.createBasicUser(name, id, registrationDate);
            print (basicUserAdd);
        }
    }

    /*
     * Buy books and journal subscriptions:
     * The user must enter his id, and then he can either enter the name of the product he wants to buy, or the id of the product he wants to buy.
     * If the user enters the name of the product, the system will show the id of the product, and then the user must enter the id of the product he wants to buy.
     */
    public static void buyBooksAndJournalSubscriptions(){
        print("Please enter your id");
        String id = reader.next();
        print("If you wish to, you may enter a product's name to get its id by pressing '1', if you already know the id of the product you want to buy, press any other number");
        int option = Validators.validateIntInput();
        String boughtProduct;
        boolean productExistance= true;
        if (option==1){
            print("Please enter the product's name");
            String name = reader.next();
            name=name.toUpperCase();
            String searchBookId= readXController.getBookIdByName(name);
            String searchMagazineId= readXController.getMagazineIdByName(name);
            if (searchBookId.equals("Book not found")&& searchMagazineId.equals("Magazine not found")){
                print("The product was not found");
                productExistance = false;
            } else if (searchBookId.equals("Book not found") && !searchMagazineId.equals("Magazine not found")){
                print(searchMagazineId);
            } else {
                print(searchBookId);
            }
        }
        if (productExistance == true){
            print("Please enter the product's id");
            String productId = reader.next();
            boughtProduct= readXController.buyProducts(id, productId);
            print(boughtProduct);
        }
    }
    
    /*
     * Library presentation:
     * The user must enter his id, and then the system will show the user's library.
     */
    public static void libraryPresentation(){
        print("Please enter your id");
        String id = reader.next();
        readXController.showLibrary(id);
    }

    public static void readingSimulation(){
        print("Please enter your id");
        String id = reader.next();
        readXController.showLibrary(id);
        print("Please enter the id of or position in the shown matrix of the product you want to read");
        String productId = reader.next();
        readXController.readProduct(productId);
    }

    
}
