package model;

import java.util.GregorianCalendar;

/**
 * Class that represents the magazines
 */
public class Magazine extends BibliographicPtoducts{
    
    private int frequencyOfIssuance;
    private Category category;
    private String id;

    /**
     * Constructor method for the Magazine class
     * @param name Bibliographic product's name
     * @param pageNumber Bibliographic product's number of pages
     * @param publicationDate Bibliographic product's publication date
     * @param price Bibliographic product's price
     * @param frequencyOfIssuance Bibliographic product's frequency of issuance
     * @param category Bibliographic product's category (flag value converted in the constructor to an enum value)
     */
    public Magazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, String url, int frequencyOfIssuance, int category) {
        super(name, pageNumber, publicationDate, price, url, frequencyOfIssuance, category);
        setGenreOrCategoryByFlag(category);
        this.frequencyOfIssuance = frequencyOfIssuance;
        generateID();
    }

    @Override
    /**
     * Method that generates a random ID for the magazine that is  a unique 3 alphanumeric digit identifier (A-Z, 0-9)
     * @return id Magazine's ID
     */
    public  String generateID() {
        StringBuilder id = new StringBuilder();
        // Generate a 3 digit ID
        for(int i = 0 ; i <3; i++) {
            int rand =( int ) (Math.random() *36);
            // If random number is less than 10, add a digit character (0-9)
            if (rand < 10) {
                id.append((char) (rand + '0'));
            } 
            // Otherwise, add an uppercase letter character (A-Z)
            else{
                id.append((char) (rand -10 + 'A'));
            }
        }
        // Set ID and return it
        setId(id.toString());
        return id.toString();
    }

    /**
     * Method that converts the category flag value to a Category enum value
     * @param category Category flag value
     */
    @Override
    public void setGenreOrCategoryByFlag(int category) {
        Category finalCategory = null;
        if (category==1){
            finalCategory = Category.VARIETY;
        }
        else if (category==2){
            finalCategory = Category.DESIGN;
        }
        else if (category==3){
            finalCategory = Category.SCIENCE;
        }
        this.category = finalCategory;
    }

    /**
     * Method that returns the magazine's frequency of issuance
     * @return frequencyOfIssuance Magazine's frequency of issuance
     */
    public int getFrequencyOfIssuance() {
        return frequencyOfIssuance;
    }

    /**
     * Method that returns the magazine's category
     * @return category Magazine's category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Method that returns the magazine's ID
     * @return id Magazine's ID
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Method that sets the magazine's frequency of issuance
     * @param frequencyOfIssuance Magazine's frequency of issuance
     */
    public void setFrequencyOfIssuance(int frequencyOfIssuance) {
        this.frequencyOfIssuance = frequencyOfIssuance;
    }

    /**
     * Method that sets the magazine's category
     * @param category Magazine's category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * Method that sets the magazine's ID
     * @param id Magazine's ID
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

}
