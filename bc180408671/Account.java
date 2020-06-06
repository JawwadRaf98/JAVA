
public class Account {

    private String cardNumber;
    private int cardPin;
    private long cardBalance;

    //default Constructor
    public Account(){
        this.cardNumber = "";
        this.cardPin = 0;
        this.cardBalance = 0;
    }
    //parameterize Constructor
    public Account(String cNum, int cPin, long cBalance){
        this.cardNumber = cNum;
        this.cardPin = cPin;
        this.cardBalance = cBalance;
    }
    //copy Constructor
    public Account(Account acc){
        this.cardNumber = acc.cardNumber;
        this.cardPin = acc.cardPin;
        this.cardBalance = acc.cardBalance;
    }

    //setter function
    public void setCardNumber(String s){
        this.cardNumber = s;
    }
    public void setCardPin(int p ){
        this.cardPin = p;
    }
    public void setCardBalance(long b){
        this.cardBalance = b;
    }

    //getter functions
    public String getCardNumber(){
        return this.cardNumber ;
    }
    public int getCardPin(){
        return this.cardPin ;
    }
    public long getCardBalance(){
        return this.cardBalance ;
    }
}