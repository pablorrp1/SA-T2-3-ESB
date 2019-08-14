package com.t2.esb;

import java.util.ArrayList;

/**
 * esb_simulator
 * Clase que representa al simulador ESB
 * En esta clase se realizan las llamadas para la simulacion de los viajes Uber
 */
public class esb_simulator implements comando {
    private final ArrayList<service_client> cliente;
    private final ArrayList<service_car> uber;

    /**
     * esb_simulador()
     * Constructor de la clase
     * @param c : representa los clientes
     * @param u : representa los conductores
     */
    public esb_simulator(ArrayList<service_client> c, ArrayList<service_car> u){
        cliente=c;
        uber=u;
    }

    /**
     * ejecutar()
     * Implementacion de la clase comando y basada en el patron de diseñio comando
     * Simula una ejecucion de los servicios, pasando por algunas fases, como
     * la peticion de servicio, la busqueda de carro, la ubicacion del carro y la finalizacion del viaje
     */
    public void ejecutar(){
        for (service_client sc: cliente) {
            System.out.println(sc.request_service());
            for (service_car u:uber) {
                System.out.println(u.receive_request());
                String res = u.car_accept();
                if(res.equals("Carro no disponible")){
                    System.out.println("Buscando");
                }else{
                    System.out.println(res);
                    System.out.println(u.pilot_warning());
                    double r = Math.floor(Math.random()*20);
                    for(int i=0; i<r;i++){
                        System.out.println(u.tracking());
                    }
                    System.out.println(u.destiny());
                    System.out.println(sc.end_service());
                    break;
                }
            }

        }

    }

}
