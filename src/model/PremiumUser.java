package model;
import java.util.GregorianCalendar;

public class PremiumUser extends Users {
    
    private String cardNumber;
    private String securityCode;


    public PremiumUser(String name, String id, GregorianCalendar registrationDate, String cardNumber, String securityCode) {
        super(name, id, registrationDate, cardNumber, securityCode);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
}
