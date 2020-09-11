import java.util.Scanner;

public class dia {
    public static void main(String[] args) {

    }
        Scanner input = new Scanner(System.in);
        System.out.println("Dia : ");
        int dia = input.nextInt();

        if (dia > 1 && dia < 31) {
            System.out.println("escreva o mês");

            }
            if (dia < 1 && dia > 31) {
                System.out.println("Escreva uma data valida");
            }

        }

    }


