package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public static int somar(int num1, int num2){
        return num1 + num2;
    }
}
