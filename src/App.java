// import models.Product;

import models.Persona;

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

        Persona[] personas = {

            new Persona("Pablo", 4),
            new Persona("Maria", 5),
            new Persona("Juan", 18),
            new Persona("David", 60),
            new Persona("Mateo", 25),
            new Persona("Diego", 12),
            new Persona("Ana", 8),
            new Persona("Alicia", 9),
            new Persona("Jaime", 40)

        };

        BusquedaBinaria bb = new BusquedaBinaria();

        // ordenar edades
        bb.ordenar(personas);

        // mostrar edades ordenadas
        System.out.println("Edades ordenadas:");

        for (int i = 0; i < personas.length; i++) {

            System.out.print(personas[i].getEdad() + " | ");
        }

        System.out.println();

        // edad a buscar
        int buscar = 18;

        System.out.println("\nBuscando edad: " + buscar);

        int res = bb.buscar(personas, buscar);

        if (res >= 0) {

            System.out.println(
                "La persona con la edad " +
                buscar +
                " es " +
                personas[res].getNombre()
            );

        } else {

            System.out.println("No se encontro la edad");
        }
    }
}
 

