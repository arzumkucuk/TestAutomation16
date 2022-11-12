package day24_Arrays;

public class taskkk {
    public static void main(String[] args) {

        String s = "Bugun havaii'de hava cok guzel, north shore'a gidip mangal yapalim";
        String[] arr = s.split("");
        int count=0;

        for (String each : arr){
            if (each.contains("a")){
                count++;
            }
        }
        System.out.println(count);

    }
}
