package syl.gen;

//@Author: Omkar Pisal

public class sylMain {
    public static void main(String[] args) {
        FacadeClass facadeClass = new FacadeClass();
        System.out.println("Call has been made to Facade Pattern");
        facadeClass.Builder();
        facadeClass.Prof();
        facadeClass.Create();


    }
}
