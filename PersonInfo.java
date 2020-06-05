

import javax.swing.*;

public class PersonInfo {

    String name;
    String address; 
    String phoneNum;

    public PersonInfo(String name,String address, String phoneNum){
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }

    //displaying output in GUi
    public void print(){
        JOptionPane.showMessageDialog(null,"Name : "+name+"\nAddress : "+address+"\nPhone Number : "+phoneNum);
    }
}