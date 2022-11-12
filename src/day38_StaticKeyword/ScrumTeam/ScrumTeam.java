package day38_StaticKeyword.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersTeam =  new ArrayList<>();
    public ArrayList<Developer> developersTeam = new ArrayList<>();

    public static boolean hasSprint = true;
    public static boolean hasMeeting = true;

    public void setInfo(String PO, String BA, String SM){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

    }

    public void addTester(Tester tester){
        testersTeam.add(tester);
    }
    public void addTester (Tester[] testers){
        testersTeam.addAll(Arrays.asList(testers));
    }

    public void removeTester(String ID){ // unique oldugu icin ID adiyla cikarilir
        testersTeam.removeIf(p -> p.ID.equalsIgnoreCase(ID) );
    }

    public void addDeveloper(Developer developer){
        developersTeam.add(developer);
    }

    public void addDeveloper(Developer[] developer){
        developersTeam.addAll(Arrays.asList(developer));
    }

    public void removeDeveloper(String ID){
        developersTeam.removeIf(p->p.ID.equalsIgnoreCase(ID) );
    }

    public String toString() {
        return "ScrumTeam =" +
                " PO: '" + PO + '\'' +
                ", BA: '" + BA + '\'' +
                ", SM: '" + SM + '\'' +
                ", Total number of testersTeam= " + testersTeam.size() +
                ", Total number of developersTeam= " + developersTeam.size();
    }
}
