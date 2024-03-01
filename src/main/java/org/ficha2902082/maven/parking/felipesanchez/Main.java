package org.ficha2902082.maven.parking.felipesanchez;

import org.ficha2902082.maven.parking.felipesanchez.entities.Cupo;
import org.ficha2902082.maven.parking.felipesanchez.entities.Empleado;
import org.ficha2902082.maven.parking.felipesanchez.entities.Registro;
import org.ficha2902082.maven.parking.felipesanchez.entities.TipoDocumento;

import org.ficha2902082.maven.parking.felipesanchez.entities.TipoVehiculo;
import java.util.List;
import java.util.ArrayList;
import java.time.*;
import java.time.LocalDate;

import org.ficha2902082.maven.parking.felipesanchez.entities.Empleado;
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

        //Instanciar Empleado
        Empleado empleado1 = new Empleado();
        empleado1.codigo= 1L;
        empleado1.nombre="Andrey";
        

        Empleado empleado2 = new Empleado();
        empleado2.codigo = 2L;
        empleado2.nombre="Felipe";

        Empleado empleado3 = new Empleado();
        empleado3.codigo = 3L;
        empleado3.nombre = "Sergio";



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
            cupito1,empleado1);
        
        LocalDate fi1 = LocalDate.of(2023 , Month.DECEMBER , 24);

        LocalTime hi1 = LocalTime.of(11 , 32 , 00);

        LocalDate ff1 = LocalDate.of(2024 , Month.JANUARY , 3);

        LocalTime hf1 = LocalTime.of(12 , 32 , 00);

        Double valorR2 = 50000.0;

        Registro r2 = new Registro(fi1, hi1, ff1, hf1, valorR2, cli.misCarros.get(1), cupito2,empleado2);

        Registro registro2 = new Registro(
            LocalDate.of(2024 , Month.DECEMBER , 31) ,
            LocalTime.of(20 , 10 , 50) ,
            LocalDate.of(2024, Month.JANUARY, 10),
            LocalTime.of(9, 40, 30),
            100000.00,
            cli.misCarros.get(1),
            cupito2,empleado1
        );
        
        Registro r3 = new Registro(fi1,hi1,ff1,hf1,valorR2,cli.misCarros.get(1),cupito2,empleado3
        );
        Registro r4 = new Registro(fi1,hi1,ff1,hf1,valorR2,cli.misCarros.get(1),cupito2,empleado1
        );
        Registro r5 = new Registro(fi1,hi1,ff1,hf1,valorR2,cli.misCarros.get(1),cupito2,empleado2
        );



        //vincular los registros  a la lista de registros

        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(r2);
        misRegistros.add(r3);
        misRegistros.add(r4);
        misRegistros.add(r5);
        //Recorrer la lista de registros
        for( Registro r : misRegistros){
            System.out.println("Placa: " +
                                r.carro.placa + "|" + 
                                "Cupo: " + 
                                r.cupo.letra + "|" +
                                "Valor: " +
                                r.valor + "|"+
                                "Fecha Inicio: " +
                                r.fechaInicio.toString() + "|" +
                                "Fecha final:"+
                                r.fechaFin.toString()+"|" +
                                "hora Inicio:"+
                                r.horaInicio +"|" +
                                "Hora Final:"+
                                r.horaFin +"|" +
                                "Nombre emp:"+
                                r.empleado.nombre +"|"  +"Codigo emp:"+
                                r.empleado.codigo+"|" 
                                );
        }
    
    }
}