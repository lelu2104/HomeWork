package HW5;

public class Operations {


    public static Double addition(Double a, Double b){
        if (a == null) {
            System.out.println("Empty object");
        }
        return a + b;
    }

    public static double subtraction(double a, double b){
        return a - b;
    }

    public static double multiplication(double a, double b){
        return a * b;
    }

    public static double division(double a, double b){
        if (b == 0){
            System.out.println("You cannot divide on zero");
            return 0;
        } else
            return a/b;
    }
}
