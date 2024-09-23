public class Athlete implements ICompete {
    String name;
    Sport SP;
    public Athlete(String name,
    Sport SP){
        this.name=name;
        this.SP=SP;
    }

   public Sport compete(){
        return SP;
   }
}
