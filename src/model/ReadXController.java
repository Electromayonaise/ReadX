package model;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import utils.Validators;

/**
 * Class that represents the controller of the ReadX system
 */
public class ReadXController {
    
    ArrayList <BibliographicPtoducts> booksList = new ArrayList<BibliographicPtoducts>();
    ArrayList <BibliographicPtoducts> magazinesList = new ArrayList<BibliographicPtoducts>();
    ArrayList<Users> usersList = new ArrayList<Users>();

    /**
     * Constructor method for the ReadXController class, empty because it is not needed
     */
    public ReadXController(){
    }

    /**
     * Method that creates a book object and stores it in the books array
     * @param name Book's name
     * @param pageNumber Book's number of pages
     * @param publicationDate Book's publication date
     * @param price Book's price
     * @param briefReview Book's brief review
     * @param genre Book's genre (flag value)
     * @param bookPos Book's position in the books array
     * @return booksCreated String that shows the books created
     */
    public String createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String url, String briefReview, int genre) {
        booksList.add(new Book(name, pageNumber, publicationDate, price, url, briefReview, genre));
        StringBuilder booksCreated = new StringBuilder();
        for (int i = 0; i < booksList.size(); i++){
           booksCreated.append("\n"+ booksList.get(i).getName() + " " + booksList.get(i).getId());
        }
        return booksCreated.toString();
    }

    /**
     * Method that creates a magazine object and stores it in the magazines array
     * @param name Magazine's name
     * @param pageNumber Magazine's number of pages
     * @param publicationDate Magazine's publication date
     * @param price Magazine's price
     * @param frequencyOfIssuance Magazine's frequency of issuance
     * @param category Magazine's category (flag value)
     * @param magazinePos Magazine's position in the magazines array
     * @return magazinesCreated String that shows the magazines created
     */
    public String createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, String url,  int frequencyOfIssuance, int category){
        magazinesList.add(new Magazine(name, pageNumber, publicationDate, price, url, frequencyOfIssuance, category));
        StringBuilder magazinesCreated = new StringBuilder();
        for (int i = 0; i < magazinesList.size(); i++){
            magazinesCreated.append("\n" + magazinesList.get(i).getName() +" "+ magazinesList.get(i).getId());
        } 
        return magazinesCreated.toString();
    }

    /**
     * Method that deletes a book object from the books array
     * @param id Book's id
     * @return msj Message that shows if the book was deleted successfully or an error message if the book doesn't exist
     */
    public String deleteBook(String id){
        String msj = "Book not found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId().equals(id)) {
                booksList.remove(i);
                msj = "Book deleted successfully from the system";
            }
        }
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).searchIfUserHasBook(id) == true) {
                usersList.get(i).deleteBookFromUserList(id);
                msj = "Book deleted successfully from the system and user's library";
            }
        }
        return msj;
    }

    /**
     * Method that deletes a magazine object from the magazines array
     * @param id Magazine's id
     * @return msj Message that shows if the magazine was deleted successfully or an error message if the magazine doesn't exist
     */
    public String deleteMagazine(String id){
        String msj = "Magazine not found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                magazinesList.remove(i);
                msj="Magazine deleted successfully";
            }
        }
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).searchIfUserHasMagazine(id) == true) {
                usersList.get(i).deleteMagazineFromUserList(id);
                msj = "Magazine deleted successfully from the system and user's library";
            }
        }
        return msj;
    }

    /**
     * Method that updates a book object's name
     * @param id Book's id
     * @param newName Book's new name
     * @return msj Message that shows if the book name was updated successfully or an error message if the book doesn't exist
     */
    public String updateBookName(String id, String newName){
        String msj = "Book not found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId().equals(id)) {
                booksList.get(i).setName(newName);
                msj="Book name updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a book object's number of pages
     * @param id Book's id
     * @param newPageNumber Book's new number of pages
     * @return msj Message that shows if the book number of pages was updated successfully or an error message if the book doesn't exist
     */
    public String updateBookPageNumber(String id, int newPageNumber){
        String msj = "Book not found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setPageNumber(newPageNumber);
                msj="Book page number updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a book object's publication date
     * @param id Book's id
     * @param newPublicationDate Book's new publication date
     * @return msj Message that shows if the book publication date was updated successfully or an error message if the book doesn't exist
     */
    public String updateBookPublicationDate(String id, GregorianCalendar newPublicationDate){
        String msj = "Book not found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setPublicationDate(newPublicationDate);
                msj="Book publication date updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a book object's price
     * @param id Book's id
     * @param newPrice Book's new price
     * @return msj Message that shows if the book price was updated successfully or an error message if the book doesn't exist
     */
    public String updateBookPrice(String id, double newPrice){
        String msj = "Book not found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setPrice(newPrice);
                msj="Book price updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a book object's brief review
     * @param id Book's id
     * @param newBriefReview Book's new brief review
     * @return msj Message that shows if the book brief review was updated successfully or an error message if the book doesn't exist
     */
    public String updateBookBriefReview(String id, String newBriefReview){
        String msj = "Book not found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setBriefReview(newBriefReview);
                msj="Book brief review updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a book object's genre
     * @param id Book's id
     * @param newGenre Book's new genre (flag value)
     * @return msj Message that shows if the book genre was updated successfully or an error message if the book doesn't exist
     */
    public String updateBookGenre(String id, int newGenre){
        String msj = "Book not found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId().equals(id)) {
                booksList.get(i).setGenreOrCategoryByFlag(newGenre);
                msj="Book genre updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a magazine object's name
     * @param id Magazine's id
     * @param newName Magazine's new name
     * @return msj Message that shows if the magazine name was updated successfully or an error message if the magazine doesn't exist
     */
    public String updateMagazineName(String id, String newName){
        String msj = "Magazine not found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setName(newName);
                msj="Magazine name updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a magazine object's number of pages
     * @param id Magazine's id
     * @param newPageNumber Magazine's new number of pages
     * @return msj Message that shows if the magazine number of pages was updated successfully or an error message if the magazine doesn't exist
     */
    public String updateMagazinePageNumber(String id, int newPageNumber){
        String msj = "Magazine not found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setPageNumber(newPageNumber);
                msj="Magazine page number updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a magazine object's publication date
     * @param id Magazine's id
     * @param newPublicationDate Magazine's new publication date\
     * @return msj Message that shows if the magazine publication date was updated successfully or an error message if the magazine doesn't exist
     */
    public String updateMagazinePublicationDate(String id, GregorianCalendar newPublicationDate){
        String msj = "Magazine not found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setPublicationDate(newPublicationDate);
                msj="Magazine publication date updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a magazine object's price
     * @param id Magazine's id
     * @param newPrice Magazine's new price
     * @return msj Message that shows if the magazine price was updated successfully or an error message if the magazine doesn't exist
     */
    public String updateMagazinePrice(String id, double newPrice){
        String msj = "Magazine not found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setPrice(newPrice);
                msj="Magazine price updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a magazine object's frequency of issuance
     * @param id Magazine's id
     * @param newFrequencyOfIssuance Magazine's new frequency of issuance
     * @return msj Message that shows if the magazine frequency of issuance was updated successfully or an error message if the magazine doesn't exist
     */
    public String updateMagazineFrequencyOfIssuance(String id, int newFrequencyOfIssuance){
        String msj = "Magazine not found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setFrequencyOfIssuance(newFrequencyOfIssuance);
                msj="Magazine frequency of issuance updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that updates a magazine object's category
     * @param id Magazine's id
     * @param newCategory Magazine's new category (flag value)
     * @return msj Message that shows if the magazine category was updated successfully or an error message if the magazine doesn't exist
     */
    public String updateMagazineCategory(String id, int newCategory){
        String msj = "Magazine not found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setGenreOrCategoryByFlag(newCategory);
                msj="Magazine category updated successfully";
            }
        }
        return msj;
    }

    /**
     * Method that creates a premium user object and stores it in the users array
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param cardNumber User's credit card number
     * @param securityCode User's credit card security code
     * @return msj Message that shows if the user was created successfully
     */
    public String createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode){
        String msj = ("Premium user created succesfully, with the name of:"+ name + " and the ID of: " + id +"(payment information private)" );
        usersList.add(new PremiumUser(name, id, registrationDate, cardNumber, securityCode));
        return msj;
    }

    /**
     * Method that creates a basic user object and stores it in the users array
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @return msj Message that shows if the user was created successfully
     */
    public String createBasicUser(String name, String id, GregorianCalendar registrationDate){
        String msj=("Basic user created successfully, with the name of: " + name + " and the ID of: " + id);
        usersList.add(new BasicUser(name, id, registrationDate));
        return msj;
    }

    /**
     * Method that searches for a product inputed by the user in the books and magazines arrays and sends 
     * it to the method buyBook/buyMagazine
     * @param id User's id|
     * @param productID Product's id
     * @return msj Message that shows if the product was bought successfully or an error message if the user doesn't exist, if the product doesn't exist or if the has reached the maximum number of books/magazines he can buy
     */
    public String buyProducts(String id, String productID){
        String msj = "Product not found";
        Users user = searchUserById(id);
        Double payment;
        if (user == null){
            msj = "User not found";
        }
        else {
            BibliographicPtoducts book = searchBookById(productID);
            BibliographicPtoducts magazine = searchMagazineById(productID);
            boolean doesUserHaveProduct;
            if (book != null){
                if (user instanceof PremiumUser){
                    doesUserHaveProduct = user.searchIfUserHasBook(book.getId());
                    if (doesUserHaveProduct== true){
                        msj = "You already have this book";
                    }
                    else {
                        user.buyBook(book);
                        payment = book.getPrice();
                        GregorianCalendar dateOfPurchase = new GregorianCalendar();
                        book.setDateOfPurchase(dateOfPurchase); 
                        msj = "Book bought successfully, paid: " + payment + " dollars " + " bought on date:  Year: " + book.getDateOfPurchase().get(GregorianCalendar.YEAR) + " Month: " + book.getDateOfPurchase().get(GregorianCalendar.MONTH) + " Day: " + book.getDateOfPurchase().get(GregorianCalendar.DAY_OF_MONTH) ;
                    }
                }
                else if (user instanceof BasicUser){
                    if (user.getBoughtBooks() == 5){
                        msj = "You have reached the maximum number of books you can buy";
                    }
                    else {
                        doesUserHaveProduct = user.searchIfUserHasBook(book.getId());
                        if (doesUserHaveProduct== true ){
                            msj = "You already have this book";
                        }
                        else {
                            user.buyBook(book);
                            payment = book.getPrice();
                            GregorianCalendar dateOfPurchase = new GregorianCalendar();
                            book.setDateOfPurchase(dateOfPurchase);
                            msj = "Book bought successfully, paid: " + payment + " dollars " + "\n bought on date:  Year: " + book.getDateOfPurchase().get(GregorianCalendar.YEAR) + " Month: " + book.getDateOfPurchase().get(GregorianCalendar.MONTH) + " Day: " + book.getDateOfPurchase().get(GregorianCalendar.DAY_OF_MONTH) ;
                        }
                    }
                }
            }
            else if (magazine != null){
                if (user instanceof PremiumUser){
                    doesUserHaveProduct = user.searchIfUserHasMagazine(magazine.getId());
                    if (doesUserHaveProduct== true){
                        msj = "You already have this magazine subscription";
                    }
                    else {
                        user.buyMagazine(magazine);
                        payment = magazine.getPrice();
                        GregorianCalendar dateOfPurchase = new GregorianCalendar();
                        magazine.setDateOfPurchase(dateOfPurchase);
                        msj = "Magazine subscription bought successfully, paid: " + payment + " dollars " + "\n bought on date: Year: " + magazine.getDateOfPurchase().get(GregorianCalendar.YEAR) + " Month: " + magazine.getDateOfPurchase().get(GregorianCalendar.MONTH) + " Day: " + magazine.getDateOfPurchase().get(GregorianCalendar.DAY_OF_MONTH) ;
                    }
                    
                }
                else if (user instanceof BasicUser){
                    if (user.getBoughtMagazineSubscriptions() == 2){
                        msj = "You have reached the maximum number of magazine subscriptions you can buy";
                    }
                    else {
                        doesUserHaveProduct = user.searchIfUserHasMagazine(magazine.getId());
                        if (doesUserHaveProduct== true){
                            msj = "You already have this magazine subscription";
                        }
                        else {
                            user.buyMagazine(magazine);
                            payment = magazine.getPrice();
                            GregorianCalendar dateOfPurchase = new GregorianCalendar();
                            magazine.setDateOfPurchase(dateOfPurchase);
                            msj = "Magazine subscription bought successfully, paid: " + payment + " dollars " + "\n bought on date: Year: " + magazine.getDateOfPurchase().get(GregorianCalendar.YEAR) + " Month: " + magazine.getDateOfPurchase().get(GregorianCalendar.MONTH) + " Day: " + magazine.getDateOfPurchase().get(GregorianCalendar.DAY_OF_MONTH) ;
                        }
                    }
                }
            }
        }
        return msj;
    }

    /**
     * Method that allows the user to cancel a magazine subscription by deleting it from his magazine list
     * @param id User's id
     * @param productID Product's id
     * @return msj Message that shows if the magazine subscription was cancelled successfully or an error message if the user doesn't exist, if the product doesn't exist or if the user doesn't have the product
     */
    public String cancelMagazineSubscription(String id, String productID){
        String msj = "Product not found";
        Users user = searchUserById(id);
        if (user==null){
            msj = "User not found";
        }
        else{
            BibliographicPtoducts magazine = searchMagazineById(productID);
            if (magazine != null){
                boolean userHas=user.searchIfUserHasMagazine(productID);
                if (userHas == true){
                    user.deleteMagazineFromUserList(id);;
                    msj = "Magazine subscription cancelled successfully";
                }
                else {
                    msj = "You don't have this magazine subscription";
                }

            }
        }
        return msj;
    }


    /**
     * Method that searches if the user exists, if it does it calls the method that fills the user's library
     * @param id User's id
     * @return msj Message that shows if the user was found or not
     */
    public String fillLibrary(String id){
        String msj="User not found";
        Users user = searchUserById(id);
        if (user != null){
            msj = "User found";
            user.fillLibrary();
        }
        return msj;
    }

    /**
     * Method that searches if the user exists, if it does it calls the method that shows the user's library
     * @param id User's id
     * @param page Page number the user wants to see
     * @return msj Message that shows the user's library or an error message if the user doesn't exist
     */
    public String showUserLibrary(String id, int page){
        String msj="User not found";
        Users user = searchUserById(id);
        if (user != null){
            msj = user.displayLibrary(page);   
        }
        return msj;
    }

    /**
     * Method that presents a reading session of a book or magazine 
     * @param id User's id
     * @param productID Product's id
     * @param pageNum Page number the user wants to read
     * @return msj Message that shows the reading session or an error message if the user doesn't exist, if the product doesn't exist or if the user doesn't have the product
     */
    public String readProduct(String id, String productIdOrPos, int option,  int pageNum){
        String msj = "User not found";
        Users user = searchUserById(id);
        String productID = "";
        if (option==1){
            productID = productIdOrPos;
        }
        else if (option==2){
            productID = user.searchProductIdByPosition(productIdOrPos);
        }
        BibliographicPtoducts book = searchBookById(productID);
        BibliographicPtoducts magazine = searchMagazineById(productID);
        int highestPageNumber = 0;
        if (pageNum<1){
            pageNum = 1;
        }
        if (user != null){
            if (book != null || magazine != null){
                if (pageNum>highestPageNumber){
                    highestPageNumber = pageNum;
                    updateHighestPageNumber(id, productID, highestPageNumber);
                }
                boolean userHasBook= user.searchIfUserHasBook(productID);
                if (userHasBook == true){
                    if (pageNum>book.getPageNumber()){
                        pageNum=book.getPageNumber();
                        highestPageNumber = pageNum;
                        updateHighestPageNumber(id, productID, highestPageNumber);
                    }
                    msj= "******Reading session in progress******\n" + "Reading book: " + book.getName() + "\n" + "Reading page number: " + pageNum + " of " + book.getPageNumber() + "\n";
                    if (user instanceof BasicUser && pageNum%20==0){
                        int add = Validators.randInt(1, 3);
                        msj += "\n";
                        if (add==1){
                            msj += ((BasicUser)user).getAdvertisment1();
                        }
                        else if (add==2){
                            msj += ((BasicUser)user).getAdvertisment2();
                        }
                        else if (add==3){
                            msj += ((BasicUser)user).getAdvertisment3();
                        }
                    }
                }
                else {
                    boolean userHasMagazine = user.searchIfUserHasMagazine(productID);
                    if (userHasMagazine == true){
                        if (pageNum>magazine.getPageNumber()){
                            pageNum=magazine.getPageNumber();
                            highestPageNumber = pageNum;
                            updateHighestPageNumber(id, productID, highestPageNumber);
                        }
                        msj = "******Reading session in progress******\n" + "Reading magazine: " + magazine.getName() + "\n" + "Reading page number: " + pageNum + " of " + magazine.getPageNumber() + "\n";
                        if (user instanceof BasicUser && pageNum%5==0){
                            int add = Validators.randInt(1, 3);
                            msj += "\n";
                            if (add==1){
                                msj += ((BasicUser)user).getAdvertisment1();
                            }
                            else if (add==2){
                                msj += ((BasicUser)user).getAdvertisment2();
                            }
                            else if (add==3){
                                msj += ((BasicUser)user).getAdvertisment3();
                            }
                        }
                    }
                    else {
                        msj = "you don't have this product in your library";
                    }
                }
            } else {
                msj = "Product not found";
            }
        }
        return msj;
    }

    /**
     * Method that updates the highest page number read by the user in a book or magazine
     * @param id User's id
     * @param productID Product's id
     * @param highestPageNumber Highest page number read by the user
     */
    public void updateHighestPageNumber (String id, String productID, int highestPageNumber){
        Users user = searchUserById(id);
        BibliographicPtoducts book = searchBookById(productID);
        BibliographicPtoducts magazine = searchMagazineById(productID);
        if (user != null){
            if (book != null) {
                user.setUserHighestBookPageNumber(book, highestPageNumber);
            }
            else if (magazine != null){
                user.setUserHighestMagazinePageNumber(magazine, highestPageNumber);
            }
        }
    }

    /**
     * Method that calculates the sum of the pages read of a book by all the users
     * @param bookId Book's id
     * @return msj Message that shows the sum of the pages read of the book or an error message if the book doesn't exist
     */
    public int sumatoryOfBookReadPages(String bookId){
        BibliographicPtoducts book = searchBookById(bookId);
        int sum = 0;
        if (book != null){
            for (int i=0; i<usersList.size(); i++){
                if (usersList.get(i).searchIfUserHasBook(bookId) == true){
                    sum += usersList.get(i).getUserHighestBookPageNumber(book);
                }
            }
        }
        return sum;
    }

    // not saving 

    /**
     * Method that calculates the sum of the pages read of a magazine by all the users
     * @param magazineId Magazine's id
     * @return msj Message that shows the sum of the pages read of the magazine or an error message if the magazine doesn't exist
     */
    public int sumatoryOfMagazineReadPages(String magazineId){
        BibliographicPtoducts magazine = searchMagazineById(magazineId);
        int sum = 0;
        if (magazine != null){
            for (int i=0; i<usersList.size(); i++){
                if (usersList.get(i).searchIfUserHasMagazine(magazineId) == true){
                    sum += usersList.get(i).getUserHighestMagazinePageNumber(magazine);
                }
            }
        }
        return sum;
    }

    /**
     * Method that calculates the sum of the pages read of all the books by all the users
     * @return sum Sum of the pages read of all the books by all the users
     */
   public int sumatoryOfAllBookReadPages(){
    int sum=0;
    for(int i=0; i<booksList.size(); i++){
        sum+=sumatoryOfBookReadPages(booksList.get(i).getId());
    }
    return sum;
   }

   /**
    * Method that calculates the sum of the pages read of all the magazines by all the users
    * @return sum Sum of the pages read of all the magazines by all the users
    */
   public int sumatoryOfAllMagazineReadPages(){
    int sum=0;
    for(int i=0; i<magazinesList.size(); i++){
        sum+=sumatoryOfMagazineReadPages(magazinesList.get(i).getId());
    }
    return sum;
   }

   /**
    * Method that calculates the sum of the pages read of all the books of a genre by all the users
    * @param genre Genre of the books
    * @return sum Sum of the pages read of all the books of a genre by all the users
    */
   public int sumatoryOfReadPagesByGenre(int genre){
    int sum=0;
    for(int i=0; i<booksList.size(); i++){
        if (((Book)booksList.get(i)).getGenreOrCategoryByFlag() == genre){
            sum+=sumatoryOfBookReadPages(booksList.get(i).getId());
        }
    }
    return sum;
   }

   /**
    * Method that calculates the sum of the pages read of all the magazines of a category by all the users
    * @param category Category of the magazines
    * @return sum Sum of the pages read of all the magazines of a category by all the users
    */
   public int sumatoryOfReadPagesByCategory(int category){
    int sum=0;
    for (int i=0; i<magazinesList.size(); i++){
        if (((Magazine)magazinesList.get(i)).getGenreOrCategoryByFlag() == category){
            sum+=sumatoryOfMagazineReadPages(magazinesList.get(i).getId());
        }
    }
    return sum;
   }

    /**
     * Method that searches for a user by its id
     * @param id User's id
     * @return foundUser User that was found
     */
    public Users searchUserById(String id){
        Users foundUser = null;
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getId().equals(id)) {
                foundUser= usersList.get(i);
            }
        }
        return foundUser;
    }

    /**
     * Method that searches for the number of books bought by genre
     * @param genre Genre of the books
     * @return sum Sum of the books bought of said genre
     */
    public int boughtBooksByGenre(int genre){
        int sum=0;
        for(int i=0; i<usersList.size(); i++){
            for (int j=0; j<booksList.size() ; j++){
                if (usersList.get(i).searchIfUserHasBook(booksList.get(j).getId()) == true){
                    if (((Book)booksList.get(j)).getGenreOrCategoryByFlag() == genre){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    /**
     * Method that searches for the number of magazines bought by category
     * @param category Category of the magazines
     * @return sum Sum of the magazines bought of said category
     */
    public int boughtMagazinesByCategory(int category){
        int sum=0;
        for(int i=0; i<usersList.size(); i++){
            for (int j=0; j<magazinesList.size() ; j++){
                if (usersList.get(i).searchIfUserHasMagazine(magazinesList.get(j).getId()) == true){
                    if (((Magazine)magazinesList.get(j)).getGenreOrCategoryByFlag() == category){
                        sum++;
                    }
                }
            }
        }
        return sum;
    }

    /**
     * Method that calculates the revenue of a book by genre
     * @param genre Genre of the book
     * @return sum Sum of the revenue of the book by genre
     */
    public double bookRevenueByGenre(int genre){
        double sum=0;
        for(int i=0; i<usersList.size(); i++){
            for (int j=0; j<booksList.size() ; j++){
                if (usersList.get(i).searchIfUserHasBook(booksList.get(j).getId()) == true){
                    if (((Book)booksList.get(j)).getGenreOrCategoryByFlag() == genre){
                        sum+=booksList.get(j).getPrice();
                    }
                }
            }
        }
        return sum;
    }

    /**
     * Method that calculates the revenue of a magazine by category
     * @param category Category of the magazine
     * @return sum Sum of the revenue of the magazine by category
     */
    public double magazineRevenueByCategory(int category){
        double sum=0;
        for(int i=0; i<usersList.size(); i++){
            for (int j=0; j<magazinesList.size() ; j++){
                if (usersList.get(i).searchIfUserHasMagazine(magazinesList.get(j).getId()) == true){
                    if (((Magazine)magazinesList.get(j)).getGenreOrCategoryByFlag() == category){
                        sum+=magazinesList.get(j).getPrice();
                    }
                }
            }
        }
        return sum;
    }
    /**
     * Method that searches for a book by its id
     * @param id Book's id
     * @return foundBook Book that was found
     */
    public BibliographicPtoducts searchBookById(String id){
        BibliographicPtoducts foundBook = null;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId().equals(id)) {
                foundBook = booksList.get(i);
            }
        }
        return foundBook;
    }
    /**
     * Method that searches for a magazine by its id
     * @param id Magazine's id
     * @return foundMagazine Magazine that was found
     */
    public BibliographicPtoducts searchMagazineById(String id){
        BibliographicPtoducts foundMagazine = null;
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                foundMagazine = magazinesList.get(i);
            }
        }
        return foundMagazine;
    }
    /**
     *  Method to check if the user id allready exists in the system
     * @return id User's id
     */
    public String validateUserID(){
        String id = Validators.reader.next();
        id = id.toUpperCase();
        for (int i = 0; i < usersList.size(); i++) {
            while (usersList.get(i).getId().equals(id)) {
                System.out.println("This ID is already registered, please enter a new one");
                id = Validators.reader.next();
                id = id.toUpperCase();
            }
        }
        return id;
    }
    /**
     * Method to seach a book by its name
     * @param name
     * @return msj Message that shows the book id or an error message if the book doesn't exist
     */
   public String searchBookByName(String name){
    String msj = "Book not found";
    for(int i=0; i<booksList.size(); i++){
        if(booksList.get(i).getName().equals(name)){
            msj = "Book id : " + booksList.get(i).getId();
        }
    }
    return msj;
   }

    /**
     * Method to seach a magazine by its name
     * @param name
     * @return msj Message that shows the magazine id or an error message if the magazine doesn't exist
     */
    public String searchMagazineByName(String name){
        String msj = "Magazine not found";
        for(int i=0; i<magazinesList.size(); i++){
            if(magazinesList.get(i).getName().equals(name)){
                msj = "Magazine id : " + magazinesList.get(i).getId();
            }
        }
        return msj;
    }

    /**
     * Method to generate the first report, it shows the total number of pages read in all books and magazines
     * @return msj Message that shows the total number of pages read in all books and magazines
     */
    public String reportOne(){
        StringBuilder msj = new StringBuilder();
        msj.append("Number of total pages read in all books: " + sumatoryOfAllBookReadPages());
        msj.append("\n");
        msj.append("Number of total pages read in all magazines: " + sumatoryOfAllMagazineReadPages());  
        return msj.toString();
    }

    /**
     * Method to generate the second report, it shows the total number of pages read by genre and category
     * @return msj Message that shows the total number of pages read by genre and category
     */
    public String reportTwo(){
        StringBuilder msj = new StringBuilder();
        msj.append("Number of total pages read of sience fiction books: " + sumatoryOfReadPagesByGenre(1));
        msj.append("\n");
        msj.append("Number of total pages read of fantasy books: " + sumatoryOfReadPagesByGenre(2));
        msj.append("\n");
        msj.append("Number of total pages read of historic novel books: " + sumatoryOfReadPagesByGenre(3));
        msj.append("\n");
        msj.append("Number of total pages read of variety magazines: " + sumatoryOfReadPagesByCategory(1));
        msj.append("\n");
        msj.append("Number of total pages read of design magazines: " + sumatoryOfReadPagesByCategory(2));
        msj.append("\n");
        msj.append("Number of total pages read of science magazines: " + sumatoryOfReadPagesByCategory(3));
        return msj.toString();
    }

    /**
     * Method to generate the third report, it shows the top 5 of most read books and magazines
     * @return msj Message that shows the top 5 of most read books and magazines
     */
    public String reportThree(){
        StringBuilder msj = new StringBuilder();
        // Top 5 of most read books
        String[] topFiveBooks = new String[5];
        int max = 0;
        int index = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<booksList.size(); j++){
                if(sumatoryOfBookReadPages(booksList.get(j).getId()) > max){
                    max = sumatoryOfBookReadPages(booksList.get(j).getId());
                    index = j;
                }
            }
            topFiveBooks[i] = booksList.get(index).getName();
            max = 0;
        }
        msj.append("Top 5 of most read books: ");
        msj.append("\n");
        for(int i=0; i<topFiveBooks.length; i++){
            msj.append((i+1)+ ": " + topFiveBooks[i]);
            msj.append("\n");
        }
        // Top 5 of most read magazines
        String[] topFiveMagazines = new String[5];
        max = 0;
        index = 0;
        for(int i=0; i<5; i++){
            for(int j=0; j<magazinesList.size(); j++){
                if(sumatoryOfMagazineReadPages(magazinesList.get(j).getId()) > max){
                    max = sumatoryOfMagazineReadPages(magazinesList.get(j).getId());
                    index = j;
                }
            }
            topFiveMagazines[i] = magazinesList.get(index).getName();
            max = 0;
        }
        msj.append("Top 5 of most read magazines: ");
        msj.append("\n");
        for(int i=0; i<topFiveMagazines.length; i++){
            msj.append((i+1)+ ": " + topFiveMagazines[i]+1);
            msj.append("\n");
        }
        return msj.toString();
    }

    /**
     * Method to generate the fourth report, it shows the number of books bought by genre and the revenue
     * @return msj Message that shows the number of books bought by genre and the revenue
     */
    public String reportFour(){
        StringBuilder msj = new StringBuilder();
        msj.append("Number of science fiction books bought: " + boughtBooksByGenre(1) + " and the revenue is: " + bookRevenueByGenre(1));
        msj.append("\n");
        msj.append("Number of fantasy books bought: " + boughtBooksByGenre(2) + " and the revenue is: " + bookRevenueByGenre(2));
        msj.append("\n");
        msj.append("Number of historic novel books bought: " + boughtBooksByGenre(3) + " and the revenue is: " + bookRevenueByGenre(3));
        return msj.toString();
    }

    /**
     * Method to generate the fifth report, it shows the number of magazines bought by category and the revenue 
     * @return msj Message that shows the number of magazines bought by category and the revenue
     */
    public String reportFive(){
        StringBuilder msj = new StringBuilder();
        msj.append("Number of variety magazine subscriptions bought: " + boughtMagazinesByCategory(1) + " and the revenue is: " + magazineRevenueByCategory(1));
        msj.append("\n");
        msj.append("Number of design magazine subscriptions bought: " + boughtMagazinesByCategory(2) + " and the revenue is: " + magazineRevenueByCategory(2));
        msj.append("\n");
        msj.append("Number of science magazines subscriptions bought: " + boughtMagazinesByCategory(3) + " and the revenue is: " + magazineRevenueByCategory(3));
        return msj.toString();
    }

    /**
     * Method that initializes the system with 10 books and 10 magazines, 10 basic users and 10 premium users
     * @param pageNum
     * @param price
     * @param url
     * @param briefReview
     * @param genre
     * @param category
     * @param frequencyOfIssuance
     * @param date
     * @return msj Message that shows the creation of the books, magazines, users and premium users
     */
    public String initTest(int pageNum, double price, String url, String briefReview, int genre, int category, int frequencyOfIssuance, GregorianCalendar date){
        StringBuilder msj = new StringBuilder();
        for(int i=0 ; i<10 ; i++){
            String name1 = "BOOKTEST" + i;
            String bookCreation = createBook(name1, pageNum, date, price, url, briefReview, genre);
            msj.append("Book list : "+ bookCreation + "\n");
          
        }
        for (int i=0; i<10;i++){
            String name2 = "MAGAZINETEST" + i;
            String magazineCreation = createMagazine(name2, pageNum, date, price, url, frequencyOfIssuance, category);
            msj.append("Magazine list: " + magazineCreation + "\n");     
        }
        for (int i=0; i<10;i++){
            String premiumUserName = "PREMIUMTEST" + i;
            String premiumUserId = "PREMIUMUSERID" + i;
            String premiumUserCreation = createPremiumUser(premiumUserName, premiumUserId, date, "123456789", "123");
            msj.append("Premium user " +i +": "+ premiumUserCreation + "\n");
        }
        for (int i=0; i<10; i++){
            String basicUserName = "BASICTEST" + i;
            String basicUserId = "BASICUSERID" + i;
            String basicUserCreation = createBasicUser(basicUserName, basicUserId, date);
            msj.append( "Basic user " +i +": "+ basicUserCreation + "\n");
        }
        return msj.toString();
    }


    public String validateControllerCreation(){
        return "**Controller created succesfully**";
    }

}
