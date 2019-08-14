package com.t2.esb;

/**
 * service_client
 * Clase que representa a los usuarios de Uber
 */
public class service_client {

    /**
     * request_service()
     * Simula el pedido de un Uber
     * @return mensaje de pedido
     */
    public String request_service(){
        return "Pidiendo servicio";
    }

    /**
     * end_service
     * Simula la finalizacion del viaje por parte del cliente
     * @return mensaje de finalizacion
     */
    public String end_service(){
        return "Servicio finalizado";
    }
}
