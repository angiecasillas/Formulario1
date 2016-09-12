package com.angiecasillas.formulario;

/**
 * Created by Usuario on 11/09/2016.
 */
public class Confirma_Datos {

    private String nombre;
    private String telefono;
    private String nacimiento;
    private String email;
    private String descripcion;

    public Confirma_Datos(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
