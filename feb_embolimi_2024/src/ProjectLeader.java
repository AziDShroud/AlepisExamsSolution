public class ProjectLeader extends Fields {
    int employeenumber;
    public ProjectLeader(String name , String AFM){
        super.AFM= AFM;
        super.name= name;
    }
    public void manage(Developer d){
        System.out.println(String.format(" %s Do the thing!",d.name));
    }
}
