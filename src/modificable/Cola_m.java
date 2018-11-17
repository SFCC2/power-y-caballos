package modificable;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sulay Cupitra
 * Manejo de Pilas y colas entregar
 * Asignatura: Sistemas 3
 */
public class Cola_m<T> {
    T elemento;
    Cola_m siguiente;
    public Cola_m(T indice) {
        this.elemento=indice;
        siguiente=null;
    }
}

