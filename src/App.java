import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
       
        Product[] products = {
                new Product(name: "Laptop", cantidad: 20),
                new Product(name: "Smartphone", cantidad: 25),
                new Product(name: "Tablet", cantidad: 10),
                new Product(name: "Monitor", cantidad: 5),
                new Product(name: "Keyboard", cantidad: 15)

    };

    BusquedaBinaria bBinaria = new BusquedaBinaria();

    int res = bBinaria.findByName(products, nombre: "lapto");

    if (res >= 0) {

        System.out.println("Entre en pos = " + res);

    } else {

        System.out.println(x: "No se encontro");

    }
        }
    }

