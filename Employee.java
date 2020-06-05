public class Employee {

    protected  int id;
    protected String name;

    //parameterize constructor
    public Employee(int id, String name){

        this.id = id;
        this.name = name;

    }

    //default constructor
    public Employee(){

        this  (100,"not set");

    }
    
    //set ID
    public void setID(int id){

        this.id = id;

    }

    //set Name
    public void setName(String name){

        this.name = name;
    
    }

    //get ID
    public int getID(){

        return id;

    }

    //get name
    public String getName(){

        return name;

    }

    public void display(){
        System.out.println("Employee ID : "+id+"\nEmployee Name : "+name);
    }

}