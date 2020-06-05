public class Teacher extends Employee {
    
    private String qualification;

    //default Constructor
    Teacher(){
        qualification = "";
    }

    //parameterize
    Teacher(int id, String name , String qualification){
        //passing to super class
        super(id,name);
        this.qualification = qualification;
    }
    // set qualification
    public void setQualification(String qualification){
        this.qualification = qualification;
    }

    // get qualification
    public String getQualification(){
        return qualification;
    }

    //overrinding dispaly methode of Employye
    public void display(){
        super.display();
        System.out.println("Qualification : "+qualification);
    }

}