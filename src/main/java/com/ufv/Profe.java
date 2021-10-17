package com.ufv;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Profe {
    private String nombre;
    private String apellido;
    private ArrayList<Empleos> empleos;

    public ArrayList<Empleos> getEmpleos() {
        return empleos;
    }

    public void setEmpleos(ArrayList<Empleos> empleos) {
        this.empleos = empleos;
    }

    public void addEmpleo(Empleos empleo) {
        this.empleos.add(empleo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Profe(String nombre, String apellido, ArrayList<Empleos> empleos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.empleos = empleos;
    }

    public Profe() {
    }

    @Override
    public String toString() {
        return "Profe{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", empleos=" + empleos +
                '}';
    }
}


