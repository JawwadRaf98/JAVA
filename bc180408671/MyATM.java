
import javax.swing.*;

public class MyATM {

    // objects of Account & fileHandler
    Database db;

    // default constructor
    public MyATM() {
        db = new Database();
    }

    public void loginGui() {

        String cardNumber;
        int cardPin;
        boolean checkVariable = true;

        while (checkVariable) {
            cardNumber = JOptionPane.showInputDialog(null, "Welcome to My ATM Services\nEnter Your Card Number.","MY ATM SERVICE", JOptionPane.INFORMATION_MESSAGE);

            cardPin = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Pin Code.", "MY ATM SERVICE", JOptionPane.INFORMATION_MESSAGE));

            db.loadDatabase();

            if (cardNumber.equals(db.cardNumber) && cardPin == db.cardPin) {
                JOptionPane.showMessageDialog(null, "Successfully Logged In", "Congratulation", JOptionPane.INFORMATION_MESSAGE);
                servicesGui();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Wrong card number or pin number.\n Try again with correct card number and pin", "Error", JOptionPane.ERROR_MESSAGE);
                checkVariable = false;
            }
        }

    }

    public void servicesGui() {
        while (true) {
            
            try{
                int choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Please enter\n1 for 'Deposite Amount'\n2 for 'Withdraw Cash'\n3 for 'Check Balance'\n4 for 'Exit the Program'",
                    "MY ATM SERVICE", JOptionPane.INFORMATION_MESSAGE));
                switch(choice){
                    case 1:
                        depositAmount();
                        break;
                    case 2:
                        withdrawAmount();
                        break;
                    case 3:
                        checkBalance();
                        break;
                    case 4:
                        developerInfo();
                        System.exit(0);
                    default:
                    JOptionPane.showMessageDialog(null,"Sorry ! Invalid choice ", "Error! ", JOptionPane.ERROR_MESSAGE);     
                }
            }
            catch(NumberFormatException num){
                System.out.println(num);
                JOptionPane.showMessageDialog(null, "Invalid format","Error", JOptionPane.ERROR_MESSAGE);
                servicesGui();
            }
        }

    }

    public void developerInfo() {
        JOptionPane.showMessageDialog(null, "Developed By\nName: Jawwad Rafique Ahmed\nID: BC180408671", "Developer Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public void depositAmount(){

        long depAmount = Long.parseLong(JOptionPane.showInputDialog(null, "Please enter money to deposit\n(Amount must be in multiple of 500 and upto maximum of Rs. 25000/- per transaction.)", "Deposit Amount", JOptionPane.INFORMATION_MESSAGE));

        try{
            if((depAmount%500 == 0)&&(depAmount<=25000)&&(depAmount>0)){
                long newAount = db.cardBalance + depAmount;
                db.saveDatabase(newAount);
                JOptionPane.showMessageDialog(null, depAmount+" has beed deposited successfully.", "Transaction Complete", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(depAmount>25000){
                JOptionPane.showMessageDialog(null, "You can not deposite more than Rs. 25000/-", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(depAmount<0){
                JOptionPane.showMessageDialog(null, "You can not deposite less than Rs. 0/-", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(depAmount%500 != 0){
                JOptionPane.showMessageDialog(null, "Please enter amount in multiple of 500", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid format","Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException num){
            System.out.println(num);
            JOptionPane.showMessageDialog(null, "Invalid format","Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void checkBalance(){

        db.loadDatabase();            
        JOptionPane.showMessageDialog(null, "Your current balance is: "+db.cardBalance, "Check Balance", JOptionPane.INFORMATION_MESSAGE);
        
    }

    public void withdrawAmount(){

        long withdrawAmount = Long.parseLong(JOptionPane.showInputDialog(null, "Please enter money to withdraw\n(Amount must be in multiple of 500 and upto maximum of Rs. 25000/- per transaction.)", "Withdrawn Cash", JOptionPane.INFORMATION_MESSAGE));

        try{
            db.loadDatabase();
            if((withdrawAmount%500 == 0)&&(withdrawAmount<=db.cardBalance)&&(withdrawAmount<=25000)&&(withdrawAmount>0)){
                long newAount = db.cardBalance - withdrawAmount;
                db.saveDatabase(newAount);
                JOptionPane.showMessageDialog(null, withdrawAmount+" has beed withdrawn successfully.", "Transaction Complete", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(withdrawAmount<0){
                JOptionPane.showMessageDialog(null, "You can not withdraw less than Rs.0/-", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(withdrawAmount>25000){
                JOptionPane.showMessageDialog(null, "You can not withdraw more than Rs. 25000/-", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(withdrawAmount%500 != 0){
                JOptionPane.showMessageDialog(null, "Please enter amount in multiple of 500", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(withdrawAmount>db.cardBalance){
                JOptionPane.showMessageDialog(null, "You current balance is : "+db.cardBalance+"\nYou can not withdraw : "+withdrawAmount, "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid format","Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(NumberFormatException num){
            JOptionPane.showMessageDialog(null, "Invalid format","Error", JOptionPane.ERROR_MESSAGE);
         //   servicesGui();
        }
    }

    public static void main(String[] args) {
        MyATM atm = new MyATM();

        atm.loginGui();

    }
}