package pruebaControlVersiones;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = pedirNumero(sc);

        if (num < 0) {
            System.out.println("ERROR: el número debe ser mayor o igual que 0.");
        } else {
            System.out.println("Has introducido el número: " + num);
            System.out.println("RESULTADO - El factorial del número " + num + " es " + factorialBucle(num));
        }

        sc.close();
    }

    private static int pedirNumero(Scanner sc) {
        int num;
        boolean valido;

        do {
            System.out.print("Introduce un número entero mayor o igual que 0: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                valido = true;
            } else {
                System.out.println("Entrada no válida. Introduce un entero.");
                sc.next(); // descarta la entrada incorrecta
                valido = false;
                num = -1;
            }
        } while (!valido);

        return num;
    }

    private static long factorialBucle(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}

