package Historial_de_Navegacion;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        //Creamos el Deque para el historial usando ArrayDeque
        Deque<String> historial = new ArrayDeque<>();

        System.out.println("HISTORIAL DE NAVEGACION");

        //Simular páginas visitadas usando addLast() (se van acumulando al final)
        System.out.println("-> Visitando: Google");
        historial.addLast("Google");

        System.out.println("-> Visitando: YouTube");
        historial.addLast("YouTube");

        System.out.println("-> Visitando: Moodle");
        historial.addLast("Moodle");

        //Mostrar el historial actual
        System.out.println("\n[HISTORIAL ACTUAL]: " + historial);
        //Usamos peekLast() para saber cuál es la página que estamos viendo ahorita
        System.out.println("Página actual en pantalla: " + historial.peekLast());
        System.out.println("------------------------------------------------");

        //Retroceder
        //Para retroceder, quitamos la última página visitada (Moodle) usando removeLast()
        System.out.println("\n[ACCIÓN]: El usuario hace clic en 'ATRÁS'");
        String paginaEliminada = historial.removeLast();
        System.out.println("Se eliminó del historial: " + paginaEliminada);

        //Mostrar cómo quedó el historial ahora
        System.out.println("[HISTORIAL ACTUAL]: " + historial);
        System.out.println("Página actual en pantalla: " + historial.peekLast());
        System.out.println("------------------------------------------------");

        //Avanzar
        System.out.println("\n[ACCIÓN]: El usuario decide avanzar a una nueva página");
        historial.addLast("GitHub");

        //Mostrar el estado final del historial
        System.out.println("[HISTORIAL FINAL]: " + historial);
        System.out.println("Página actual en pantalla: " + historial.peekLast());
        System.out.println("Cantidad de páginas en el historial: " + historial.size());
    }
}
