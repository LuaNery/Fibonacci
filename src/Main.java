import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = leitor.nextInt();

        if (verificarFibonacci(numero)) {
            System.out.println(numero + " Pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " Não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificarFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }

        int x = 0;
        int y = 1;

        while (y <= numero) {
            if (y == numero) {
                return true;
            }

            int temp = x + y;
            x = y;
            y = temp;
        }

        return false;
    }
}
