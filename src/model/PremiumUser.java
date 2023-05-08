package model;
import java.util.GregorianCalendar;

public class PremiumUser extends Users {
    
    private String cardNumber;
    private String securityCode;

    /*
     * Constructor method for the PremiumUser class
     * @param name User's name
     * @param id User's id
     * @param registrationDate User's registration date
     * @param cardNumber User's credit card number
     * @param securityCode User's credit card security code
     */
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
