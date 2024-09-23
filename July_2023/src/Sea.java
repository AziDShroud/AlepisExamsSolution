import java.util.ArrayList;

public class Sea extends Destination implements IPrint{
    ArrayList<String> sports= new ArrayList<String>();
    public Sea(String name, String municipality,double coordinates[],int cost){
        super(name,municipality,coordinates,cost);
    }
    @Override
    public void print(){
        System.out.println(String.format("%s",sports));
    }
}
