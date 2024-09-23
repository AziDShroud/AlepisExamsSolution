import java.util.ArrayList;
import java.util.List;

public class Demo {
    List<Developer> devs = new ArrayList<Developer>();
    List<ProjectLeader>PLs = new ArrayList<ProjectLeader>();
    List<Fields> Fs= new ArrayList<Fields>();

    public void work_now(Fields fields){

    }
    public void main(String[] args) {

        Developer dev1= new Developer("miyazaki","4674568");
        new Tester("gkek","6758565698").test(dev1.write_code());
        new ProjectLeader("giorghs","6655786875").manage(dev1);
        devs.add(dev1);

   }
}