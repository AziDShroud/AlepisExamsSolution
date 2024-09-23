import java.util.ArrayList;
import java.util.List;

public class Demo {
    static ArrayList<Mountain> mountains= new ArrayList<Mountain>();
    static ArrayList<Sea> seas= new ArrayList<Sea>();
    public static void main(String[] args) {
        double []temp={2534.67,9876.43};
        double []temp1={2598.67,9056.43};
        double []bleh={2598.67,9056.43};
        Mountain Mount1= new Mountain("Olympus","dimos1", temp,76,3000);
        Mountain Mount2= new Mountain("Alpis","dimos9", temp1,96,1000);
        Sea sea1 = new Sea("Black","dimos5",bleh,67);
        Sea sea2 = new Sea("mediteranean","dimos56",bleh,45);
        mountains.add(Mount1);
        mountains.add(Mount2);
        seas.add(sea1);
        seas.add(sea2);
        int max=0;
        Mountain maxmount=null;
        for (Mountain m:mountains) {
            if (m.altitude>max) {
                max= m.altitude;
                maxmount= m;
            }
        }
        if (maxmount != null) {
            System.out.println(String.format("%s,%f",maxmount.name,maxmount.coordinates));
        }
        
    }

    static List<Destination> findByMunicipality(ArrayList<Destination> input, String municipality){
        List<Destination> dests = new ArrayList<Destination>();
        for (Destination inp:input) {
            if(inp.municipality==municipality){
                dests.add(inp);
            }
        }
        return  dests;
    }
}