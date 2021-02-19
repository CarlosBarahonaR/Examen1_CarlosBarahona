/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_carlosbarahona;

/**
 *
 * @author Admin
 */
public class Usuarios {

    public String nombre;
    public String contraseña;
    public String admin;

    public Usuarios() {
    }

    public Usuarios(String nombre, String contraseña, String admin) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.admin=admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
    

    @Override
    public String toString() {
        return nombre;
    }

}
