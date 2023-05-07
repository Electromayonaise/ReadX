package model;
import java.util.GregorianCalendar;
import utils.Validators;

public class ReadXController {
    

    Book[] books = new Book[100];
    Magazine[] magazines = new Magazine[100];
    Users[] users= new Users[100];
    public final int MAX_PRODUCTS = 100;
    public ReadXController(){}

    public void createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre, int bookPos) {
        books[bookPos] = new Book(name, pageNumber, publicationDate, price, briefReview, genre);
    }

    public void createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category, int magazinePos){
        magazines[magazinePos] = new Magazine(name, pageNumber, publicationDate, price, frequencyOfIssuance, category);
    }

    public void createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode, int premiumPos){
        System.out.println("Premium user created succesfully, with the name of:"+ name + " and the ID of: " + id +"(payment information private)" );
        users[premiumPos] = new PremiumUser(name, id, registrationDate, cardNumber, securityCode);
    }

    public void createBasicUser(String name, String id, GregorianCalendar registrationDate, int basicPos){
        System.out.println("Basic user created successfully, with the name of: " + name + " and the ID of: " + id);
        users[basicPos] = new BasicUser(name, id, registrationDate);
    }

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

    // Method to check if the user id allready exists in the system
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
