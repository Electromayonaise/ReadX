package model;
import java.util.GregorianCalendar;

public class BasicUser extends Users {

    /*
     * Constructor method for the BasicUser class
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     */
    public BasicUser(String name, String id, GregorianCalendar registrationDate) {
        super(name, id, registrationDate);
        
    }
    
}
