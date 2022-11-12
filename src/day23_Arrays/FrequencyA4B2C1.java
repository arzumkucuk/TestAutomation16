package day23_Arrays;

public class FrequencyA4B2C1 {

    public static void main(String[] args) {

        String str = "BBCCSDD";
        String result = "";

        for (int i=0; i<= str.length()-1; i++) {

            String ch = ""+ str.charAt(i);
            int count = 0;

            for (int j = 0; j <= str.length() - 1; j ++) {
                String eachChar =""+ str.charAt(j);
                if (ch.equals(eachChar)) {
                    count++;
                }
            }
              if ( count > 1){       //  SADECE UNIQUE OLANLARI YAZMAK ICIN count == 1 YAZARIZ
             //   result += ch;      // SADECE DUBLICATELERI YAZDIRMAK ICIN==>  count > 1 YAZARIZ
                  if (!result.contains(ch)){  // DUBLICATE OLANLARI TEK TEK YAZABILMEK ICIN BU SEKILDE YAPILIR
                      result+=ch;
                  }
            }
            //if (!result.contains(""+ ch)) { // DUBLICATELERI VE KACAR TANE OLDUKLARINI YAZAR A2B2C2 GIBI
            //    result += ""+ch + count;
            //}
        }

        System.out.println(result);


    }
}
