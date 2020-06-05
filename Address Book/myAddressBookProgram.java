

import javax.swing.*;

public class myAddressBookProgram {

    public static void main(String[] args) {
        AddressBook ad = new AddressBook();

        String name, input;
        int caseCounter;

        while(true){
            JOptionPane.showMessageDialog(null,"Welcome To My Adress Book Application\n");
            input = JOptionPane.showInputDialog("Enter 1 to add\nEnter 2 to Search\nEnter 3 to delete\nEnter 4 to exit");

            caseCounter = Integer.parseInt(input);

            switch(caseCounter){
                case 1 :
                    ad.addPerson();
                    break;

                case 2:
                    name = JOptionPane.showInputDialog("Please Enter the name :");
                    ad.searchPerson(name);
                    break;

                case 3:
                    name = JOptionPane.showInputDialog("Please Enter the name :");
                    ad.deletePerson(name);
                    break;

                case 4:
                    System.exit(0);
            }


        }
    }

}