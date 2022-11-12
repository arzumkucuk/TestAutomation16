package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {

        String[] words = {"C#", "C#", "Java", "Phyton", "Phyton", "C++"};

        for (String a:words){
            int count = 0;

            for (String b : words){
                if (a.equals(b)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(a);
            }
        }




    }
}
