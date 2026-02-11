/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Punto {

    //Declaracion de atributos
    private String etiqueta;
    private int x;
    private int y;

    //Constructor
    public Punto(String etiqueta, int x, int y) {
        this.etiqueta = etiqueta;
        this.x = x;
        this.y = y;
    }

    //                  Metodos Get()
    public String getEtiqueta() {
        return this.etiqueta;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    //                  Metodos Set()
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //reprecentacion en formato (x,y)
    @Override
    public String toString() {
        return this.etiqueta + "(" + this.x + "," + this.y + ")";
    }
}
