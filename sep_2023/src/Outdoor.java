public class Outdoor extends Sport{
    public Outdoor(String name , boolean individual , boolean team , int year , float record){
        super(name ,  individual ,  team ,  year , record);
    }

    @Override
    public String toString(){
        if (individual && team) {
            return String.format("Αθλημα κλειστου χώρου με στοιχεια αθλήματος: %s και ομαδικο και ατομικο , %d, %f",name,year,record);
        } else if (individual) {
            return String.format("Αθλημα κλειστου χώρου με στοιχεια αθλήματος: %s , ατομικο , %d, %f",name,year,record);
        }
        else {
            return String.format("Αθλημα κλειστου χώρου με στοιχεια αθλήματος: %s , ομαδικο , %d, %f",name,year,record);
        }
    }

}
