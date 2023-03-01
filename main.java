import java.util.*;

public class main{
public static void main(String[] args) {
    
    //Calculando Fibonacci:
    Fibonacci fibonacci = new Fibonacci();
    System.out.print("Fibonacci:");
    fibonacci.CalcularFibonacci(0, 1, 0, 0, 5);

    //Calculando número narcisista:
    Armstrong armstrong = new Armstrong();
    System.out.println("Armstrong:");
    armstrong.CalcularArmstrong(0, 0, 0, 153);
    
    //Calculando número primo:
    Primo primo = new Primo();
    System.out.println("Primo:");
    primo.CalcularPrimo(29, false);

    //Calculando Fatorial:
    Fatorial fatorial = new Fatorial();
    System.out.println("Fatorial:");
    fatorial.CalcularFatorial(0, 1, 8);
    }
}