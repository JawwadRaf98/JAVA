import java.util.*;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> al= new ArrayList<Student>();

        Student s1 = new Student("Jawwad",1);
        Student s2 = new Student("Rafique",2);
        Student s3 = new Student("Ahmed",3);

        //add in array list

        al.add(s1);
        al.add(s2);
        al.add(s3);

        //checking emptiness

        boolean b = al.isEmpty();
        if(b == true){
            System.out.println("arrayList is empty\n");
        }
        else{
            int size = al.size();
            System.out.println("\nSize of Array List :"+size+"\n");
        }

        for(int i =0;i<al.size();i++){
            Student s = (Student) al.get(i);
            s.print();
        }
    }   
}