public class Destination {
    String name; String municipality;
    double coordinates[];
    int cost;
    public Destination(String name, String municipality,double []coordinates,int cost){
        this.name= name;
        this.coordinates=coordinates;
        this.cost=cost;
        this.municipality=municipality;
    }



    @Override

    public String toString(){
        return String.format("%s", name);
    }
}
