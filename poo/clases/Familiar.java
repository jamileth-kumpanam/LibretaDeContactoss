package ec.edu.ups.poo.clases;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Familiar extends Persona {
    private String parentesco;
    private String tipoDeSangre;
    private GregorianCalendar fechaDeNacimiento;

    public Familiar(String cedula, String nombre, String apellido, String direccion, GregorianCalendar fechaDeNacimiento, String parentesco, String tipoDeSangre) {
        super(cedula, nombre, apellido, direccion);
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.parentesco = parentesco;
        this.tipoDeSangre = tipoDeSangre;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public GregorianCalendar getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int calcularEdad() {
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < fechaDeNacimiento.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + ", Parentesco: " + parentesco + ", Tipo de Sangre: " + tipoDeSangre + ", Edad: " + calcularEdad();
    }}