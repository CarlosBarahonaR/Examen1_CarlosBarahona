/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_carlosbarahona;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Libros {
    public String autores;
    public String titulo;
    public String genero;
    public String editoriales;
    public String idioma;
    public Date año;
    public int ISBN;
    public Date añoLib;
    public String estado;
    public String pprestado;
    public int ncuenta;

    public Libros() {
    }

    public Libros(String autores, String titulo, String genero, String editoriales, String idioma, Date año, int ISBN, Date añoLib, String estado, String pprestado, int ncuenta) {
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.editoriales = editoriales;
        this.idioma = idioma;
        this.año = año;
        this.ISBN = ISBN;
        this.añoLib = añoLib;
        this.estado = estado;
        this.pprestado = pprestado;
        this.ncuenta = ncuenta;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(String editoriales) {
        this.editoriales = editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Date getAñoLib() {
        return añoLib;
    }

    public void setAñoLib(Date añoLib) {
        this.añoLib = añoLib;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPprestado() {
        return pprestado;
    }

    public void setPprestado(String pprestado) {
        this.pprestado = pprestado;
    }

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
