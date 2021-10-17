package com.ufv;

public class Empleos {
    private String tipo;

    public Empleos(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Empleos{" +
                "miTipo='" + tipo + '\'' +
                '}';
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
