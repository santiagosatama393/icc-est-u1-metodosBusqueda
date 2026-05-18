import models.Persona;
// import models.Product;

public class BusquedaBinaria {

    // public void sortByName(Product[] products){
    //     for (int i = 0; i < products.length; i++) {

    //         boolean inter = false;

    //         for (int j = 0; j < products.length - i - 1; j++) {

    //             if (products[j].getName().compareTo(products[j + 1].getName()) > 0) {

    //                 Product aux = products[j];
    //                 products[j] = products[j + 1];
    //                 products[j + 1] = aux;

    //                 inter = true;
    //             }
    //         }

    //         if (!inter) {
    //             break;
    //                 }

    //     }

    // public int findByName(Product[] products, String name){
        
        

    //     int bajo = 0;
    //     int alto =products.length -1;

    //     while (bajo <= alto) {

    //         int c = (bajo + alto ) /2;

    //         if (products[c].getName().equals(name)){
    //             return c;
    //         }

    //     int comparacion = products[c].getName().compareTo(name);
    //     if (comparacion < 0 ){
    //         bajo = c +1;
    //     }else{
    //         alto = c -1;

    //     }  
        
    //         }
    //         return -1;
    // }
    // }


    public void ordenar(Persona[] personas) {

        for (int i = 0; i < personas.length - 1; i++) {

            boolean cambio = false;

            for (int j = 0; j < personas.length - i - 1; j++) {

                if (personas[j].getEdad() > personas[j + 1].getEdad()) {

                    Persona aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;

                    cambio = true;
                }
            }

            if (!cambio) {
                break;
            }
        }
    }
     public int buscar(Persona[] personas, int edadBuscar) {

        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {

            int centro = (bajo + alto) / 2;

            System.out.println(
                "bajo=" + bajo +
                " alto=" + alto +
                " centro=" + centro +
                " valorCentro=" + personas[centro].getEdad()
            );

            if (personas[centro].getEdad() == edadBuscar) {

                System.out.println("--> ENCONTRADO");
                return centro;

            } else if (personas[centro].getEdad() < edadBuscar) {

                System.out.println("--> DERECHA");
                bajo = centro + 1;

            } else {

                System.out.println("--> IZQUIERDA");
                alto = centro - 1;
            }
        }

        return -1;
 }    
} 

   