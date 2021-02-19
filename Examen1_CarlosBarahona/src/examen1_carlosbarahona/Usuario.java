/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_carlosbarahona;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Usuario {
    public int codigo;
    public String nombre;
    public String apellido;
    public int edad;
    public ArrayList<Libros> actualmente = new ArrayList();
    public ArrayList<Libros> prestados = new ArrayList();

    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String apellido, int edad, ArrayList<Libros> actualmente, ArrayList<Libros> prestados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.actualmente=actualmente;
        this.prestados=prestados;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libros> getActualmente() {
        return actualmente;
    }

    public void setActualmente(ArrayList<Libros> actualmente) {
        this.actualmente = actualmente;
    }

    public ArrayList<Libros> getPrestados() {
        return prestados;
    }

    public void setPrestados(ArrayList<Libros> prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
            
}
