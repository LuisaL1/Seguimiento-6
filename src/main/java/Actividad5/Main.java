package Actividad5;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ShiftInterface> shifts = new ArrayList<>();

        // Agregar algunos turnos
        shifts.add(new Shift(LocalTime.of(8, 0), LocalTime.of(12, 0), "Turno de la mañana"));
        shifts.add(new Shift(LocalTime.of(12, 0), LocalTime.of(16, 0), "Turno de la tarde"));
        shifts.add(new Shift(LocalTime.of(16, 0), LocalTime.of(20, 0), "Turno de la noche"));

        // Mostrar información de los turnos
        System.out.println("Información de los turnos:");
        for (ShiftInterface shift : shifts) {
            System.out.println(shift);
        }

        // Modificar la descripción del primer turno
        System.out.print("\nIngrese una nueva descripción para el primer turno: ");
        String nuevaDescripcion = scanner.nextLine();
        shifts.get(0).setDescripcion(nuevaDescripcion);

        // Mostrar información del primer turno después de modificar la descripción
        System.out.println("\nNueva descripción del primer turno: " + shifts.get(0));

        scanner.close();
    }
}

