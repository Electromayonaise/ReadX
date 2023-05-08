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
            if (users[i].getId().equals(id)){
                int pos = 0;
                for (int j=0; j<5; j++){
                    if (users[i].books[pos] != null){
                        System.out.println(users[i].books[pos].getId() + " ");
                        pos++;
                    }
                    if (users[i].magazines[pos] != null){
                        System.out.println(users[i].magazines[pos].getId() + " ");
                        pos++;
                    }
                }
            }
        }
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
