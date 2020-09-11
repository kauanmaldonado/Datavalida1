import java.util.Scanner;

public class mess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dia : ");
        int mes = input.nextInt();

        if (mes > 0 && mes < 13) {
            System.out.println("escreva o ano");
            if (mes < 1 && mes > 12) {
                System.out.println("escreva uma data valida");
            }

    }
}
