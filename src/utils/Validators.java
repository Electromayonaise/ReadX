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

    public static Genre validateGenre(){
        String genre = reader.nextLine();
        while(!genre.equals("SCIENCEFICTION") && !genre.equals("FANTASY") && !genre.equals("HISTORICNOVEL")){
            print("Invalid option, please try again");
            genre = reader.nextLine();
        }
        return genre;
    }
}