import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("\nInforme o numero: ");
        int n = s.nextInt(), cont1 = 0, cont2 = 1,cont3 = 0;
        s.close();

        while (n > cont3){
            cont3 = cont1 + cont2;
            cont1 = cont2;
            cont2 = cont3;
            }
            if (n == cont3){
                System.out.println("está presente em fibonnaci");
            } else {
                System.out.println("não está presente em fibonnaci");
        }
        
    }
