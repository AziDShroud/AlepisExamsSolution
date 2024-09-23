import java.util.ArrayList;

public class Demo {
    static ArrayList<Outdoor> outdoorsports= new ArrayList<Outdoor>();
    static ArrayList<Indoor> indoorsports = new ArrayList<Indoor>();
    static ArrayList<Athlete> athletes= new ArrayList<Athlete>();
    public static void main(String[] args) {
        Outdoor dickfencing = new Outdoor("dickfencing",true ,false,2024,50);
        Outdoor orgy = new Outdoor("orgy",false,true,500,60);
        Indoor masturbation = new Indoor("masturbation",true,false,2001,56);
        Indoor hiddensport = new Indoor("hiddensport",true,true,2024,2.5f);
        outdoorsports.add(dickfencing);
        outdoorsports.add(orgy);
        indoorsports.add(masturbation);
        indoorsports.add(hiddensport);
        Athlete athlete1 = new Athlete("D",dickfencing);
        Athlete athlete2 = new Athlete("o neos oxtros",hiddensport);
        athletes.add(athlete1);
        athletes.add(athlete2);
        printAthletesSports(athletes);
    }

    static void printAthletesSports(ArrayList<Athlete> input){
        for (Athlete ath:athletes){
            System.out.println(String.format("%s , %f",ath.name,ath.SP.record));
        }
    }
}