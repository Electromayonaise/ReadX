package model;
import java.util.GregorianCalendar;
import utils.Validators;

public class Users {
 
    private String name;
    private String id;
    private GregorianCalendar registrationDate;
    private int plan;
    public static BasicUser basicUser;
    public static PremiumUser premiumUser;

    public Users (String name, String id, GregorianCalendar registrationDate, int plan) {
        this.name = name;
        this.id = id;
        this.registrationDate = registrationDate;
        this.plan = plan;
        if (plan==1){
            createBasicUser();
        }
        else if (plan==2){
            createPrimuimUser();
        }
    }

    public void createBasicUser(){
        basicUser = new BasicUser(name,id,registrationDate);
    }

    public void createPrimuimUser(){
        Validators.print("Enter your credit card number");
        String cardNumber=Validators.reader.nextLine();
        Validators.print("Enter your credit card security code");
        String securityCode=Validators.reader.nextLine();
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

    public int getPlan() {
        return plan;
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

    public void setPlan(int plan) {
        this.plan = plan;
    }
}
