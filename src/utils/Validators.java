package utils;
import java.util.Scanner;

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
     * Method to validate the input is a valid option between 1 and 3
     */
    public static int validateOptionInput(){
        int option = reader.nextInt();
        while(option>3 || option<1){
            print("Invalid option, please try again");
            option = reader.nextInt();
        }
        return option;
    }

    /*
     * Method to validate the input is a valid option between 1 and 6
     */
    public static int validateUpdateInput(){
        int option = reader.nextInt();
        while(option>6 || option<1){
            print("Invalid option, please try again");
            option = reader.nextInt();
        }
        return option;
    }

    /*
     * Method to validate the input is a valid option between 1 and 2
     */
    public static int validateOneOrTwo(){
        int option = reader.nextInt();
        while(option>2 || option<1){
            print("Invalid option, please try again");
            option = reader.nextInt();
        }
        return option;
    }

    /*
     * Method to validate the input is a valid product option between 1 and 2
     */
    public static int validateBibliographicProducts(){
        int selectedProduct = reader.nextInt();
        while(selectedProduct>2 || selectedProduct<1){
            print("Invalid option, please try again");
            selectedProduct = reader.nextInt();
        }
        return selectedProduct;
    }

    /*
     * Method to validate the input is a valid plan option between 1 and 2
     */
    public static int validatePlan(){
        int plan = reader.nextInt();
        while(plan>2 || plan<1){
            print("Invalid option, please try again");
            plan = reader.nextInt();
        }
        return plan;
    }
    
    /*
     * Method to validate the input is a valid genre option between 1 and 3
     */
    public static int validateGenre(){
        int genre= reader.nextInt();
        while(genre>3 || genre<1){
            print("Invalid option, please enter a valid genre");
            genre = reader.nextInt();
        }
        return genre;
    }

    /*
     * Method to validate the input is a valid category option between 1 and 3
     */
    public static int validateCategory(){
        int category= reader.nextInt();
        while(category>3 || category<1){
            print("Invalid option, please enter a valid category");
            category = reader.nextInt();
        }
        return category;
    }
}