package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankOfAmerica {

    public static void main(String[] args) {

        String companyName = "Bank Of America";
        Employees[] employees = {
                new Employees(), //0
                new Employees(),
                new Employees(),
                new Employees(),
                new Employees(),
        };
        employees[0].setInfoEmplys("Arzum Kucuk", 'F', "Dev01","Developer","Bank of America",
                400_000, LocalDate.of(2022,8,6));
        employees[1].setInfoEmplys("Eren Kucuk", 'M',"dev02", "Developer", companyName, 450_000,
                LocalDate.now());
        employees[2].setInfoEmplys("Ruhi", 'M',"dev03", "BA", companyName, 350_000,
                LocalDate.now());
        employees[3].setInfoEmplys("Esma", 'F',"dev04", "SDET", companyName, 250_000,
                LocalDate.now());
        employees[4].setInfoEmplys("Asu", 'F',"dev05", "CEO", companyName, 150_000,
                LocalDate.now());

/*
        employees[0].getInfo();
        employees[1].getInfo();
        employees[2].getInfo();
        employees[3].getInfo();
        employees[4].getInfo();

 */

        for (Employees each : employees){
            each.getInfo(); // hepsini tek tek yazdirir
        }

        ArrayList<Employees> SDETsAndDev = new ArrayList<>(Arrays.asList(employees));

        SDETsAndDev.removeIf(p->!(p.jobTitle.equalsIgnoreCase("SDET") || p.jobTitle.equalsIgnoreCase("Developer")));
        // removes the employees IF job title of the employee is not SDET or  not Developer

        for (Employees each : SDETsAndDev) {
            System.out.println(each.name + " : " + each.jobTitle + ", $" + each.salary);
        }
            System.out.println("=====================================================================");

            ArrayList<Employees> richPeople = new ArrayList<>();
            richPeople.addAll(Arrays.asList(employees));
            // for (Employee each : employees) richPeople.add(each);

            richPeople.removeIf(p->p.salary<200000);

        System.out.println("===========================================================");

            double maxSalary = employees[0].salary; // assume that first employee' salary is max

            for (Employees each : employees){
               maxSalary = Math.max(maxSalary, each.salary );

            }
        System.out.println(maxSalary);








    }
}
