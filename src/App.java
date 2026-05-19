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

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de personas: ");
        int n = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[n];
            
        for (int i = 0; i < personas.length; i++) {

            System.out.println("\nIngrese Persona:");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            int edad;

            do {

                System.out.print("Edad: ");
                edad = sc.nextInt();

                if (edad < 0) {
                    System.out.println("La edad no puede ser negativa");
                }

            } while (edad < 0);

            sc.nextLine();

            personas[i] = new Persona(nombre, edad);
        }

        BusquedaBinaria bb = new BusquedaBinaria();

        bb.ordenar(personas);
        System.out.println("\nEdades ordenadas:");

        for (int i = 0; i < personas.length; i++) {

            System.out.print(personas[i].getEdad() + " | ");
        }

        // buscar edad
        System.out.print("\n\nIngrese edad a buscar: ");
        int buscar = sc.nextInt();

        int res = bb.buscar(personas, buscar);

        if (res >= 0) {

            System.out.println(
                "\nLa persona con la edad " +
                buscar +
                " es " +
                personas[res].getNombre()
            );

        } else {

            System.out.println("\nNo se encontro la edad");
        }

        sc.close();
    }
}
