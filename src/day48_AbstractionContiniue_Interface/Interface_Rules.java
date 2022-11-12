package day48_AbstractionContiniue_Interface;

public interface Interface_Rules {

    int a = 100; // public static final by default

    // static {}

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Interface_Rules.a);

        //  a = 100; by default it's final
    }

    void method2();

    public default void m(){

    }



}

/*
Interface: cannot have objects
What we can have:
        variables: public static and final by default
        methods: abstract method
                 static methods
                 default methods

    what we cannot have:
    constructor
    instance methods
    instance variables
    blocks

    what we need interface:
    A class can extend one class
    A class can extend multiple interfaces

    Abst

 */
