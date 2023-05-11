package model;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import utils.Validators;

/**
 * Class that represents the controller of the ReadX system
 */
public class ReadXController {
    
    ArrayList <Book> booksList = new ArrayList<Book>();
    ArrayList <Magazine> magazinesList = new ArrayList<Magazine>();
    ArrayList<Users> usersList = new ArrayList<Users>();

    /**
     * Constructor method for the ReadXController class, empty because it is not needed
     */
    public ReadXController(){}

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
        String booksCreated ="";
        for (int i = 0; i < booksList.size(); i++){
           booksCreated += "\n"+ booksList.get(i).getName() + " " + booksList.get(i).getId();
        }
        return booksCreated;
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
        String magazinesCreated ="";
        for (int i = 0; i < magazinesList.size(); i++){
            magazinesCreated+= "\n" + magazinesList.get(i).getName() +" "+ magazinesList.get(i).getId();
        } 
        return magazinesCreated;
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
                msj = "Book deleted successfully";
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
                booksList.get(i).setGenreByFlag(newGenre);
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
                magazinesList.get(i).setCategoryByFlag(newCategory);
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
     * @param id User's id
     * @param productID Product's id
     * @return msj Message that shows if the product was bought successfully or an error message if the user doesn't exist, if the product doesn't exist or if the has reached the maximum number of books/magazines he can buy
     */
    public String buyProducts(String id, String productID){
        String msj = "Product not found";
        Users user = searchUserById(id);
        Book book = searchBookById(productID);
        Magazine magazine = searchMagazineById(productID);

        if (book != null){
            if (user instanceof PremiumUser){
                user.buyBook(book);
                msj = "Book bought successfully";
                GregorianCalendar dateOfPurchase = new GregorianCalendar();
                book.setDateOfPurchase(dateOfPurchase);
            }
            else if (user instanceof BasicUser){
                if (user.getBoughtBooks() == 5){
                    msj = "You have reached the maximum number of books you can buy";
                }
                else {
                    user.buyBook(book);
                    msj = "Book bought successfully";
                    GregorianCalendar dateOfPurchase = new GregorianCalendar();
                    book.setDateOfPurchase(dateOfPurchase);
                }
            }
        }
        else if (magazine != null){
            if (user instanceof PremiumUser){
                user.buyMagazine(magazine);
                msj = "Magazine bought successfully";
                GregorianCalendar dateOfPurchase = new GregorianCalendar();
                magazine.setDateOfPurchase(dateOfPurchase);
            }
            else if (user instanceof BasicUser){
                if (user.getBoughtMagazineSubscriptions() == 2){
                    msj = "You have reached the maximum number of magazine subscriptions you can buy";
                }
                else {
                    user.buyMagazine(magazine);
                    msj = "Magazine bought successfully";
                    GregorianCalendar dateOfPurchase = new GregorianCalendar();
                    magazine.setDateOfPurchase(dateOfPurchase);
                }
            }
        }
        return msj;   
    }

