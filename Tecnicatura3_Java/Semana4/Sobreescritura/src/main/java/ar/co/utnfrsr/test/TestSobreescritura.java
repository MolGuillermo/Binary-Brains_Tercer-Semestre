package ar.co.utnfrsr.test;

import ar.co.utnfrsr.domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jose", 10000);
        imprimir(empleado1); //aplicamos polimorfirmo pasandole a un mismo metodo un tipo de dato
        //System.out.println("Empleado1 = "+empleado1.obtenerDetalles());
        empleado1 = new Gerente("Juan", 5000, "Sistemas");
        imprimir(empleado1);//aplicamos polimorfirmo pasandole a otro mismo metodo un tipo de dato diferente
        //System.out.println("Gerente1 = "+gerente1.obtenerDetalles());
    }

    public static void imprimir(Empleado empleado) { //la referencia que se recibe (empleado) es la apliación de herencia
        String detalles = empleado.obtenerDetalles();
        System.out.println("Detalles = " + detalles);
    }
}
