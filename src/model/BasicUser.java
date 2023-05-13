package model;
import java.util.GregorianCalendar;

/**
 * Class that represents the basic users
 */
public class BasicUser extends Users implements Advertisable {

    /**
     * Constructor method for the BasicUser class
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     */
    public BasicUser(String name, String id, GregorianCalendar registrationDate) {
        super(name, id, registrationDate);
        
    }

    @Override 
    public String getAdvertisment1() {
        return "Subscribe to the plus combo and get Disney+ and Star+ at an incredible price!";
    }

    @Override
    public String getAdvertisment2() {
        return "Now your pets have a favorite app: Laika. The best products for your fluffy friends!";
    }

    @Override
    public String getAdvertisment3() {
        return "We are having our aniversary! Go to your closest Exito and surprise yourself with our discounts.";
    }
}
