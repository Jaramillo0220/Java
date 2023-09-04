import java.util.Scanner;

public class MeneDeOperacionesBasicas01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, potencia = 0, repeticion = 1;
        double op1, op2;

        do {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el primer numero: ");
                        op1 = scanner.nextDouble();
                        System.out.print("Ingresa el segundo numero: ");
                        op2 = scanner.nextDouble();
                        System.out.println("Resultado: " + (op1 + op2));
                        break;
                    case 2:
                        System.out.print("Ingresa el primer numero: ");
                        op1 = scanner.nextDouble();
                        System.out.print("Ingresa el segundo numero: ");
                        op2 = scanner.nextDouble();
                        System.out.println("Resultado: " + (op1 - op2));
                        break;
                    case 3:
                        System.out.print("Ingresa el primer numero: ");
                        op1 = scanner.nextDouble();
                        System.out.print("Ingresa el segundo numero: ");
                        op2 = scanner.nextDouble();
                        System.out.println("Resultado: " + (op1 * op2));
                        break;
                    case 4:
                        System.out.print("Ingresa el primer numero: ");
                        op1 = scanner.nextDouble();
                        System.out.print("Ingresa el segundo número: ");
                        op2 = scanner.nextDouble();

                        if (op2 != 0) {
                            System.out.println("Resultado: " + (op1 / op2));
                        } else {
                            System.out.println("No se puede dividir por cero.");
                        }
                        break;
                    case 5:
                        System.out.print("Ingresa el primer número: ");
                        op1 = scanner.nextDouble();
                        System.out.print("Ingresa el segundo numero: ");
                        op2 = scanner.nextDouble();
                        while (potencia < op2) {
                            potencia++;
                            repeticion = (int) (potencia * op1);
                        }
                        System.out.println("Resultado: " + (repeticion * op2));
                        break;
                }
            } else if (opcion == 6) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opcion invalida. Por favor selecciona una opción valida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}