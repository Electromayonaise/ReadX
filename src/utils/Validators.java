package utils;
import java.util.Scanner;
import model.Genre;

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
    
    public static Genre validateGenre(){
        String desiredGenre = reader.nextLine();
        Genre genre = null;
        while(!desiredGenre.equals("SCIENCEFICTION") && !desiredGenre.equals("FANTASY") && !desiredGenre.equals("HISTORICNOVEL")){
            print("Invalid option, please try again");
            desiredGenre = reader.nextLine();
        }
        if (desiredGenre.equals("SCIENCEFICTION")){
            genre = Genre.SCIENCEFICTION;
            return genre;
        }
        else if (desiredGenre.equals("FANTASY")){
            genre = Genre.FANTASY;
            return genre;
        }
        else if (desiredGenre.equals("HISTORICNOVEL")){
            genre = Genre.HISTORICNOVEL;
            return genre;
        }
        return genre;
    }
}