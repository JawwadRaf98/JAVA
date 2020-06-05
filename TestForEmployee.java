public class TestForEmployee {
    public static void main(String args[]){
        System.out.println("\nWelcome to Employee Program\n");

        Employee e = new Employee(10,"jawwad");
        Teacher t = new Teacher(20 , "Ahmed", "BSSE");

        System.out.println("\nDiplay From Employee\n");
        e.display();

        System.out.println("\nDiplay From Teacher\n");
        t.display();

        t.setQualification("BSCS");

        System.out.println("\nDiplay From Teacher After Changing Qualification\n");
        t.display();

    }
    
}