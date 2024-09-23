public class Nurse extends Personnel implements  ICure{
    public Nurse(int AMKA, String fullname, String department){
        super.AMKA= AMKA;
        super.fullname=fullname;
        super.department=department;
    }
    String Schedule(){
        return "Monday-Friday : 9-5";
    }
    @Override
    public void cure() {
      System.out.println("Bandages were delivered");
    }

    @Override
    public String toString() {
        return String.format("Όνομα: %s\nAMKA: %s", super.fullname, super.AMKA);
    }
}
