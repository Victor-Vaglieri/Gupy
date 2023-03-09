import java.util.Scanner;

public class inverte {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("coloque a string: ");
        String texto = s.nextLine();
        for (int i = 0; i < texto.length(); i++){
            System.out.print(texto.charAt(texto.length()-i-1));
        }
        s.close();
    }
}
