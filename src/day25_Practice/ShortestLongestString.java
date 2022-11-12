package day25_Practice;

public class ShortestLongestString {
    public static void main(String[] args) {

        // Longest string

        String s = "Hello this is Cybertek School";
        String[] arr = s.split(" ");
        int longest = arr[0].length();

        for (String each : arr){
            if (each.length()>longest){
                longest=each.length();
            }
        }
        System.out.println("Maximum index: " + longest);

        for (String each1 : arr){
            if (longest==each1.length()){
                System.out.println(each1);
            }
        }


        // 2. yol ---  Shortest string

        String[] names = {"Anam", "Nicholas", "Amir", "Nurmamet", "Ali", "Joe"};

        int minLength = names[0].length(); // 4

        for (int i = 0; i<=names.length-1; i++){ // to find out the min lenhth of the string in array
            int l = names[i].length(); // 4 8 4 8

            if (l<minLength){
                minLength = l;
            }
        }
        System.out.println(minLength);

        for (int i=0; i<=names.length-1; i++){ // to see how many strings lengths in the array is max

            if (names[i].length() == minLength ){
                System.out.println( names[i] );
            }

        }
    }

}
