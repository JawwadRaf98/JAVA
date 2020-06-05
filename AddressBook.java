

import javax.swing.*;
import java.util.*;

public class AddressBook {
    
    ArrayList<PersonInfo> persons;

    public AddressBook(){
        persons = new  ArrayList<PersonInfo>();

    }

    public void addPerson(){
        String name = JOptionPane.showInputDialog("Enter Name : ");
        String address = JOptionPane.showInputDialog("Enter Address : ");
        String phone = JOptionPane.showInputDialog("Enter Phone Number : ");

        PersonInfo p = new PersonInfo(name, address, phone);

        persons.add(p); 
    }

    public void searchPerson(String n){
        for(int i=0;i<persons.size();i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(n.equals(p.name)){
                p.print();
            }
        }
    }

    public void deletePerson(String n){
        for(int i=0;i<persons.size();i++){
            PersonInfo p = (PersonInfo)persons.get(i);
            if(n.equals(p.name)){
                persons.remove(i);
            }
        }
    }
}