package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class GestorTareas {
    public static void main(String[] args) {
        List<Tarea> listaTareas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
// Agregar tareas de ejemplo
        listaTareas.add(new Tarea("Hacer compras", "Comprar víveres para la semana"));
        listaTareas.add(new Tarea("Gacer compras", "Comprar víveres para la semana"));
        listaTareas.add(new Tarea("Sacer compras", "Comprar víveres para la semana"));
        listaTareas.add(new Tarea("Aacer compras", "Comprar víveres para la semana"));
        listaTareas.add(new Tarea("Racer compras", "Comprar víveres para la semana"));
        listaTareas.add(new Tarea("Bacer compras", "Comprar víveres para la semana"));
        listaTareas.add(new Tarea("Zacer compras", "Comprar víveres para la semana"));
        listaTareas.add(new Tarea("Nacer compras", "Comprar víveres para la semana"));

        listaTareas.add(new Tarea("Estudiar programación", "Preparar para el examen de Java"));
        listaTareas.add(new Tarea("Ejercicio físico", "Hacer ejercicio durante 30 minutos"));
        while (true) {
            System.out.println("----- Gestor de Tareas -----");
            System.out.println("1. Listar tareas pendientes");
            System.out.println("2. Listar tareas completadas");
            System.out.println("3. Contar tareas pendientes");
            System.out.println("4. Mostrar tareas ordenadas por nombre");
            System.out.println("5. Marcar tarea como completada");
            System.out.println("6. Eliminar tarea");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea en blanco
            switch (opcion) {
                case 1:

                    List<Tarea> tareasPendientes = listaTareas.stream().filter(tarea -> !tarea.isEstado()).toList();

                    System.out.println("Tareas pendientes: ");
                    tareasPendientes.forEach(x-> System.out.println(x.getNombre()));
                case 2:
                    List<Tarea> tareasCompletadas = listaTareas.stream().filter(tarea -> tarea.isEstado()).toList();

                    System.out.println("Tareas pendientes: ");
                    tareasCompletadas.forEach(x-> System.out.println(x.getNombre()));
                case 3:
                    long cantidad = listaTareas.stream().filter(tarea -> !tarea.isEstado()).count();
                    System.out.println("Cantidad tareas pendientes: " + cantidad);

                case 4:
                    Stream<Tarea> tareasOrdenadas = listaTareas.stream().sorted((Tarea a, Tarea b)->(a.getNombre()).compareToIgnoreCase(b.getNombre()));
                    tareasOrdenadas.forEach(x-> System.out.println(x.getNombre()));

                case 5:
//
                    break;
                case 6:

//Implementar Lógica
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}