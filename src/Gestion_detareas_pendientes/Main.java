package Gestion_detareas_pendientes;

import java.util.Deque;
import java.util.LinkedList;

    public class Main {
        public static void main(String[] args) {

            Deque<String> listaTareas = new LinkedList<>();

            System.out.println("REGISTRANDO TAREAS EN EL SISTEMA");

            //Agregar tareas normales al final usando offerLast()
            System.out.println("Añadiendo normal: Revisar correos");
            listaTareas.offerLast("Revisar correos");

            System.out.println("Añadiendo normal: Actualizar reporte");
            listaTareas.offerLast("Actualizar reporte");

            //Agregar tareas urgentes al inicio usando offerFirst()
            System.out.println("Añadiendo URGENTE: Reiniciar servidor");
            listaTareas.offerFirst("Reiniciar servidor");

            System.out.println("Añadiendo URGENTE: Resolver caida del sistema");
            listaTareas.offerFirst("Resolver caida del sistema");

            //Mostrar el orden en que quedaron en la lista
            System.out.println("ORDEN DE EJECUCION DE LAS TAREAS");
            System.out.println(listaTareas);
            System.out.println("Total de tareas pendientes: " + listaTareas.size());
            System.out.println("----------------------------------------\n");

            System.out.println("--- PROCESANDO TAREAS UNA POR UNA ---");

            //Procesar las tareas desde el principio usando pollFirst hasta vaciar la lista
            while (!listaTareas.isEmpty()) {
                // pollFirst saca siempre la que esta al frente
                String tareaActual = listaTareas.pollFirst();
                System.out.println("[EJECUTANDO]: " + tareaActual);
                System.out.println("Tareas que quedan en espera: " + listaTareas.size());
                System.out.println("----------------------------------------");
            }

            System.out.println("\nTodas las tareas han sido procesadas.");
        }
    }