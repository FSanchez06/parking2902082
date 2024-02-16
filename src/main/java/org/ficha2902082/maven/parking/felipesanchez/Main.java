package org.ficha2902082.maven.parking.felipesanchez;
//importar dependencias
import org.ficha2902082.maven.parking.felipesanchez.entities.Carro;
import org.ficha2902082.maven.parking.felipesanchez.entities.Cliente;
//import org.ficha2902082.maven.parking.felipesanchez.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.felipesanchez.entities.TipoDocumento;
//import org.ficha2902082.maven.parking.felipesanchez.entities.TipoVehiculo;

public class Main {
    public static void main(String[] args) {
        //Crear dos instancias 
        //de la clase Carro
        Carro carrito1 = new Carro();
        carrito1.placa = "ASB 345";
        carrito1.tipoVehiculo = "CAMIONETA";

        Carro carrito2 = new Carro();
        carrito2.placa = "MVP 389";
        carrito2.tipoVehiculo = "TAXI";

        Cliente clientecito = new Cliente();
        clientecito.nombre = "Felipe";
        clientecito.apellidos = "Sanchez";
        clientecito.tipoDocumento 
            = TipoDocumento.CC;
        clientecito.numeroDocumento = 1145224072L;
        clientecito.celular = 3223812438L;

        //añadir carros al cliente 
        //invocar, llamar, ejecutar el metodo 
        //el metodo addCar
        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("ASD 456", "CAMIONETA");

        System.out.println("Cliente:");
        System.out.println("numeroDocumento:"+ clientecito.numeroDocumento);
        System.out.println("Vehiculo:");

        for (Carro c: clientecito.misCarros){
            System.out.println("placa:" + c.placa);
            System.out.println("tipo:" + c.tipoVehiculo);
            System.out.println("______________________________");
        }
            
    }


}