package model;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import utils.Validators;

public class ReadXController {
    
    ArrayList <Book> booksList = new ArrayList<Book>();
    ArrayList <Magazine> magazinesList = new ArrayList<Magazine>();
    ArrayList<Users> usersList = new ArrayList<Users>();

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
    public String createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String url, String briefReview, int genre) {
        booksList.add(new Book(name, pageNumber, publicationDate, price, url, briefReview, genre));
        String booksCreated ="";
        for (int i = 0; i < booksList.size(); i++){
           booksCreated += "\n"+ booksList.get(i).getName() + " " + booksList.get(i).getId();
        }
        return booksCreated;
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
    public String createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, String url,  int frequencyOfIssuance, int category){
        magazinesList.add(new Magazine(name, pageNumber, publicationDate, price, url, frequencyOfIssuance, category));
        String magazinesCreated ="";
        for (int i = 0; i < magazinesList.size(); i++){
            magazinesCreated+= "\n" + magazinesList.get(i).getName() +" "+ magazinesList.get(i).getId();
        } 
        return magazinesCreated;
    }

    /*
     * Method that deletes a book object from the books array
     * @param id Book's id
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

    /*
     * Method that deletes a magazine object from the magazines array
     * @param id Magazine's id
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

    /*
     * Method that updates a book object's name
     * @param id Book's id
     * @param newName Book's new name
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

    /*
     * Method that updates a book object's number of pages
     * @param id Book's id
     * @param newPageNumber Book's new number of pages
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

    /*
     * Method that updates a book object's publication date
     * @param id Book's id
     * @param newPublicationDate Book's new publication date
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

    /*
     * Method that updates a book object's price
     * @param id Book's id
     * @param newPrice Book's new price
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

    /*
     * Method that updates a book object's brief review
     * @param id Book's id
     * @param newBriefReview Book's new brief review
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

    /*
     * Method that updates a book object's genre
     * @param id Book's id
     * @param newGenre Book's new genre (flag value)
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

    /*
     * Method that updates a magazine object's name
     * @param id Magazine's id
     * @param newName Magazine's new name
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

    /*
     * Method that updates a magazine object's number of pages
     * @param id Magazine's id
     * @param newPageNumber Magazine's new number of pages
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

    /*
     * Method that updates a magazine object's publication date
     * @param id Magazine's id
     * @param newPublicationDate Magazine's new publication date
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

    /*
     * Method that updates a magazine object's price
     * @param id Magazine's id
     * @param newPrice Magazine's new price
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

    /*
     * Method that updates a magazine object's frequency of issuance
     * @param id Magazine's id
     * @param newFrequencyOfIssuance Magazine's new frequency of issuance
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

    /*
     * Method that updates a magazine object's category
     * @param id Magazine's id
     * @param newCategory Magazine's new category (flag value)
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

    /*
     * Method that creates a premium user object and stores it in the users array
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param cardNumber User's credit card number
     * @param securityCode User's credit card security code
     * @param premiumPos User's position in the users array
     */
    public String createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode){
        String msj = ("Premium user created succesfully, with the name of:"+ name + " and the ID of: " + id +"(payment information private)" );
        usersList.add(new PremiumUser(name, id, registrationDate, cardNumber, securityCode));
        return msj;
    }

    /*
     * Method that creates a basic user object and stores it in the users array
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param basicPos User's position in the users array
     */
    public String createBasicUser(String name, String id, GregorianCalendar registrationDate){
        String msj=("Basic user created successfully, with the name of: " + name + " and the ID of: " + id);
        usersList.add(new BasicUser(name, id, registrationDate));
        return msj;
    }

    /*
     * Method that searches for a product inputed by the user in the books and magazines arrays and sends 
     * it to the method buyBook/buyMagazine
     * @param id User's id
     * @param productID Product's id
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

    // The user's library must be represented trough 5x5 matrix that present the id's of the products from oldest to newest (publication date),when the martix is full, the user may go to the next page of the library and so on.=
    public void showLibrary(String id){
        for (int i=0; i<usersList.size(); i++){
            if (usersList.get(i).getId().equals(id)){
                String [][]matrix = new String[5][5];
                for(int j=0, k=0; j<matrix.length ;j++){
                    for(int m=0; m<matrix.length ;m++){
                        if(usersList.get(i).userBooksList.get(k) != null){
                            matrix[j][m] = usersList.get(i).userBooksList.get(k).getId();
                            k++;
                        }
                        else if(usersList.get(i).userMagazinesList.get(k) != null){
                            matrix[j][m] = usersList.get(i).userMagazinesList.get(k).getId();
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
            /*
             * 	public static final int ROW = 3; 
	public static final int COLUMN = 5; 

	private int[][] matrix;

	public MatrixCalculator(){
		matrix = new int[ROW][COLUMN]; 
		initMatrix();
	}

	public void  createMatrix(int row, int column){
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				matrix[i][j] = i+j; 
			}
		}

	}
	public String printMatrix(){
		String msj = ""; 
		for(int i = 0; i < ROW; i++){
			for(int j = 0; j < COLUMN; j++){
				msj += " "+matrix[i][j]; 
			}
			msj += "\n";
		}
		return msj; 
	}

	private void initMatrix(){
		for(int i = 0; i < ROW; i++){
			for(int j = 0; j < COLUMN; j++){
				matrix[i][j] = i+j; 
			}
		}
	}
             */
            
        }
    }

    public void readProduct(String productID){
        
    }

    public Users searchUserById(String id){
        Users foundUser = null;
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i).getId().equals(id)) {
                foundUser= usersList.get(i);
            }
        }
        return foundUser;
    }


    public Book searchBookById(String id){
        Book foundBook = null;
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getId().equals(id)) {
                foundBook = booksList.get(i);
            }
        }
        return foundBook;
    }

    public Magazine searchMagazineById(String id){
        Magazine foundMagazine = null;
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getId().equals(id)) {
                foundMagazine = magazinesList.get(i);
            }
        }
        return foundMagazine;
    }

    /*  
     *  Method to check if the user id allready exists in the system
     * @return id User's id
     */
    public String validateUserID(){
        String id = Validators.reader.next();
        for (int i = 0; i < usersList.size(); i++) {
            while (usersList.get(i).getId().equals(id)) {
                System.out.println("This ID is already registered, please enter a new one");
                id = Validators.reader.next();
            }
        }
        return id;
    }

    /*
     * Method that searchhes for a Book by its name 
     * @param name Product's name
     * @return id Product's id
     */
    public String getBookIdByName (String name){
        String id = "Book not found";
        System.out.println(booksList.size());
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getName().equals(name)) {
                id = booksList.get(i).getId();
            }
        }
        return id;
    }

    /*
     * Method that searchhes for a Magazine by its name 
     * @param name Product's name
     * @return id Product's id
     */
    public String getMagazineIdByName (String name){
        String id = "Magazine not found";
        System.out.println(magazinesList.size());
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getName().equals(name)) {
                id = magazinesList.get(i).getId();
            }
        }
        return id;
    }

    /*
     * Method that searches for books with similar names, gives them in a list and shows their respective id 
     * @param name Product's name
     * @return coincidences List of books with similar names
     */
    public String checkForBookNameCoincidences(String name){
        String coincidences = "No books with similar names were found";
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getName().contains(name)) {
                // empty the string
                coincidences = "";
                coincidences += booksList.get(i).getName() + " ID: " + booksList.get(i).getId() + "\n";
            }
        }
        return coincidences;
    }

   

    /*
     * Method that searches for magazines with similar names, gives them in a list and shows their respective id 
     * @param name Product's name
     * @return coincidences List of magazines with similar names
     */
    public String checkForMagazineNameCoincidences(String name){
        String coincidences = "No magazines with similar names were found";
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i).getName().contains(name)) {
                // empty the string
                coincidences = "";
                coincidences += magazinesList.get(i).getName() + " ID: " + magazinesList.get(i).getId() + "\n";
            }
        }
        return coincidences;
    }
}
