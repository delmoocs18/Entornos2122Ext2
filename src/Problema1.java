import java.lang.reflect.Array;

public class Problema1 {

    private boolean esMultiploDe3(Integer n){
        return n % 3 == 0;
    }
    private boolean esMultiploDe5(Integer n){
        return n % 5 == 0;
    }
    private boolean esMultiploDe3y5(Integer n){
        return n %  5  == 0;
    }

    private static String devuelveNumeros(){
        String Fizz = esMultiploDe3();
        String Buzz = esMultiplode5();
        String FizzBuzz = esMultiplode3y5();
    }
}
