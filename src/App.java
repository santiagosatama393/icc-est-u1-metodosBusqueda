// import models.Product;

import models.Persona;
import java.util.Scanner;


public class App {
    // public static void main(String[] args) throws Exception {
       
    //     Product[] products = {
    //             new Product(name: "Laptop", cantidad: 20),
    //             new Product(name: "Smartphone", cantidad: 25),
    //             new Product(name: "Tablet", cantidad: 10),
    //             new Product(name: "Monitor", cantidad: 5),
    //             new Product(name: "Keyboard", cantidad: 15)

    // };

    // BusquedaBinaria bBinaria = new BusquedaBinaria();

    // int res = bBinaria.findByName(products, nombre: "lapto");

    // if (res >= 0) {

    //     System.out.println("Entre en pos = " + res);

    // } else {

    //     System.out.println(x: "No se encontro");

    // }
    //     }



    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n;

        System.out.print("Ingrese cantidad de personas: ");
        n = leer.nextInt();
        leer.nextLine();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nPersona " + (i + 1));

            System.out.print("Ingrese nombre: ");
            nombres[i] = leer.nextLine();

            System.out.print("Ingrese edad: ");
            edades[i] = leer.nextInt();
            leer.nextLine();
        }

        for (int i = 0; i < edades.length - 1; i++) {

            for (int j = 0; j < edades.length - 1; j++) {

                if (edades[j] > edades[j + 1]) {

                    int auxEdad = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = auxEdad;

                    String auxNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = auxNombre;
                }
            }
        }


        System.out.println("\nLista ordenada:");

        for (int i = 0; i < edades.length; i++) {
            System.out.println(nombres[i] + " - " + edades[i]);
        }

        System.out.print("\nIngrese la edad a buscar: ");
        int buscar = leer.nextInt();

        int bajo = 0;
        int alto = edades.length - 1;

        while (bajo <= alto) {

            int centro = (bajo + alto) / 2;

            
            for (int i = bajo; i <= alto; i++) {

                System.out.print(edades[i]);

                if (i < alto) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            System.out.print("bajo=" + bajo + "    ");
            System.out.print("alto=" + alto + "    ");
            System.out.print("centro=" + centro + "    ");
            System.out.print("valorCentro=" + edades[centro] + "    ");

            if (buscar > edades[centro]) {

                System.out.println("--> DERECHA");
                System.out.println();

                bajo = centro + 1;

            } else if (buscar < edades[centro]) {

                System.out.println("--> IZQUIERDA");
                System.out.println();

                alto = centro - 1;

            } else {

                System.out.println("--> ENCONTRADO");
                System.out.println();

                System.out.println("La persona con la edad "
                        + buscar + " es "
                        + nombres[centro]);

                break;
            }
        }

        leer.close();
    }
}
