/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marlon
 */
public class TipoDesarrollador {
    private String nombre;
    private boolean web;
    private boolean java;
    private boolean cel;

    public TipoDesarrollador(String nombre, boolean web, boolean java, boolean cel) {
        this.nombre = nombre;
        this.web = web;
        this.java = java;
        this.cel = cel;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isWeb() {
        return web;
    }

    public boolean isJava() {
        return java;
    }

    public boolean isCel() {
        return cel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public void setJava(boolean java) {
        this.java = java;
    }

    public void setCel(boolean cel) {
        this.cel = cel;
    }
    
}
