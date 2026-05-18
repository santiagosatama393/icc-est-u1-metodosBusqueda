import models.Product;

public class BusquedaBinaria {

    public void sortByName(Product[] products){
        for (int i = 0; i < products.length; i++) {

            boolean inter = false;

            for (int j = 0; j < products.length - i - 1; j++) {

                if (products[j].getName().compareTo(products[j + 1].getName()) > 0) {

                    Product aux = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = aux;

                    inter = true;
                }
            }

            if (!inter) {
                break;
                    }

    }

    public int findByName(Product[] products, String name){
        
       

        int bajo = 0;
        int alto =products.length -1;

        while (bajo <= alto) {

            int c = (bajo + alto ) /2;

            if (products[c].getName().equals(name)){
                return c;
            }

        int comparacion = products[c].getName().compareTo(name);
        if (comparacion < 0 ){
            bajo = c +1;
        }else{
            alto = c -1;

        }  
        
         }
          return -1;
    }
}
