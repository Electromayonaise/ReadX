package model;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import utils.Validators;

public class ReadXController {
    
    ArrayList <Book> booksList = new ArrayList<Book>();
    ArrayList <Magazine> magazinesList = new ArrayList<Magazine>();
    ArrayList<Users> usersList = new ArrayList<Users>();
    private int maxProducts= booksList.size() + magazinesList.size() +1;

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
    public void createBook( String name, int pageNumber, GregorianCalendar publicationDate, double price, String briefReview, int genre) {
        booksList.add(new Book(name, pageNumber, publicationDate, price, briefReview, genre));
        /*for (int i = 0; i < booksList.size(); i++){
            System.out.println(booksList.get(i).getId());
            CICLE TO CHECK IF THE BOOKS ARE BEING ADDED TO THE ARRAY
        }*/
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
    public void createMagazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category){
        magazinesList.add(new Magazine(name, pageNumber, publicationDate, price, frequencyOfIssuance, category));
        /*for (int i = 0; i < magazinesList.size(); i++){
            System.out.println(magazinesList.get(i).getId());
            CICLE TO CHECK IF THE MAGAZINES ARE BEING ADDED TO THE ARRAY
        } */ 
    }

    /*
     * Method that deletes a book object from the books array
     * @param id Book's id
     */
    public void deleteBook(String id){
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.remove(i);
                System.out.println("Book deleted successfully");
            }
        }
    }

    /*
     * Method that deletes a magazine object from the magazines array
     * @param id Magazine's id
     */
    public void deleteMagazine(String id){
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i) != null && magazinesList.get(i).getId().equals(id)) {
                magazinesList.remove(i);
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
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setName(newName);
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
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setPageNumber(newPageNumber);
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
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setPublicationDate(newPublicationDate);
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
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setPrice(newPrice);
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
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setBriefReview(newBriefReview);
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
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i) != null && booksList.get(i).getId().equals(id)) {
                booksList.get(i).setGenreByFlag(newGenre);
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
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i) != null && magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setName(newName);
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
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i) != null && magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setPageNumber(newPageNumber);
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
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i) != null && magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setPublicationDate(newPublicationDate);
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
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i) != null && magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setPrice(newPrice);
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
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i) != null && magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setFrequencyOfIssuance(newFrequencyOfIssuance);
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
        for (int i = 0; i < magazinesList.size(); i++) {
            if (magazinesList.get(i) != null && magazinesList.get(i).getId().equals(id)) {
                magazinesList.get(i).setCategoryByFlag(newCategory);
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
    public void createPremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode){
        System.out.println("Premium user created succesfully, with the name of:"+ name + " and the ID of: " + id +"(payment information private)" );
        usersList.add(new PremiumUser(name, id, registrationDate, cardNumber, securityCode));
    }

    /*
     * Method that creates a basic user object and stores it in the users array
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param basicPos User's position in the users array
     */
    public void createBasicUser(String name, String id, GregorianCalendar registrationDate){
        System.out.println("Basic user created successfully, with the name of: " + name + " and the ID of: " + id);
        usersList.add(new BasicUser(name, id, registrationDate));
    }

    /*
     * Method that searches for a product inputed by the user in the books and magazines arrays and sends 
     * it to the method buyBook/buyMagazine
     * @param id User's id
     * @param productID Product's id
     */
    public void buyProducts(String id, String productID){
        for (int i = 0; i < usersList.size(); i++) {
            if (usersList.get(i) != null && usersList.get(i).getId().equals(id)) {
                for (int j = 0; j < maxProducts; j++) {
                    if (booksList.size()>j){
                        if (booksList.get(j) != null && booksList.get(j).getId().equals(productID)) {
                            if (usersList.get(i) instanceof PremiumUser){
                            usersList.get(i).buyBook(usersList.get(i).getId(), booksList.get(j));
                            }
                            else if (usersList.get(i) instanceof BasicUser){
                                if (usersList.get(i).getBoughtBooks() ==5 ){
                                    System.out.println("You have reached the maximum number of books you can buy");
                                }
                                else {
                                    usersList.get(i).buyBook(usersList.get(i).getId(), booksList.get(j));
                                }
                            }
                        }
                    }
                    if (magazinesList.size()>j){
                        if (magazinesList.get(j) != null && magazinesList.get(j).getId().equals(productID)) {
                            if (usersList.get(i) instanceof PremiumUser){
                            usersList.get(i).buyMagazine(usersList.get(i).getId(), magazinesList.get(j));
                            }
                            else if (usersList.get(i) instanceof BasicUser){
                                if (usersList.get(i).getBoughtMagazineSubscriptions() ==2 ){
                                    System.out.println("You have reached the maximum number of magazine subscriptions you can buy");
                                }
                                else {
                                    usersList.get(i).buyMagazine(usersList.get(i).getId(), magazinesList.get(j));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // The user's library must be represented trough 5x5 matrix that present the id's of the products from oldest to newest (publication date),when the martix is full, the user may go to the next page of the library and so on.=
    public void showLibrary(String id){
        for (int i=0; i<usersList.size(); i++){
            if (usersList.get(i) != null && usersList.get(i).getId().equals(id)){
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
    /*
     *  Method to check if the user id allready exists in the system
     * @return id User's id
     */
    public String validateUserID(){
        String id = Validators.reader.next();
        for (int i = 0; i < usersList.size(); i++) {
            while (usersList.get(i) != null && usersList.get(i).getId().equals(id)) {
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
        for (int i = 0; i < maxProducts ; i++) {
            if (booksList.size()>i){
                if (booksList.get(i).getName().equals(name)) {
                System.out.println("The product's ID is: " + booksList.get(i).getId());
                }
            }
            if (magazinesList.size()>i){
               if (magazinesList.get(i).getName().equals(name)) {
                System.out.println("The product's ID is: " + magazinesList.get(i).getId());
               }
            }
        }
    }

    /*
     * Method that searches if a book with the same name already exists in the system
     */
    public String checkForBookNames(){
        String name = Validators.reader.next();
        name = name.toUpperCase();
        if (booksList.size() == 0){
            return name;
        }
        for (int i =0; i< booksList.size(); i++){
            if (booksList.get(i) != null && booksList.get(i).getName().equals(name)){
                System.out.println("A book with this name already exists, please enter a new one");
                name = Validators.reader.next();
            }
        }
        return name;
    }

    /*
     * Method that searches if a magazine with the same name already exists in the system
     */
    public String checkForMagazineNames(){
        String name = Validators.reader.next();
        name = name.toUpperCase();
        if (magazinesList.size() == 0){
            return name;
        }
        for (int i=0; i< magazinesList.size(); i++){
            if (magazinesList.get(i) != null && magazinesList.get(i).getName().equals(name)){
                System.out.println("A magazine with this name already exists, please enter a new one");
                name = Validators.reader.next();
            }
        }
        return name;
    }
}
