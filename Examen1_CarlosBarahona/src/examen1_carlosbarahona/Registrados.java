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
public class Registrados extends Usuarios {
    public ArrayList<Usuarios> usuarios = new ArrayList();

    public Registrados() {
    }

    public Registrados(ArrayList<Usuarios> usuarios, String nombre, String contraseña) {
        super(nombre, contraseña);
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Registrados{" + "usuarios=" + usuarios + '}';
    }
    

    
    
    
}
