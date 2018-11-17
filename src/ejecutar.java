
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Sulay Cupitra Manejo de Pilas y colas entregar Asignatura: Sistemas 3
 */
public class ejecutar {

    /*

    public static cola(){
        Cola_lista nueva= new Cola_lista();
        nueva.push(1);
        nueva.push(2);
        nueva.push(3);
        nueva.push(4);
        nueva.push(5);
        print(nueva.pop());
    }
    public static Pila(){
        pila
    }*/
    Cola_Lista cola_int = new Cola_Lista();
    Pila_Lista pila_int = new Pila_Lista();

    public static void main(String[] args) {
         ejecutar admin= new ejecutar();
        /*
        System.out.println("COLA");
        Cola_Lista nueva = new Cola_Lista();
        nueva.push(0);
        nueva.push(2);
        nueva.push(3);

        nueva.print();
        System.out.println("");

        nueva.pop();

        nueva.print();
        System.out.println("");

        System.out.println("PILA");
        Pila_Lista nuevalista = new Pila_Lista();
        nuevalista.push(0);
        nuevalista.push(2);
        nuevalista.push(3);

        nuevalista.print();
        System.out.println("");

        nuevalista.pop();

        nuevalista.print();
        System.out.println("");*/
admin.menu();
    }

    public void menu() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese:\n1) cola\n2) pila\n3) mostrar cola\n4) mostrar pila"));
        switch (opc) {
            case 1:
                Cola_int();
                //System.out.println("h");
               // menu();
                break;
            case 2:
                //System.out.println("o");
                pila_int();
                //menu();
                break;
            case 3:
               // System.out.println("l");
                Mostrar_cola();
                //menu();
                break;
            case 4:
                //System.out.println("a");
                Mostrar_pila();
                //menu();
                break;
            default:
                break;
        }
    }

    public void Cola_int() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cola"));
        for (int i = 0; i < opc; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cola"));
            cola_int.push(num);
        }
        menu();
    }

    public void pila_int() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cola"));
        for (int i = 0; i < opc; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cola"));
            pila_int.push(num);
        }
        menu();
    }

    public void Mostrar_pila() {
        System.out.println("Pila");
        pila_int.print();
        System.out.println("");
        menu();
    }

    public void Mostrar_cola() {
        System.out.println("Cola");
        cola_int.print();
        System.out.println("");
       menu();
    }
}
