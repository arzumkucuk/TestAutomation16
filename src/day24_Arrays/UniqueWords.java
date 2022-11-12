package day24_Arrays;

public class UniqueWords {

    public static void main(String[] args) {

        String[] words = {"C#", "C#", "Java", "Phyton", "Phyton", "C++"};

        for (String each : words){
            int count=0;

            for (String unique : words) {
                if (each.equals(unique)) {
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }


    }
}
