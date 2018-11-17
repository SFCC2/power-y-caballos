package modificable;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * * @author Sulay Cupitra
 * Manejo de Pilas y colas entregar
 * Asignatura: Sistemas 3
 */
public class Cola_Lista <T>{
    protected Cola_m cola;
    
    public Cola_Lista(){
        cola=null;
    }
    
    public void print(){
        Cola_m temporal;
        temporal = cola;
        if(temporal != null){
            while(temporal.siguiente != null){
                System.out.println(temporal.elemento);
                temporal = temporal.siguiente;
            }
            System.out.println(temporal.elemento);
        }
    }
    
    public void push(T indice){
        Cola_m nuevo;
        nuevo= new Cola_m(indice);
        Cola_m temporal;
        
        if(cola == null){
            cola = nuevo;
        }else{
            temporal = cola;
            
            while(temporal.siguiente != null){
                temporal = temporal.siguiente;
            }
            
            temporal.siguiente = nuevo;
        }
    }
    
    public void pop(){
        if(cola == null){
            return;
        }else{
            if(cola.siguiente == null){
                vaciarCola();
            }else{
                cola = cola.siguiente;
            }
        }
    }
    
    public void vaciarCola(){
        while (cola!=null) {            
            cola = null;
        }
    }
}

