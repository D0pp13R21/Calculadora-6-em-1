import java.util.*;

public class Primo {
    int num = 29;
    boolean flag = false;
    public void CalcularPrimo(int num, boolean flag) {
        for(int i = 2; i <= num; ++i){
            if( num % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " é um número primo!");
        }else{
            System.out.println(num + " não é um número primo!");
        }
    }
}
