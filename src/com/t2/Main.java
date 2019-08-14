package com.t2;
import com.t2.esb.*;

import java.util.ArrayList;

public class Main {
    private static comando esb;
    private static int num_clientes;
    private static int num_ubers;

    /**
     * setDefaultValues()
     * Define las variables iniciales del programa
     * Utilizado para simular el proceso de inscripcion de
     * conductores y de usuarios
     */
    private static void setDefaultValues(){
        ArrayList<service_client> clientes;
        ArrayList<service_car> ubers;
        clientes = new ArrayList<>();
        num_clientes = (int)(Math.random()*10)+1;
        for(int i=0;i<num_clientes;i++){
            service_client c = new service_client();
            clientes.add(c);
        }
        ubers = new ArrayList<>();
        num_ubers = (int)(Math.random()*20)+1;
        for(int j=0;j<num_ubers;j++){
            service_car c = new service_car();
            ubers.add(c);
        }
        esb = new esb_simulator(clientes,ubers);
    }

    /**
     * main()
     * Inicia la simulacion
     * @param args
     */
    public static void main(String[] args) {
        setDefaultValues();
        System.out.println("Clientes: "+num_clientes);
        System.out.println("Ubers: "+num_ubers);
        esb.ejecutar();
    }
}
