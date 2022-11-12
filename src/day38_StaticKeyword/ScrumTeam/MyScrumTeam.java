package day38_StaticKeyword.ScrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam  {

    public static void main(String[] args) {

        Developer dev1 = new Developer();
        Developer dev2 = new Developer();
        Developer dev3 = new Developer();
        Developer dev4 = new Developer();
        dev1.setInfo("Bektemir","K-01","Full stack Developer","amazon", 160000,'M');
        dev2.setInfo("Nikola","Y-821","Software Developer","windows", 165000,'F');
        dev3.setInfo("Muhtar","T=234","Full stack Developer","", 160000,'M');
        dev4.setInfo("Ian","L-02","Developer","CVS pharmacy", 160000,'M');

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        tester1.setInfo("Adnan","0005", "Tester","Cybertek",130000,'M');
        tester2.setInfo("Dean","0006", "Tester","Cybertek",130000,'M');
        tester3.setInfo("Jair","0007", "Tester","Cybertek",130000,'M');

        Tester[] testers = {tester2,tester3};
        Developer[] developers = {dev1,dev2,dev3};

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.setInfo("Yalcin","Bektemir","Elvira");
        scrum1.addTester(tester1);
        scrum1.addTester(testers);
        scrum1.addDeveloper(developers);

        System.out.println(scrum1);

        for (Developer each : scrum1.developersTeam){
            System.out.println(each);
        }

        for (Tester each : scrum1.testersTeam){
            System.out.println(each);
        }
        System.out.println("=======================================================");

        Tester tester4 = new Tester();
        Tester tester5 = new Tester();
        tester4.setInfo("Asuman","GR-24", "SDET","JavaHolics",110000,'F');
        tester5.setInfo("Ercan","GR-25", "SDET","Cybertek",120000,'M');

        Developer dev5= new Developer();
        Developer dev6= new Developer();
        dev5.setInfo("Ali","0001","Full-Stack Developer","Apple", 165000,'M');
        dev6.setInfo("Eren","0023","Software Developer","Tesla", 175000,'M');


        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.addTester(tester4);
        scrum2.addTester(tester5);
        scrum2.addDeveloper(dev5);
        scrum2.addDeveloper(dev6);

        scrum2.setInfo("Lina","Daniel","Mayasa");
        System.out.println(scrum2);

        //scrum1.removeDeveloper("Y-821");
        //scrum1.removeTester("0006");

        System.out.println(scrum1);
        System.out.println(scrum2);

        System.out.println("=======================================================");

        ScrumTeam[] scrums = {scrum1,scrum2};
        // print the names & salary of every single testers

        for (ScrumTeam eachScrum : scrums) {
            for (Tester eachTester : eachScrum.testersTeam){
                System.out.println(eachTester.name + " : "+ eachTester.salary);
            }
        }

        System.out.println("=======================================================");

        int countDeveloper = 0;
        int countTester =0;

        for (ScrumTeam each : scrums ){
            countTester += each.testersTeam.size();
            countDeveloper += each.developersTeam.size();
        }

        System.out.println("Testers: "+countTester);
        System.out.println("Developer: "+countDeveloper);

        System.out.println("=========================================================");
        //ScrumTeam[] scrums = {scrum1,scrum2};

        scrums[0].SM = "Aihait";
        scrums[1].SM = "Aysel";

        System.out.println(scrums[0].SM );
        System.out.println(scrums[1].SM );

        System.out.println("=========================================================");

        ArrayList <ScrumTeam> scrumList = new ArrayList<>();

        scrumList.addAll(Arrays.asList(scrums) ) ;

        scrumList.addAll(Arrays.asList(scrums));

        for (ScrumTeam eachScrum : scrumList){
            for (Tester eachTester : eachScrum.testersTeam){
                System.out.println(eachTester.name+" : "+eachTester.salary);

            }
            for (Developer eachDeveloper : eachScrum.developersTeam){
                System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
            }
        }

        /*
        for (int i=0; i<= scrumList.size()-1; i++){
           ScrumTeam eachTeam = scrumList.get(i);

           for (int j=0; j<= eachTeam.testersTeam.size()-1; j++){ // j is index nm of tsters
               Tester eachTester = eachTeam.testersTeam.get(j);
               System.out.println(eachTester.name + " : "+ eachTester.salary);
           }

           for (int k=0; k<=eachTeam.developersTeam.size()-1; k++){ // k is index nm of developers
               Developer eachDeveloper = eachTeam.developersTeam.get(k);
               System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
           }
        }

         */







    }
}
