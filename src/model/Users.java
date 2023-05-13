package model;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Abstract class that represents the users
 */
public abstract class Users {
 
    private String name;
    private String id;
    private int boughtBooks=0;
    private int boughtMagazineSubscriptions=0;
    private GregorianCalendar registrationDate;
    ArrayList <BibliographicPtoducts> userBooksList = new ArrayList<BibliographicPtoducts>();
    ArrayList <BibliographicPtoducts> userMagazinesList = new ArrayList<BibliographicPtoducts>();

    /**
     * Constructor method for the Users class (Basic users)
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     */
    public Users (String name, String id, GregorianCalendar registrationDate) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
        
    }

    /**
     * Constructor method for the Users class (Premium users)
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param cardNumber User's credit card number
     * @param securityCode User's credit card security code
     */
    public Users (String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
       
    }

    /**
     * Method that adds a book to the user's book list
     * @param foundUser User that is buying the book
     * @param desiredProduct Book that the user wants to buy
     */
    public void buyBook(BibliographicPtoducts desiredProduct){
        userBooksList.add(desiredProduct);
        boughtBooks++;
    }

    /**
     * Method that adds a magazine to the user's magazine list
     * @param foundUser User that is buying the magazine
     * @param desiredProduct Magazine that the user wants to buy
     */
    public void buyMagazine(BibliographicPtoducts desiredProduct){
        userMagazinesList.add(desiredProduct);
        boughtMagazineSubscriptions++;
    }
    
    /**
     * Method that searches if the user has a book in his book list
     * @param bookId Book's id
     * @return result Boolean value that indicates if the user has the book or not
     */
    public boolean searchIfUserHasBook(String bookId){
        boolean result = false;
        for (int i = 0; i < userBooksList.size(); i++) {
            if (userBooksList.get(i).getId().equals(bookId)){
                result = true;
            }
        }
        return result;
    }

    /**
     * Method that searches if the user has a magazine in his magazine list
     * @param magazineId Magazine's id
     * @return result Boolean value that indicates if the user has the magazine or not
     */
    public boolean searchIfUserHasMagazine(String magazineId){
        boolean result = false;
        for (int i = 0; i < userMagazinesList.size(); i++) {
            if (userMagazinesList.get(i).getId().equals(magazineId)){
                result = true;
            }
        }
        return result;
    }

    /**
     * Method that deletes a book from the user's book list
     * @param bookId Book's id
     */
    public void deleteBookFromUserList(String bookId){
        for (int i = 0; i < userBooksList.size(); i++) {
            if (userBooksList.get(i).getId().equals(bookId)){
                userBooksList.remove(i);
            }
        }
    }

    /**
     * Method that deletes a magazine from the user's magazine list
     * @param magazineId Magazine's id
     */
    public void deleteMagazineFromUserList(String magazineId){
        for (int i = 0; i < userMagazinesList.size(); i++) {
            if (userMagazinesList.get(i).getId().equals(magazineId)){
                userMagazinesList.remove(i);
            }
        }
    }


    /**
     * Method that sets the highest page number that the user has read of a book
     * @param book Book that the user is reading
     * @param highestPageNumber Highest page number that the user has read
     */
    public void setUserHighestBookPageNumber(BibliographicPtoducts book, int highestPageNumber){
        for (int i = 0; i < userBooksList.size(); i++) {
            if (userBooksList.get(i).getId().equals(book.getId())){
                userBooksList.get(i).setHighestPageNumber(highestPageNumber);
            }
        }
    }

    /**
     * Method that returns the highest page number that the user has read of a book
     * @param book Book that the user is reading
     * @return result Highest page number that the user has read
     */
    public int getUserHighestBookPageNumber(BibliographicPtoducts book){
        int result = 0;
        for (int i = 0; i < userBooksList.size(); i++) {
            if (userBooksList.get(i).getId().equals(book.getId())){
                result = userBooksList.get(i).getHighestPageNumber();
            }
        }
        return result;
    }

    /**
     * Method that sets the highest page number that the user has read of a magazine
     * @param magazine Magazine that the user is reading
     * @param highestPageNumber Highest page number that the user has read
     */
    public void setUserHighestMagazinePageNumber(BibliographicPtoducts magazine, int highestPageNumber){
        for (int i = 0; i < userMagazinesList.size(); i++) {
            if (userMagazinesList.get(i).getId().equals(magazine.getId())){
                userMagazinesList.get(i).setHighestPageNumber(highestPageNumber);
            }
        }
    }

    /**
     * Method that returns the highest page number that the user has read of a magazine
     * @param magazine Magazine that the user is reading
     * @return result Highest page number that the user has read
     */
    public int getUserHighestMagazinePageNumber(BibliographicPtoducts magazine){
        int result = 0;
        for (int i = 0; i < userMagazinesList.size(); i++) {
            if (userMagazinesList.get(i).getId().equals(magazine.getId())){
                result = userMagazinesList.get(i).getHighestPageNumber();
            }
        }
        return result;
    }

    /**
     * Method that returns the number of books that the user has bought
     * @return boughtBooks Number of books that the user has bought
     */
    public int getBoughtBooks() {
        return boughtBooks;
    }

    /**
     * Method that returns the number of magazines that the user has bought
     * @return boughtMagazineSubscriptions Number of magazines that the user has bought
     */
    public int getBoughtMagazineSubscriptions() {
        return boughtMagazineSubscriptions;
    }

    /**
     * Method that sets the number of books that the user has bought
     * @param boughtBooks Number of books that the user has bought
     */
    public void setBoughtBooks(int boughtBooks) {
        this.boughtBooks = boughtBooks;
    }

    /**
     * Method that sets the number of magazines that the user has bought
     * @param boughtMagazineSubscriptions Number of magazines that the user has bought
     */
    public void setBoughtMagazineSubscriptions(int boughtMagazineSubscriptions) {
        this.boughtMagazineSubscriptions = boughtMagazineSubscriptions;
    }

    /**
     * Method that returns the user's name
     * @return name User's name
     */
    public String getName() {
        return name;
    }

    /**
     * Method that returns the user's id
     * @return id User's id
     */
    public String getId() {
        return id;
    }

    /**
     * Method that returns the user's registration date
     * @return registrationDate User's registration date
     */
    public GregorianCalendar getRegistrationDate() {
        return registrationDate;
    }


    /**
     * Method that sets the user's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method that sets the user's id
     * @param id
     */
    public void setId(String id) {
        this.id= id;
    }

    /**
     * Method that sets the user's registration date
     * @param registrationDate
     */
    public void setRegistrationDate(GregorianCalendar registrationDate) {
        this.registrationDate = registrationDate;
    }

}
