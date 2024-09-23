import java.util.ArrayList;
import java.util.List;

public class Demo {
    static Personnel[] Personnels= new Personnel[4];

    public static void main(String[] args) {
        MedicalStaff Mycroft = new MedicalStaff(54766, "ophthalmology", "Mycroft Holmes", "MI6");
        Doctor Watson = new Doctor(34567, "medicine", "John H. Watson");
        Doctor tzanabetis = new Doctor(38358, "medicine", "tzanabetis K.");
        Nurse Hudson = new Nurse(57888, "M. Hudson", "secretary");
        Personnels[0] = Mycroft;
        Personnels[1] = Watson;
        Personnels[2] = tzanabetis;
        Personnels[3] = Hudson;

        System.out.println(findByDepartment("med"));
        Hudson.cure();
        Watson.cure();
        Watson.addPatient("Sherly");
        Watson.removePatient("Sherly");

    }

    static List<Personnel> findByDepartment(String keyword) {
        List<Personnel> Personnels1 = new ArrayList<>();
        for (int i = 0; i < Personnels.length; i++) {
            if (Personnels[i].department.contains(keyword)) {
                Personnels1.add(Personnels[i]);
            }
        }
        return Personnels1;

    }

}