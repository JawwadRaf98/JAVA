
import javax.swing.*;
import java.util.*;
import java.io.*;

public class AddressBook {

    ArrayList<PersonInfo> persons;

    public AddressBook() {
        persons = new ArrayList<PersonInfo>();
        loadContact();
    }

    public void addPerson() {
        String name = JOptionPane.showInputDialog("Enter Name : ");
        String address = JOptionPane.showInputDialog("Enter Address : ");
        String phone = JOptionPane.showInputDialog("Enter Phone Number : ");

        PersonInfo p = new PersonInfo(name, address, phone);

        persons.add(p);
    }

    public void searchPerson(String n) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.name)) {
                p.print();
            }
        }
    }

    public void deletePerson(String n) {
        for (int i = 0; i < persons.size(); i++) {
            PersonInfo p = (PersonInfo) persons.get(i);
            if (n.equals(p.name)) {
                persons.remove(i);
            }
        }
    }

    public void loadContact() {
        String splitList[] = null;
        String name, address, phone;
        try {
            FileReader fr = new FileReader("contact.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                splitList = line.split(",");
                name = splitList[0];
                address = splitList[1];
                phone = splitList[2];

                PersonInfo p = new PersonInfo(name, address, phone);

                persons.add(p);

                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

    public void saveContact(){
            try{
                PersonInfo p;
                String line = null;
                FileWriter fr = new FileWriter("contact.txt");
                PrintWriter  pw = new PrintWriter(fr);

                for(int i=0;i<persons.size();i++){
                    p  =(PersonInfo)persons.get(i);
                    line = p.name+","+p.address+","+p.phoneNum;
                    pw.println(line);   
                    }
                    pw.flush();
                    pw.close();
                    fr.close();
                }
                catch (IOException ex) {
                    System.out.println(ex);
                }
            
        }

}
