public class Sport {
    String name;
    boolean individual;
    boolean team;
    int year;
    float record;

    public Sport( String name , boolean individual , boolean team , int year , float record){
        this.individual= individual;
        this.record= record;
        this.name= name;
        this.team=team;
        this.year=year;
    }

}
