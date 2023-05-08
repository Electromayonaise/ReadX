package model;
import java.util.GregorianCalendar;
import utils.Validators;

public class ReadXController {
    

    Book[] books = new Book[100];
    Magazine[] magazines = new Magazine[100];
    Users[] users= new Users[100];
    public final int MAX_PRODUCTS = 100;

    /*
     * Constructor method for the ReadXController class, empty because it is not needed
     */
    public ReadXController(){}

    /*
     * Method that creates a book object and stores it in the books array
     * @param name Book's name
     * @param pageNumber Book's number of pages
     * @param publicationDate Book's publication date
     * @param price Book's price
     * @param briefReview Book's brief review
     * @param genre Book's genre (flag value)
     * @param bookPos Book's position in the books array
     */
    public void createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre, int bookPos) {
        books[bookPos] = new Book(name, pageNumber, publicationDate, price, briefReview, genre);
    }

    /*
     * Method that creates a magazine object and stores it in the magazines array
     * @param name Magazine's name
     * @param pageNumber Magazine's number of pages
     * @param publicationDate Magazine's publication date
     * @param price Magazine's price
     * @param frequencyOfIssuance Magazine's frequency of issuance
     * @param category Magazine's category (flag value)
     * @param magazinePos Magazine's position in the magazines array
     */
    public void createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category, int magazinePos){
        magazines[magazinePos] = new Magazine(name, pageNumber, publicationDate, price, frequencyOfIssuance, category);
    }

    /*
     * Method that deletes a book object from the books array
     * @param id Book's id
     */
    public void deleteBook(String id){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId().equals(id)) {
                books[i] = null;
                System.out.println("Book deleted successfully");
            }
        }
    }

    /*
     * Method that deletes a magazine object from the magazines array
     * @param id Magazine's id
     */
    public void deleteMagazine(String id){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i] != null && magazines[i].getId().equals(id)) {
                magazines[i] = null;
                System.out.println("Magazine deleted successfully");
            }
        }
    }

    /*
     * Method that updates a book object's name
     * @param id Book's id
     * @param newName Book's new name
     */
    public void updateBookName(String id, String newName){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId().equals(id)) {
                books[i].setName(newName);
                System.out.println("Book name updated successfully");
            }
        }
    }

    /*
     * Method that updates a book object's number of pages
     * @param id Book's id
     * @param newPageNumber Book's new number of pages
     */
    public void updateBookPageNumber(String id, int newPageNumber){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId().equals(id)) {
                books[i].setPageNumber(newPageNumber);
                System.out.println("Book page number updated successfully");
            }
        }
    }

    /*
     * Method that updates a book object's publication date
     * @param id Book's id
     * @param newPublicationDate Book's new publication date
     */
    public void updateBookPublicationDate(String id, GregorianCalendar newPublicationDate){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId().equals(id)) {
                books[i].setPublicationDate(newPublicationDate);
                System.out.println("Book publication date updated successfully");
            }
        }
    }

    /*
     * Method that updates a book object's price
     * @param id Book's id
     * @param newPrice Book's new price
     */
    public void updateBookPrice(String id, double newPrice){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId().equals(id)) {
                books[i].setPrice(newPrice);
                System.out.println("Book price updated successfully");
            }
        }
    }

    /*
     * Method that updates a book object's brief review
     * @param id Book's id
     * @param newBriefReview Book's new brief review
     */
    public void updateBookBriefReview(String id, String newBriefReview){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId().equals(id)) {
                books[i].setBriefReview(newBriefReview);
                System.out.println("Book brief review updated successfully");
            }
        }
    }

    /*
     * Method that updates a book object's genre
     * @param id Book's id
     * @param newGenre Book's new genre (flag value)
     */
    public void updateBookGenre(String id, int newGenre){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getId().equals(id)) {
                books[i].setGenreByFlag(newGenre);
                System.out.println("Book genre updated successfully");
            }
        }
    }

    /*
     * Method that updates a magazine object's name
     * @param id Magazine's id
     * @param newName Magazine's new name
     */
    public void updateMagazineName(String id, String newName){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i] != null && magazines[i].getId().equals(id)) {
                magazines[i].setName(newName);
                System.out.println("Magazine name updated successfully");
            }
        }
    }

    /*
     * Method that updates a magazine object's number of pages
     * @param id Magazine's id
     * @param newPageNumber Magazine's new number of pages
     */
    public void updateMagazinePageNumber(String id, int newPageNumber){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i] != null && magazines[i].getId().equals(id)) {
                magazines[i].setPageNumber(newPageNumber);
                System.out.println("Magazine page number updated successfully");
            }
        }
    }

    /*
     * Method that updates a magazine object's publication date
     * @param id Magazine's id
     * @param newPublicationDate Magazine's new publication date
     */
    public void updateMagazinePublicationDate(String id, GregorianCalendar newPublicationDate){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i] != null && magazines[i].getId().equals(id)) {
                magazines[i].setPublicationDate(newPublicationDate);
                System.out.println("Magazine publication date updated successfully");
            }
        }
    }

    /*
     * Method that updates a magazine object's price
     * @param id Magazine's id
     * @param newPrice Magazine's new price
     */
    public void updateMagazinePrice(String id, double newPrice){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i] != null && magazines[i].getId().equals(id)) {
                magazines[i].setPrice(newPrice);
                System.out.println("Magazine price updated successfully");
            }
        }
    }

    /*
     * Method that updates a magazine object's frequency of issuance
     * @param id Magazine's id
     * @param newFrequencyOfIssuance Magazine's new frequency of issuance
     */
    public void updateMagazineFrequencyOfIssuance(String id, int newFrequencyOfIssuance){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i] != null && magazines[i].getId().equals(id)) {
                magazines[i].setFrequencyOfIssuance(newFrequencyOfIssuance);
                System.out.println("Magazine frequency of issuance updated successfully");
            }
        }
    }

    /*
     * Method that updates a magazine object's category
     * @param id Magazine's id
     * @param newCategory Magazine's new category (flag value)
     */
    public void updateMagazineCategory(String id, int newCategory){
        for (int i = 0; i < magazines.length; i++) {
            if (magazines[i] != null && magazines[i].getId().equals(id)) {
                magazines[i].setCategoryByFlag(newCategory);
                System.out.println("Magazine category updated successfully");
            }
        }
    }

    /*
     * Method that creates a premium user object and stores it in the users array
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param cardNumber User's credit card number
     * @param securityCode User's credit card security code
     * @param premiumPos User's position in the users array
     */
    public void createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode, int premiumPos){
        System.out.println("Premium user created succesfully, with the name of:"+ name + " and the ID of: " + id +"(payment information private)" );
        users[premiumPos] = new PremiumUser(name, id, registrationDate, cardNumber, securityCode);
    }

    /*
     * Method that creates a basic user object and stores it in the users array
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param basicPos User's position in the users array
     */
    public void createBasicUser(String name, String id, GregorianCalendar registrationDate, int basicPos){
        System.out.println("Basic user created successfully, with the name of: " + name + " and the ID of: " + id);
        users[basicPos] = new BasicUser(name, id, registrationDate);
    }

    /*
     * Method that searches for a product inputed by the user in the books and magazines arrays and sends 
     * it to the method buyBook/buyMagazine
     * @param id User's id
     * @param productID Product's id
     */
    public void buyProducts(String id, String productID){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId().equals(id)) {
                for (int j = 0; j < MAX_PRODUCTS; j++) {
                    if (books[j] != null && books[j].getId().equals(productID)) {
                        int pos = 0;
                        users[i].buyBook(users[i].getId(), books[j],pos);
                        pos++;
                    }
                    else if (magazines[j] != null && magazines[j].getId().equals(productID)) {
                        int pos = 0;
                        users[i].buyMagazine(users[i].getId(), magazines[j],pos);
                        pos++;
                    }
                }
            }
        }
    }

    // The user's library must be represented trough 5x5 matrix that present the id's of the products from oldest to newest (publication date),when the martix is full, the user may go to the next page of the library and so on.=
    public void showLibrary(String id){
        for (int i=0; i<users.length; i++){
            if (users[i] != null && users[i].getId().equals(id)){
                String [][]matrix = new String[5][5];
                for(int j=0, k=0; j<matrix.length ;j++){
                    for(int m=0; m<matrix.length ;m++){
                        if(users[i].books[k] != null){
                            matrix[j][m] = users[i].books[k].getId();
                            k++;
                        }
                        else if(users[i].magazines[k] != null){
                            matrix[j][m] = users[i].magazines[k].getId();
                            k++;
                        }
                    }     
                }
                for(int j = 0; j < matrix.length; j++)
                {
                    for(int m = 0; m < matrix.length; m++)
                        System.out.print("\t" + matrix[j][m]);
                    System.out.println();
                }
            }  
            /*if (users[i] != null && users[i].getId().equals(id)){
                int pos = 0;
                for (int j=0; j<5; j++){
                    String library[][] = new String[5][5];
                    for (int k=0; k<5; k++){
                        if (users[i].books[pos] != null){
                            library [k][j] = users[i].books[pos].getId();
                            System.out.println("\t" + library[j][j]);
                            pos++;
                        }
                        if (users[i].magazines[pos] != null){
                            library [k][j] = users[i].magazines[pos].getId();
                            System.out.println("\t" + library[k][j]);
                            pos++;
                        }
                    }
                    System.out.println("");
                }
            }*/
        }
    }

    public void readProduct(String productID){
        
    }
    /*
     *  Method to check if the user id allready exists in the system
     * @return id User's id
     */
    public String validateUserID(){
        String id = Validators.reader.next();
        for (int i = 0; i < users.length; i++) {
            while (users[i] != null && users[i].getId().equals(id)) {
                System.out.println("This ID is already registered, please enter a new one");
                id = Validators.reader.next();
            }
        }
        return id;
    }

    /*
     * Method that searchhes for a product by its name and prints its id
     * @param name Product's name
     */
    public void getProductID(String name){
        for (int i = 0; i < MAX_PRODUCTS ; i++) {
            if (books[i] != null && books[i].getName().equals(name)) {
                System.out.println("The product's ID is: " + books[i].getId());
            }
            else if (magazines[i] != null && magazines[i].getName().equals(name)) {
                System.out.println("The product's ID is: " + magazines[i].getId());
            }
        }
    }
}
