package day11_NestedIf_Switch;

public class Ternary_Practice1 {
    public static void main(String[] args) {

        // second task: "can vote" or "cannot vote"

        String citizen="USA";
        int age=28;
        boolean eligibleVote = age>=18 && citizen=="USA";

        String result = "";

        if (eligibleVote){
            result="Can vote";
        }else{
            result="Cannot vote";
        }
        System.out.println(result);

        String result2 = (age>=18 && citizen=="USA") ? "Can vote" : "Cannot vote";
        System.out.println(result2);

        System.out.println("=======================================");

        int n1=100;
        int n2=200;

        String r = (n1==n2) ? "Equal" : "Not equal";
        // "equal" or "not equal"


        System.out.println(r);
    }
}
