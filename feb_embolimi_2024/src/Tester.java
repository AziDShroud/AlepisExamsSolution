public class Tester extends Fields {
    public Tester(String name , String AFM){
        super.AFM= AFM;
        super.name= name;
    }

    public boolean test(String code){
        if (code == "drtudtyturtfr") {
            return true;
        }
       else {
           return false;
        }
    }
}
