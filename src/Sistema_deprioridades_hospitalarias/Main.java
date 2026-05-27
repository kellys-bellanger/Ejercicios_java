package Sistema_deprioridades_hospitalarias;

import java.util.PriorityQueue;

//Clase Paciente
class Paciente implements Comparable<Paciente> {
    String nombre;
    int prioridad; // 1 = Emergencia, 2 = Urgente, 3 = Consulta general

    // Constructor normal
    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    // Este metodo es el que pide la guia para ordenar por gravedad
    @Override
    public int compareTo(Paciente otro) {
        if (this.prioridad < otro.prioridad) return -1;
        if (this.prioridad > otro.prioridad) return 1;
        return 0;
    }

    // Para que al imprimir el paciente no salga un codigo raro en consola
    @Override
    public String toString() {
        return nombre + " (Prioridad: " + prioridad + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        //Crear la cola de prioridad
        PriorityQueue<Paciente> listaHospital = new PriorityQueue<>();

        //Registrar los 6 pacientes
        listaHospital.add(new Paciente("Kellys", 1));   // Emergencia
        listaHospital.add(new Paciente("Keyssi", 1));   // Emergencia
        listaHospital.add(new Paciente("Carlos", 2));   // Urgente
        listaHospital.add(new Paciente("Ana", 2));      // Urgente
        listaHospital.add(new Paciente("Raul", 3));     // Consulta general
        listaHospital.add(new Paciente("María", 3));    // Consulta general

        System.out.println("PACIENTES REGISTRADOS EN ESPERA");
        System.out.println(listaHospital);
        System.out.println("Cantidad de pacientes: " + listaHospital.size());
        System.out.println("----------------------------------------\n");

        System.out.println("ORDEN DE ATENCION MEDICA");

        //Atender a todos uno por uno hasta que la cola quede vacia
        while (!listaHospital.isEmpty()) {
            //poll saca automaticamente al de mayor prioridad
            Paciente atendido = listaHospital.poll();
            System.out.println("Atendiendo a: " + atendido);
            System.out.println("Pacientes que quedan en sala: " + listaHospital.size());
            System.out.println("----------------------------------------");
        }
    }
}