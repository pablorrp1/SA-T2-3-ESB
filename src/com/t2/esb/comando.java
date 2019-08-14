package com.t2.esb;

/**
 * comando
 * Interface usada para pasar solicitudes del servicio
 * Usada en base al Patron de Disenio Command
 */
public interface comando {
    /**
     * ejecutar()
     * simulara la ejecucion de un comando
     */
    void ejecutar();
    //public void deshacer();
}
