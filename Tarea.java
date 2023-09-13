package org.example;

public class Tarea {
    private String nombre;
    private String descripcion;

    public boolean estado;

    public Tarea(String nom, String descr) {
        nombre = nom;
        descripcion = descr;
        estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

