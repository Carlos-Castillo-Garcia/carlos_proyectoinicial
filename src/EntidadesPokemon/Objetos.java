/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesPokemon;

/**
 *
 * @author Manuel
 */
public class Objetos {
    private String objetos;
    private int dano;
    private int cantidad;

    public Objetos() {
    }

    public Objetos(String objetos, int dano, int cantidad) {
        this.objetos = objetos;
        this.dano = dano;
        this.cantidad = cantidad;
    }

    /**
     * @return the objetos
     */
    public String getObjetos() {
        return objetos;
    }

    /**
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param objetos the objetos to set
     */
    public void setObjetos(String objetos) {
        this.objetos = objetos;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Objetos{" + "objetos=" + objetos + ", dano=" + dano + ", cantidad=" + cantidad + '}';
    }

    
}
