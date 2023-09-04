import java.util.Scanner;

public class MenuDeTemperaturas02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double op1;

        do {
            System.out.println("\nMenú de Temperaturas:");
            System.out.println("1. Celcius a Farenheit");
            System.out.println("2. Celcius a Kelvin");
            System.out.println("3. Celcius a Rankine ");
            System.out.println("4. Farenheit a Celcius");
            System.out.println("5. Kelvin a Celcius");
            System.out.println("6. Rankie a Celcius");
            System.out.println("7. Salir del menu");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa la temperatura en Celcius: ");
                        op1 = scanner.nextDouble();
                        System.out.println("Resultado: " + ((op1 * 9 / 5) + 32) + "° Farenheit");
                        break;
                    case 2:
                        System.out.print("Ingresa la temperatura en Celcius: ");
                        op1 = scanner.nextDouble();
                        System.out.println("Resultado: " + (op1 + 273.15) + "° Kelvin");
                        break;
                    case 3:
                        System.out.print("Ingresa la temperatura en Celcius: ");
                        op1 = scanner.nextDouble();
                        System.out.println("Resultado: " + ((op1 * 9 / 5) + 491.67) + "° Rankine");
                        break;
                    case 4:
                        System.out.print("Ingresa la temperatura en Farenheit: ");
                        op1 = scanner.nextDouble();
                        System.out.println("Resultado: " + ((op1 - 32) * 5 / 9) + "° Celcius");
                        break;
                    case 5:
                        System.out.print("Ingresa la temperatura en Kelvin: ");
                        op1 = scanner.nextDouble();
                        System.out.println("Resultado: " + (op1 - 273.15) + "° Celcius");
                        break;
                    case 6:
                        System.out.print("Ingresa la temperatura en Rankie: ");
                        op1 = scanner.nextDouble();
                        System.out.println("Resultado: " + ((op1 - 491.67) * 5 / 9) + "° Celcius");
                        break;
                }
            } else if (opcion == 7) {
                System.out.println("¡Hasta luego!");
            } else {
                System.out.println("Opcion invalida. Por favor selecciona una opción valida.");
            }

        } while (opcion != 7);

        scanner.close();
    }
}