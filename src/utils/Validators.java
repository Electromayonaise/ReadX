package utils;
import java.util.Scanner;

/**
 * Class that contains the methods to validate the inputs
 */
public class Validators {

    
    public static Scanner reader = new Scanner(System.in);

    /*
     * Method to print a message
     * @param o Object to be printed
     */
    public static void print(Object o){
        System.out.println(o);
    }

    /*
     * Method to validate the input is an integer
     */
    public static int validateIntInput(){
        while(!reader.hasNextInt()){
            print("Invalid option, please try again");
            reader.next();
        }
        return reader.nextInt();
    }

    /*
     * Method to validate the input is a double
     */
    public static double validateDoubleInput(){
        while(!reader.hasNextDouble()){
            print("Invalid option, please try again");
            reader.next();
        }
        return reader.nextDouble();
    }

    /*
     * Method to validate the input is a Url
     */
    public static String validateUrlInput(){
        String url = reader.next();
        while (!url.contains("https") || !url.contains("www")){
            print("Invalid url, please make sure it has a direction (or contains https, www)");
            url = reader.next();
        }
        return url;
    }

    /*
     * Method to validate the input is a valid movement in the reading session
     */
    public static String validateMovementInput(){
        String movement = reader.next();
        movement = movement.toUpperCase();
        while (!movement.equals("A") && !movement.equals("S") && !movement.equals("B") && !movement.equals("d")){
            print("Invalid movement, please try again");
            movement = reader.next();
            movement = movement.toUpperCase();
        }
        return movement;
    }

    /*
     * Method to validate the input is a valid option between 1 and 3
     */
    public static int validateOptionInput(){
        int option = validateIntInput();
        while(option>3 || option<1){
            print("Invalid option, please try again");
            option = validateIntInput();
        }
        return option;
    }

    /*
     * Method to validate the input is a valid option between 1 and 6
     */
    public static int validateUpdateInput(){
        int option = validateIntInput();
        while(option>6 || option<1){
            print("Invalid option, please try again");
            option = validateIntInput();
        }
        return option;
    }

    /*
     * Method to validate the input is a valid option between 1 and 2
     */
    public static int validateOneOrTwo(){
        int option = validateIntInput();
        while(option>2 || option<1){
            print("Invalid option, please try again");
            option = validateIntInput();
        }
        return option;
    }

    /*
     * Method to validate the input is a valid product option between 1 and 2
     */
    public static int validateBibliographicProducts(){
        int selectedProduct = validateIntInput();
        while(selectedProduct>2 || selectedProduct<1){
            print("Invalid option, please try again");
            selectedProduct = validateIntInput();
        }
        return selectedProduct;
    }

    /*
     * Method to validate the input is a valid plan option between 1 and 2
     */
    public static int validatePlan(){
        int plan = validateIntInput();
        while(plan>2 || plan<1){
            print("Invalid option, please try again");
            plan =validateIntInput();
        }
        return plan;
    }
    
    /*
     * Method to validate the input is a valid genre option between 1 and 3
     */
    public static int validateGenre(){
        int genre= validateIntInput();
        while(genre>3 || genre<1){
            print("Invalid option, please enter a valid genre");
            genre = validateIntInput();
        }
        return genre;
    }

    /*
     * Method to validate the input is a valid category option between 1 and 3
     */
    public static int validateCategory(){
        int category= validateIntInput();
        while(category>3 || category<1){
            print("Invalid option, please enter a valid category");
            category = validateIntInput();
        }
        return category;
    }
}