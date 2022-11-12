package day35_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeerGetInfo {

    public static void main(String[] args) {

        Employees employees1 = new Employees();
        Employees employees2 = new Employees();
        Employees employees3 = new Employees();


        employees1.setInfoEmployeer("Arzum", 'F', "12346789", "H113", "Sofware Engineer",
                "Facebook", 150000.99);

        employees2.setInfoEmployeer("Eren", 'M', "12345567789", "H101", "QA",
                "Google", 200000);

        employees3.setInfoEmployeer("Ela", 'F', "2342352", "H233", "Nurse",
                "Kaiser", 82000);

        Employees[] employeers = {employees1,employees2,employees3};

        ArrayList<Employees> listgreaterthan100K = new ArrayList<>(Arrays.asList(employeers));


        listgreaterthan100K.removeIf(p-> p.salary <100000);

        for (Employees employees : listgreaterthan100K) {
            System.out.println(employees.name+" "+employees.jobTitles+" "+employees.salary);
        }


    }
}
