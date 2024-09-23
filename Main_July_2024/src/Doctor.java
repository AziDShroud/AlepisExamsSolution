import java.util.ArrayList;

public class Doctor extends Personnel implements ICure{
   public Doctor(int AMKA , String department , String fullname ){
       super.AMKA=AMKA;
       super.department=department;
       super.fullname=fullname;
   }
   ArrayList<String> Patients = new ArrayList<String>();
   void addPatient(String patient){
       Patients.add(patient);
       System.out.println("added successfully");
   }
   void removePatient(String patient){
       Patients.remove(patient);
       System.out.println("removed successfully");
   }


    @Override
    public String toString() {
        return String.format("Όνομα: %s\nAMKA: %s", super.fullname, super.AMKA);
    }

    @Override
    public void cure(){
        System.out.println("Medicine was prescribed");
    }
}
