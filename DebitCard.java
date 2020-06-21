
package bc180408671;

/**
 *
 * @author Jawwad
 */
public class DebitCard {
    
    private int id;
    private String userName;
    private String cardNo;
    private int pinCode;
    private long balance;
    
    //Default Constructor
    public DebitCard(){
        this.id = 0;
        this.userName = null;
        this.cardNo = null;
        this.pinCode = 0;
        this.balance = 0;
    }
    //Parameterize Constructor
    public DebitCard(int id, String userName, String cardNo, int pinCode, long balance){
        this.id = id;
        this.userName = userName;
        this.cardNo = cardNo;
        this.pinCode = pinCode;
        this.balance = balance;
    }
    
    //copy constructor
     public DebitCard(DebitCard card){
        this.id = card.id;
        this.userName = card.userName;
        this.cardNo = card.cardNo;
        this.pinCode = card.pinCode;
        this.balance = card.balance;
    }
    
     //Setter Function
     public void setId(int i){
         this.id = i;
     }
    public void setUserName(String un){
         this.userName = un;
     }
    public void setCardNo(String c){
         this.cardNo = c;
     }
    public void setPinCode(int p){
        this.pinCode = p;
    }
    public void setBalance(long b){
        this.balance = b;
    }
    
    //getter Functions
    public int getId(){
        return this.id;
    }
    public String getUserName(){
        return this.userName;
    }
    public String getCardNo(){
       return this.cardNo;
    }
    public int getPinCode(){
        return this.pinCode;
    }
    public long getBalance(){
        return this.balance;
    }
}