import java.util.*;

public class Fatorial {
    int i, fatorial = 1;
    int n = 8;

    public void CalcularFatorial(int i, int fatorial, int n) {
        for( i = 1; i <= n; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial + " é o fatorial de " + n);
    }
}
