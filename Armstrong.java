import java.util.*;

public class Armstrong {
    int soma_do_cubo = 0, a, temp;
    int numero = 153;
 
    public void CalcularArmstrong(int soma_do_cubo,int a, int temp,int numero) {
        temp = numero;
        while (numero > 0) {
            a = numero % 10;
            numero = numero / 10;
            soma_do_cubo = soma_do_cubo + (a*a*a);
        }
        if (temp == soma_do_cubo) {
            System.out.println(temp + " é um numero narcisista!");
        }else{
            System.out.println(temp + " não é um número narcisista!");
        }

    }
}
