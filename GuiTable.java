import javax.swing.*;

public class GuiTable {
    public static void main(String[] args) {

        String numberInput = JOptionPane.showInputDialog("Enter Table Number!");
        int number =  Integer.parseInt(numberInput);

        String mutipleInput = JOptionPane.showInputDialog("Enter Table Limit!");
        int multiple =  Integer.parseInt(mutipleInput);
        if(multiple == 0){
            JOptionPane.showMessageDialog(null, "Zero");
        }
        else{
            for(int i = 1; i<=multiple;i++){
                JOptionPane.showMessageDialog(null, number+" X "+i+" = "+i*number+"\n");
            }
        }
    }
}