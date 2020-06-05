import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Student> h = new HashMap<String,Student>();
        
        Student s1 = new Student("Jawwad",1);
        Student s2 = new Student("Rafique",2);
        Student s3 = new Student("Ahmed",3);

        //add in array list

        h.put("one",s1);
        h.put("two",s2);
        h.put("three",s3);
    
        boolean b = h.isEmpty();
        if(b == true){
            System.out.println("arrayList is empty\n");
        }
        else{
            int size = h.size();
            System.out.println("\nSize of Array List :"+size+"\n");
        }

        Student s = (Student) h.get("one");
        s.print();
    }
}