    // INCOMPLETE METHOD !!!!
    // The user's library must be represented trough 5x5 matrix that present the id's of the products from oldest to newest (publication date),when the martix is full, the user may go to the next page of the library and so on.=
    public String showLibrary(String id){
        String msj="User not found";
        Users user = searchUserById(id);
        orderBooksByDate();
        orderMagazinesByDate();
        int shownBooks = 0;
        int shownMagazines = 0;
        if (user != null){
            String [][] library = new String [5][5];
            for (int i=0; i<5; i++){
                for (int j=0; j<5; j++){
                    for (int k=0; k<user.getBoughtBooks(); k++){
                        if (booksList.get(i).getStatus() == false){
                            library[i][j] = booksList.get(i).getId();
                            booksList.get(i).setStatus(true);
                            shownBooks++;
                        }
                    }
                    for (int k=0; k<user.getBoughtMagazineSubscriptions(); k++){
                        if (magazinesList.get(i).getStatus() == false){
                            library[i][j] = magazinesList.get(i).getId();
                            magazinesList.get(i).setStatus(true);
                            shownMagazines++;
                        }
                    }
                }
            }

            if (shownBooks <user.getBoughtBooks() || shownMagazines<user.getBoughtMagazineSubscriptions()){
                msj = "You have reached the end of your library, please go to the next page";
            }

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
    public String readProduct(String id, String productID, int pageNum){
        String msj = "User not found";
        Users user = searchUserById(id);
        Book book = searchBookById(productID);
        Magazine magazine = searchMagazineById(productID);
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
                    msj= "******Reading session in progress******\n" + "Reading: " + book.getName() + "\n" + "Reading page number: " + pageNum + " of " + book.getPageNumber() + "\n";
                }
                else {
                    boolean userHasMagazine = user.searchIfUserHasMagazine(productID);
                    if (userHasMagazine == true){
                        if (pageNum>magazine.getPageNumber()){
                            pageNum=magazine.getPageNumber();
                            highestPageNumber = pageNum;
                            updateHighestPageNumber(id, productID, highestPageNumber);
                        }
                        msj = "******Reading session in progress******\n" + "Reading: " + magazine.getName() + "\n" + "Reading page number: " + pageNum + " of " + magazine.getPageNumber() + "\n";
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
        Book book = searchBookById(productID);
        Magazine magazine = searchMagazineById(productID);
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
    public String sumatoryOfBookReadPages(String bookId){
        String msj= "Book not found";
        Book book = searchBookById(bookId);
        int sum = 0;
        if (book != null){
            for (int i=0; i<usersList.size(); i++){
                if (usersList.get(i).searchIfUserHasBook(bookId) == true){
                    sum += usersList.get(i).getUserHighestBookPageNumber(book);
                    msj = "The sumatory of the pages read of this book is: " + sum;
                }
            }
        }
        return msj;
    }

    /**
     * Method that calculates the sum of the pages read of a magazine by all the users
     * @param magazineId Magazine's id
     * @return msj Message that shows the sum of the pages read of the magazine or an error message if the magazine doesn't exist
     */
    public String sumatoryOfMagazineReadPages(String magazineId){
        String msj= "Magazine not found";
        Magazine magazine = searchMagazineById(magazineId);
        int sum = 0;
        if (magazine != null){
            for (int i=0; i<usersList.size(); i++){
                if (usersList.get(i).searchIfUserHasMagazine(magazineId) == true){
                    sum += usersList.get(i).getUserHighestMagazinePageNumber(magazine);
                    msj = "The sumatory of the pages read of this magazine is: " + sum;
                }
            }
        }
        return msj;
    }

    /**
     * Method that organizes the books array by publication date from oldest to newest
     */
    public void orderBooksByDate(){
        for(int i =0; i<booksList.size(); i++){
            for(int j =0; j<booksList.size()-1; j++){
                if(booksList.get(j).getPublicationDate().compareTo(booksList.get(j+1).getPublicationDate())>0){
                    Book temp = booksList.get(j);
                    booksList.set(j, booksList.get(j+1));
                    booksList.set(j+1, temp);
                }
            }
        }
    }

    /**
     * Method that organizes the magazines array by publication date from oldest to newest
     */
    public void orderMagazinesByDate(){
        for(int i =0; i<magazinesList.size(); i++){
            for(int j =0; j<magazinesList.size()-1; j++){
                if(magazinesList.get(j).getPublicationDate().compareTo(magazinesList.get(j+1).getPublicationDate())>0){
                    Magazine temp = magazinesList.get(j);
                    magazinesList.set(j, magazinesList.get(j+1));
                    magazinesList.set(j+1, temp);
                }
            }
        }
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
     * Method that searches for a book by its id
     * @param id Book's id
     * @return foundBook Book that was found
     */
    public Book searchBookById(String id){
        Book foundBook = null;
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
    public Magazine searchMagazineById(String id){
        Magazine foundMagazine = null;
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
        String msj = "";
        for(int i=0 ; i<10 ; i++){
            String name1 = "BOOKTEST" + i;
            String bookCreation = createBook(name1, pageNum, date, price, url, briefReview, genre);
            msj+= "Book list : "+ bookCreation + "\n";
          
        }
        for (int i=0; i<10;i++){
            String name2 = "MAGAZINETEST" + i;
            String magazineCreation = createMagazine(name2, pageNum, date, price, url, frequencyOfIssuance, category);
            msj+= "Magazine list: " + magazineCreation + "\n";     
        }
        for (int i=0; i<10;i++){
            String premiumUserName = "PREMIUMTEST" + i;
            String premiumUserId = "PREMIUMUSERID" + i;
            String premiumUserCreation = createPremiumUser(premiumUserName, premiumUserId, date, "123456789", "123");
            msj += "Premium user " +i +": "+ premiumUserCreation + "\n";
        }
        for (int i=0; i<10; i++){
            String basicUserName = "BASICTEST" + i;
            String basicUserId = "BASICUSERID" + i;
            String basicUserCreation = createBasicUser(basicUserName, basicUserId, date);
            msj+= "Basic user " +i +": "+ basicUserCreation + "\n";
        }
        return msj;
    }
}
