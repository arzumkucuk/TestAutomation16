package day29_Methods;

public class MethodsWithoutParameters {

    public static void main(String[] args) {

        printHello5Times();
        System.out.println("Muhtar");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

        MethodsWithoutParameters.printHello5Times();

        System.out.print("Even Numbers: ");
        MethodsWithoutParameters2.printEvenNumber1to100();   // diger classtan buraya cekip yazbailiyoruz
        System.out.print("Odd Numbers: ");
        MethodsWithoutParameters2.printOddNumbers1to100();
    }
    // AcsessModifier specifer      returnTYPE    MethodNAme (Parameter){  }
    public  static  void printHello5Times() {

        for (int i=0; i<5; i++) {
            System.out.println("Hello");
        }

    }








}

/*
            step1: print hello 5 times (for loop)
			step2: print your name
			step3: print hello 5 times (for loop)
			step4: print your school name
			step5: print hello 5 times (for loop)
 */