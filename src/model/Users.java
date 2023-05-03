package model;
import java.util.GregorianCalendar;

public class Users {
 
    private String name;
    private String id;
    private GregorianCalendar registrationDate;
    public static BasicUser basicUser;
    public static PremiumUser premiumUser;

    public Users (String name, String id, GregorianCalendar registrationDate) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
        basicUser = new BasicUser(name,id,registrationDate);
    }

    public Users (String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
        premiumUser = new PremiumUser(name,id,registrationDate,cardNumber,securityCode);
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public GregorianCalendar getRegistrationDate() {
        return registrationDate;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id= id;
    }

    public void setRegistrationDate(GregorianCalendar registrationDate) {
        this.registrationDate = registrationDate;
    }

}
