package org.ficha2902082.maven.parking.felipesanchez;

import org.ficha2902082.maven.parking.felipesanchez.entities.Cupo;
import org.ficha2902082.maven.parking.felipesanchez.entities.Registro;
import org.ficha2902082.maven.parking.felipesanchez.entities.TipoDocumento;

import org.ficha2902082.maven.parking.felipesanchez.entities.TipoVehiculo;
import java.util.List;
import java.util.ArrayList;
import java.time.*;


import org.ficha2902082.maven.parking.felipesanchez.entities.Carro;
import org.ficha2902082.maven.parking.felipesanchez.entities.Cliente;

public class Main {
    public static void main(String[] args) {
        
        //crear dos cupos 
        //Instanciar dos cupos :
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B' ,5.0 ,2.5);

        //Instanciar dos carros :
        Carro carrito1 = new Carro("ASJ 456" , "MOTO");
        Carro carrito2 = new Carro ("HKU 765" , "CAMIONETA");

        //Instanciar un cliente

        Cliente cli = new Cliente("Sara", "Araque", TipoDocumento.CC, 1145224072L, 3223812438L);

        //vincilar carros al cliente

        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("ERT 675", "CAMION");

        //Declara una lista de Registros

        List<Registro> misRegistros = new ArrayList<>();

        //Instanciar dos Registros E/S
        Registro registro1 = new Registro(
            LocalDate.of(2024 , Month.APRIL , 23) ,
            LocalTime.of(15 , 30 , 34) ,
            LocalDate.of(2024, Month.FEBRUARY, 1),
            LocalTime.of(6, 30, 23),
            50000.00,
            cli.misCarros.get(0),
            cupito1
        );

        Registro registro2 = new Registro(
            LocalDate.of(2024 , Month.DECEMBER , 31) ,
            LocalTime.of(20 , 10 , 50) ,
            LocalDate.of(2024, Month.JANUARY, 10),
            LocalTime.of(9, 40, 30),
            100000.00,
            cli.misCarros.get(1),
            cupito2
        );

        //vincular los registros  a la lista de registros

        misRegistros.add(registro1);
        misRegistros.add(registro2);

        //Recorrer la lista de registros
        for( Registro r : misRegistros){
            System.out.println("Placa: " +
                                r.carro.placa + "|" + 
                                "Cupo: " + 
                                r.cupo.letra + "|" +
                                "Valor: " +
                                r.valor + "|"+
                                "Fecha Inicio: " +
                                r.fechaInicio.toString() + "|" 
                                );

        }
       

            
    }


}