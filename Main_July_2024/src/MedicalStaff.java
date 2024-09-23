public class MedicalStaff extends Personnel{
    String office;
     public MedicalStaff(int AMKA, String department , String fullname, String office){
      this.office= office;
      super.AMKA=AMKA;
      super.fullname=fullname;
      super.department=department;
     };

    @Override
    public String toString() {
        return String.format("Όνομα: %s\nAMKA: %s\nΓραφείο %s", super.fullname, super.AMKA, this.office);
    }
}
