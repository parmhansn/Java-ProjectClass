public class Project{

    private String name;
    private String description;


    public Project(String name){
        //constructor
    }

    public Project(String name, String description){
        //constructor
    }

    public Project(){
        //this is a constructor
    }

    public String elevatorPitch() {
        //this is a method because it has a public string, it's a method of the Project class. 
        return(name + ":" + description);
    }
    
    //getter 
    public String getName(){
        return name;
    }
    //setter
    public void setName(String pname){
        this.name = pname;
    }

    //getter
    public String getDescription(){
        return description;
    }

    //setter
    public void setDescription(String pdescription){
        this.description = pdescription;
    }

    
} 