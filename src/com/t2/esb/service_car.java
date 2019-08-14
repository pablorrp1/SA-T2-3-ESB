package com.t2.esb;

/**
 * service_Car
 * Clase que representa a los conductores de Uber
*/
public class service_car {

    /**
     * receive_request()
     * Simulación de recepción de solicitud para viaje del Uber
     * @return mensaje de solicitud
     */
    public String receive_request(){
        return "Solicitud recibida";
    }

    /**
     * car_accept()
     * Aleatoriamente dice el estado simulado del carro Uber
     * @return mensaje de estado del uber
    */
    public String car_accept(){
        double r = Math.floor(Math.random()*2);
        if(r<1){
            return "Carro no disponible";
        }else{
            return "Carro disponible";
        }
    }

    /**
     * pilot_warning()
     * Simula aviso al piloto del Uber
     * @return mensaje de aviso
     */
    public String pilot_warning(){
        return "Avisando a piloto";
    }

    /**
     * tracking()
     * Simula el estado actual del carro
     * @return estado del carro
     */
    public String tracking(){
        double r = Math.floor(Math.random()*2+1);
        if(r<=1) {
            return "En movimiento";
        }else{
            return "Parando";
        }
    }

    /**
     * destiny()
     * Simula la finalización del viaje
     * @return mensaje de finalizacion
     */
    public String destiny(){
        return "Ha llegado";
    }

}
