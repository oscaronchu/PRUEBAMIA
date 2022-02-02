/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejrepasoprogramacion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dam
 */
public class EjRepasoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, cargo;
        float sueldo;
        Trabajador mayor= new Trabajador();
        int total=0;
        TipoTrabajador bajo = new TipoTrabajador();
        TipoTrabajador mediano = new TipoTrabajador();
        TipoTrabajador alto = new TipoTrabajador();
     cargo = pedirString("cargo");
     while(cargo.compareToIgnoreCase("fin")!=0){
         nombre=pedirString("nombre");
         sueldo=pedirNumero("sueldo");
         if(sueldo>mayor.getSueldo()){
             mayor.actualizar(nombre,cargo,sueldo);
         }
         if(sueldo<1000){
             bajo.ActualizarTrabajadores(sueldo);
         }else if (sueldo<2000){
                 mediano.ActualizarTrabajadores(sueldo);
         }else{
                 alto.ActualizarTrabajadores(sueldo);
                 }
         cargo=pedirString("cargo");
     }
      total=bajo.getNtra()+mediano.getNtra()+alto.getNtra();
      
     
      if(total==0){
          System.out.println("sin datos");
      }else{
          System.out.println("\n\t Informe de trabajadores");
          System.out.println("\n\t Nombre y cargo del trabajador con mayor sueldo" + mayor.getNombre()+ "\t"+ mayor.getCargo());
          System.out.println("\n\t La media de el sueldo de los trabajadores es:" + bajo.CalcularSueldoMedio()+"\t" + mediano.CalcularSueldoMedio()+"\t" + alto.CalcularSueldoMedio());
          System.out.println("\n Trabajadores con sueldo \t Total \t sueldo medio \t porcentaje" );
          System.out.println("\n\t Hasta 1000$\t" +bajo.getNtra()+"\t\t\t" + bajo.CalcularSueldoMedio()+"\t\t" + bajo.CalculoPorcentaje(total) );
          System.out.println("\n\t Hasta 2000$\t" +mediano.getNtra()+"\t\t\t"+ mediano.CalcularSueldoMedio()+"\t\t"+ mediano.CalculoPorcentaje(total)  );
          System.out.println("\n\t Mas de 2000$\t" +alto.getNtra()+"\t\t\t" + alto.CalcularSueldoMedio()+"\t\t" + alto.CalculoPorcentaje(total) );       
         }
          
    }
    private static String pedirString(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        String dato;
        System.out.println(mensaje);
        dato = entrada.nextLine();
        while (dato.equals("")) {
            System.out.println("Dato requerido");
            dato = entrada.nextLine();
        }
        return dato;
    }

    private static float pedirNumero(String mensaje) {
        Float dato = 0f;
        boolean estado = true;
        Scanner entrada = new Scanner(System.in);
        while (estado) {
            try {
                System.out.println(mensaje);
                dato = entrada.nextFloat();
                if (dato >= 0) {
                    estado = false;
                } else {
                    System.out.println("dato incorrecto");
                }
            } catch (InputMismatchException ex) {
                System.out.println("error");
                entrada.nextLine();
            }
        }
        return dato;
    }
}
