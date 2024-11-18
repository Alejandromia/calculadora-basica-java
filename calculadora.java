import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Modulo");
            System.out.println("6. Potencia");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        System.out.println("Resultado de la suma: " + sumar(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado de la resta: " + restar(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Resultado de la división: " + dividir(num1, num2));
                        } else {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                        break;
                    case 5:
                        if (num2 != 0) 
                        {
                        System.out.println("El mmódulo de " + num1 + " % " + num2 + " es: " + modulo(num1, num2));
                        } 
                        else 
                        {
                            System.out.println("Error: No se puede hacer el modulo de cero.");  
                        }
                        break;
                    case 6:
                        if (num1 != 0) 
                        {
                        System.out.println(num1 + " elevado a " + num2 + " es: " + potencia(num1, num2));
                        } 
                        else 
                        {
                            System.out.println("Error: La potencia de 0 da como resultado tambien 0.");  
                        }
                        break;
                }
            } else if (opcion == 6) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }

        scanner.close();
    }

    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
    public static double modulo(double a, double b) { return a % b; }
    public static double potencia(double a, double b) { return Math.pow(a, b); }
}
