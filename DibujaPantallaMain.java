package tareaunidad13;

import java.util.Scanner;

public class DibujaPantallaMain {
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        Scanner scanner = new Scanner(System.in);
        char opcion;
        do {
            System.out.println("Menú:");
            System.out.println("a. Añadir figura");
            System.out.println("b. Modificar carácter");
            System.out.println("c. Mostrar pantalla");
            System.out.println("d. Área de la pantalla");
            System.out.println("e. Listar figuras");
            System.out.println("q. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextLine().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("¿Qué figura desea incluir? (r/t)");
                    char figura = scanner.nextLine().charAt(0);
                    if (figura == 'r') {
                        System.out.print("Ingrese la base del rectángulo: ");
                        int base = scanner.nextInt();
                        System.out.print("Ingrese la altura del rectángulo: ");
                        int altura = scanner.nextInt();
                        scanner.nextLine(); 
                        Rectangulo rectangulo = new Rectangulo(base, altura, figura);
                        pantalla.anadeFigura(rectangulo);
                    } else if (figura == 't') {
                        System.out.print("Ingrese el lado del triángulo: ");
                        int lado = scanner.nextInt();
                        scanner.nextLine(); 
                        Triangulo triangulo = new Triangulo(lado, figura);
                        pantalla.anadeFigura(triangulo);
                    } else {
                        System.out.println("Figura no válida.");
                    }
                    break;
                case 'b':
                    System.out.print("Ingrese un nuevo carácter para todas las figuras: ");
                    char caracter = scanner.nextLine().charAt(0);
                    pantalla.modificaFigura(caracter);
                    break;
                case 'c':
                    pantalla.muestraPantalla();
                    break;
                case 'd':
                    int areaTotal = pantalla.areaPantalla();
                    System.out.println("Área total de la pantalla: " + areaTotal);
                    break;
                case 'e':
                    pantalla.listaFiguras();
                    break;
                case 'q':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 'q');
    }
}
