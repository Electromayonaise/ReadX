package model;
import java.util.GregorianCalendar;

/**
 * Class that represents the premium users
 */
public class PremiumUser extends Users {
    
    private String cardNumber;
    private String securityCode;

    /**
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

    /**
     * Method that returns the user's credit card number
     * @return cardNumber User's credit card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Method that returns the user's credit card security code
     * @return securityCode User's credit card security code
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * Method that sets the user's credit card number
     * @param cardNumber User's credit card number
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Method that sets the user's credit card security code
     * @param securityCode User's credit card security code
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }
}
