package Gestion_deturnos_enunbanco;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //Cree la cola de clientes
        Queue<String> colaBanco = new LinkedList<>();

        colaBanco.offer("Kellys");
        colaBanco.offer("Keyssi");
        colaBanco.offer("Juan");
        colaBanco.offer("María");
        colaBanco.offer("Carlos");
        colaBanco.offer("Ana");
        colaBanco.offer("Raul");
        colaBanco.offer("Sofía");

        System.out.println("ATENCION EN EL BANCO");
        System.out.println("Clientes inicialmente en la cola: " + colaBanco);
        System.out.println("Cantidad de clientes que faltan ser atendidos: " + colaBanco.size());
        System.out.println("----------------------------------------\n");

        //Atender a los clientes hsta vaciar la cola
        while (!colaBanco.isEmpty()) {

            //Ver quien es el próximo en espera sin sacarlo de la cola usando peek
            String proximoEnEspera = colaBanco.peek();
            System.out.println("[EN ESPERA] El siguiente cliente a atender es: " + proximoEnEspera);

            //Atender al cliente (sacarlo de la cola) usando poll
            String clienteAtendido = colaBanco.poll();
            System.out.println("[ATENDIDO] Se ha atendido a: " + clienteAtendido);

            //Mostrar la cantidad de clientes que quedan usando el metodo sizee
            System.out.println("[ESTADO] Clientes restantes en la cola: " + colaBanco.size());
            System.out.println("----------------------------------------");
        }

        System.out.println("\nLa cola del banco está vacía.");
    }
}

