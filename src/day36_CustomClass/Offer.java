package day36_CustomClass;

public class Offer {

    public String location, companyName;
    public double salary;
    public  String jobTitle;
    public boolean hasBenefit, isWFH, isFullTime;

    public void setInfo (String location, String companyName, double salary, String jobTitle, boolean hasBenefit, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName=companyName;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public void getInfo() {
        System.out.println("Company: "+companyName+"\nLocation: "+location+"\nSalary: $"+salary+"\nJobTitle: "+jobTitle+
                "\nHas Benefit: "+hasBenefit+"\nWork from home: "+isWFH+"\nis Full Time: "+isFullTime);

        System.out.println("==============================================================" +
                "");
    }
}
