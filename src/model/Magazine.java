package model;

import java.util.GregorianCalendar;

public class Magazine extends BibliographicPtoducts{
    
    private int frequencyOfIssuance;
    private Category category;
    private String id;

    /*
     * Constructor method for the Magazine class
     * @param name Bibliographic product's name
     * @param pageNumber Bibliographic product's number of pages
     * @param publicationDate Bibliographic product's publication date
     * @param price Bibliographic product's price
     * @param frequencyOfIssuance Bibliographic product's frequency of issuance
     * @param category Bibliographic product's category (flag value converted in the constructor to an enum value)
     */
    public Magazine(String name, int pageNumber, GregorianCalendar publicationDate, double price, int frequencyOfIssuance, int category) {
        super(name, pageNumber, publicationDate, price, frequencyOfIssuance, category);
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
        generateID();
    }

    // must generate a unique alphanumeric identifier of 3 characters (A-Z, 0-9)
    public void generateID() {
        String id = "";
        for (int i = 0; i < 3; i++) {
            id += (char) (Math.random() * 26 + 'A');
        }
        setId(id);
        System.out.println("Generated magazine ID: " + id);
    }

    public int getFrequencyOfIssuance() {
        return frequencyOfIssuance;
    }

    public Category getCategory() {
        return category;
    }

    public String getId() {
        return id;
    }

    public void setFrequencyOfIssuance(int frequencyOfIssuance) {
        this.frequencyOfIssuance = frequencyOfIssuance;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setId(String id) {
        this.id = id;
    }

}
