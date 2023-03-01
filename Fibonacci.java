import java.util.*;


public class Fibonacci {
    int numero_1 = 0, numero_2 = 1, numero_3, i, conta = 5;
    
    public void CalcularFibonacci(int numero_1,int numero_2,int numero_3,int i,int conta) {
        //Printando 0 e 1!
        System.out.println(numero_1 + numero_2);

        //0 e 1 já foram printados então o loop vai começar no 2!
        for(i = 2; i < conta; ++i){
            numero_3 = numero_1 + numero_2;
            System.out.println(" " + numero_3);
            numero_1 = numero_2;
            numero_2 = numero_3;
        }
    }
}
