import java.util.ArrayList;

public class Mountain extends Destination implements IPrint{
    ArrayList<String> activities= new ArrayList<String>();
    int altitude;
    public Mountain(String name, String municipality,double coordinates[],int cost,int altitude){
        super(name,municipality,coordinates,cost);
        this.altitude=altitude;
    }

    @Override
    public void print(){
        System.out.println(String.format("%s",activities));
    }
}
