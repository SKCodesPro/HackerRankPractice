package org.example.functionalpractice;

public class PrinterFunctionalDriver {
    public void testPassLambda(PrinterInterface<Integer> printerInterface){
        System.out.println(printerInterface.print(2345));
    }
    public static void main(String[] args) {
        PrinterInterface <String> printerInterface = (String a) -> {
            return  a;
        };
        System.out.println(printerInterface.print("Hello World"));
        PrinterInterface <Integer> integerInterface = (Integer a) -> {
            return  a;
        };
        System.out.println(integerInterface.print(23));
        new PrinterFunctionalDriver().testPassLambda(integerInterface);

    }
}
