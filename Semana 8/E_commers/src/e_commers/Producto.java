/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_commers;

import e_commers.Pagable;

/**
 *
 * @author gonza
 */
public class Producto implements Pagable{
// ===== Atributos =====   
private String nombre;
private double precio;

// ===== Constructores =====
public Producto() {
}

public Producto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
}

// ===== Getters & Setters =====
public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

// ===== Implementación de la Interfaz =====
@Override
public double calcularTotal() {
    return this.precio;
}
}
