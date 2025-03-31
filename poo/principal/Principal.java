package ec.edu.ups.poo.principal;

import java.util.GregorianCalendar;
import java.util.Scanner;

import ec.edu.ups.poo.clases.Persona;

public class Principal {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Cuentas personas quieres ingresar: ");
        int numeroDePersonas = sc1.nextInt();
        Persona[] personas = new Persona[numeroDePersonas];

        System.out.println("Cuantos familiares quieres ingresar: ");
        int numeroDeFamiliares = sc1.nextInt();
        Persona.Familiar[] familiares = new Persona.Familiar[numeroDeFamiliares];

        for (int i = 0; i < numeroDePersonas; i++) {
            System.out.println("--- PERSONAS ---");
            System.out.print("Ingrese el numero de cedula: ");
            String cedula = sc1.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = sc1.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = sc1.next();
            sc1.nextLine();
            System.out.print("Ingrese la direccion: ");
            String direccion = sc1.nextLine();
            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }

        for (int i = 0; i < numeroDeFamiliares; i++) {
            System.out.println("--- FAMILIARES ---");
            System.out.print("Ingrese el numero de cedula: ");
            String cedula = sc1.next();
            System.out.print("Ingrese el nombre: ");
            String nombre = sc1.next();
            System.out.print("Ingrese el apellido: ");
            String apellido = sc1.next();
            sc1.nextLine(); // Limpiar el buffer
            System.out.print("Ingrese la direccion: ");
            String direccion = sc1.nextLine();
            System.out.print("Ingrese el parentesco: ");
            String parentesco = sc1.next();
            System.out.print("Ingrese el tipo de sangre: ");
            String tipoDeSangre = sc1.next();
            System.out.print("Ingrese el año de su Nacimiento: ");
            int aDeSuNacimiento = sc1.nextInt();
            System.out.print("Ingrese el mes de su nacimiento: ");
            int mDeSuNacimiento = sc1.nextInt() - 1;
            System.out.print("Ingrese el dia de su nacimiento: ");
            int dDeSuNacimiento = sc1.nextInt();
            GregorianCalendar fechaNacimiento = new GregorianCalendar(aDeSuNacimiento, mDeSuNacimiento, dDeSuNacimiento);
            familiares[i] = new Persona.Familiar(cedula, nombre, apellido, direccion, fechaNacimiento, parentesco, tipoDeSangre);
        }

        for (Persona persona : personas) {
            System.out.println("--- PERSONAS ---");
            System.out.println(persona);
        }

        for (Persona.Familiar familiar : familiares) {
            System.out.println("--- FAMILIARES ---");
            System.out.println(familiar);
        }

        sc1.close();
    }
}