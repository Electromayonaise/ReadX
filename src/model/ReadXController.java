package model;
import java.util.GregorianCalendar;
import utils.Validators;

public class ReadXController {
    
    BibliographicPtoducts[] bibliographicPtoducts = new BibliographicPtoducts[100];
    Users[] users= new Users[100];
    public ReadXController(){}

    public void createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre, int bookPos) {
        bibliographicPtoducts[bookPos] = new Book(name, pageNumber, publicationDate, price, briefReview, genre);
    }

    public void createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category, int magazinePos){
        bibliographicPtoducts[magazinePos] = new Magazine(name, pageNumber, publicationDate, price, frequencyOfIssuance, category);
    }

    public void createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode, int premiumPos){
        users[premiumPos] = new PremiumUser(name, id, registrationDate, cardNumber, securityCode);
    }

    public void createBasicUser(String name, String id, GregorianCalendar registrationDate, int basicPos){
        users[basicPos] = new BasicUser(name, id, registrationDate);
    }

    public void buyProducts(String id, String productID){
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId().equals(id)) {
                for (int j = 0; j < bibliographicPtoducts.length; j++) {
                    if (bibliographicPtoducts[j] != null && bibliographicPtoducts[j].getName().equals(productID)) {
                        int pos = 0;
                        users[i].buyProduct(users[i].getId(), bibliographicPtoducts[j],pos);
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
                    for (int k=0; k<5; k++){
                        System.out.println(users[i].bibliographicPtoducts[pos].getId());
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
        for (int i = 0; i < bibliographicPtoducts.length; i++) {
            while (bibliographicPtoducts[i] != null && bibliographicPtoducts[i].getName().equals(name)) {
                System.out.println("The product's ID is: " + bibliographicPtoducts[i].getId());
            }
        }
    }
}
