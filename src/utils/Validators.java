package utils;
import java.util.Scanner;

public class Validators {

    
    public static Scanner reader = new Scanner(System.in);

    public static void print(Object o){
        System.out.println(o);
    }

    public static int validateBibliographicProducts(){
        int selectedProduct = reader.nextInt();
        while(selectedProduct>2 || selectedProduct<1){
            print("Invalid option, please try again");
            selectedProduct = reader.nextInt();
        }
        return selectedProduct;
    }

    public static int validatePlan(){
        int plan = reader.nextInt();
        while(plan>2 || plan<1){
            print("Invalid option, please try again");
            plan = reader.nextInt();
        }
        return plan;
    }
    
    public static int validateGenre(){
        int genre= reader.nextInt();
        while(genre>3 || genre<1){
            print("Invalid option, please enter a valid genre");
            genre = reader.nextInt();
        }
        return genre;
    }

    public static int validateCategory(){
        int category= reader.nextInt();
        while(category>3 || category<1){
            print("Invalid option, please enter a valid category");
            category = reader.nextInt();
        }
        return category;
    }
}